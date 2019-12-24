package chenP;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        //Initialise list
        new CustomList();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            //add test
            CustomList.add(random.nextInt(100));
            list1.add(random.nextInt(100));
        }
        list1.add(10, 666);
        list1.set(10, 666);
        printList(list1);
        list1.set(4, 12);
        //set test
        CustomList.set(0, 999);
        //get test
        System.out.println(CustomList.get(0));
        //string test
        System.out.println(CustomList.string());
        //size test
        System.out.println("size " + CustomList.size());
        //clear test
        CustomList.clear();
        System.out.println(CustomList.string());
        //size test
        System.out.println("size " + CustomList.size());
        //isEmpty test
        System.out.println(CustomList.isEmpty());

        //опциональные

        for (int i = 0; i <= 10; i++) {
            //add test
            CustomList.add(i);
        }
        System.out.println(CustomList.string());
        //add (index,value) test
        CustomList.add(5, 5);
        System.out.println(CustomList.string());
        //remove (index,value) test
        CustomList.remove(0);
        System.out.println(CustomList.string());
        //removeByValue test
        CustomList.removeByValue(5);
        System.out.println(CustomList.string());
        //toArray test
        int[] arr = CustomList.toArray();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < CustomList.size(); i++) {
            //add test
            CustomList.set(i, random.nextInt(10));
        }
        //sort test
        System.out.println(CustomList.string());
        CustomList.sort();
        System.out.println(CustomList.string());
//toString test
//        System.out.println(CustomList.toString());
    }

    private static void printList(List<Integer> list) {
        System.out.println(list);
    }
}

