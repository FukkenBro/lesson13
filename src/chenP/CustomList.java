package chenP;

import java.util.Arrays;

public class CustomList {

    public static int[] arr = new int[0];

    public static int[] getArr() {
        return arr;
    }

    public CustomList() {

    }

    public CustomList(int[] arr) {
        this.arr = arr;
    }

    public static int get(int index) {
        try {
            if (indexValidator(index) >= 0) {
                return arr[index];
            } else {
                indexError();
                return Integer.parseInt(null);
            }
        } catch (Exception e) {
            System.out.println("get method error");
            return Integer.parseInt(null);
        }
    }

    public static void set(int index, int value) {
        try {
            if (indexValidator(index) >= 0) {
                arr[index] = value;
            } else {
                indexError();
            }
        } catch (Exception e) {
            System.out.println("set method error");
        }
    }

    public static void add(int value) {
        try {
            add(size(), value);
        } catch (Exception e) {
            System.out.println("add method error");
        }
    }

    public static void clear() {
        arr = new int[0];
    }

    public static int size() {
        return arr.length;
    }

    public static boolean isEmpty() {
        return size() == 0;
    }

    // опционально

    public static void add(int index, int value) {
        try {
            if (arr.length == 0) {
                int[] tmp = new int[1];
                tmp[0] = value;
                arr = tmp;
                return;
            }
            if (indexValidator(index) >= 0) {
                if (size() == 0) {
                    int[] tmp = new int[1];
                    tmp[0] = value;
                    arr = tmp;
                    return;
                }
                int[] tmp = new int[size() + 1];
                System.arraycopy(arr, 0, tmp, 0, index);
                tmp[index] = value;
                System.arraycopy(arr, index, tmp, index + 1, size() - index);
                arr = tmp;
            } else {
                indexError();
            }
        } catch (Exception e) {
            System.out.println("add method error");
        }
    }

    public static void remove(int index) {
        try {
            if (indexValidator(index) >= 0) {
                int[] tmp = new int[arr.length - 1];
                System.arraycopy(arr, 0, tmp, 0, index);
                System.arraycopy(arr, index + 1, tmp, index, arr.length - index - 1);
                arr = tmp;
                return;
            }
            System.out.println("Invalid index");
        } catch (Exception e) {
            System.out.println("remove method error");
        }
    }

    public static void removeByValue(int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    remove(i);
                    removeByValue(value);
                }
            }
        } catch (Exception e) {
            System.out.println("remove method error");
        }
    }

    public static int[] toArray() {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void sort() {
        Arrays.sort(arr);
    }

    private static void indexError() {
        System.out.println("invalid index");
    }

    private static int indexValidator(int index) {
        try {
            if (index > 0 && index <= size()) {
                return 1;
            }
            if (index == 0) {
                return 0;
            }
            if (index < 0) {
                return -1;
            }
            if (index > size()) {
                return -2;
            } else {
                System.out.println("validator error");
                return -3;
            }
        } catch (Exception e) {
            System.out.println("validator error");
            return -3;
        }
    }

    @Override
    public String toString() {
        return "CustomList{}" + Arrays.toString(getArr());
    }

    public static String string() {
        return "CustomList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}



