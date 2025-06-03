package colection;

import java.util.ArrayList;

public class TaskTwo {
    public static void arrayFor(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("===========================");
    }

    public static void arrayForEach(ArrayList<Integer> arrayList) {
        for (Integer num : arrayList) {
            System.out.println(num);
        }
        System.out.println("===========================");
    }

    public static void arrayWhile(ArrayList<Integer> arrayList) {

        int i = 0;
        while (i < arrayList.size()) {
            System.out.println(arrayList.get(i));
            i++;
        }
    }
}