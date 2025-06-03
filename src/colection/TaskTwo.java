package colection;

import java.util.ArrayList;

public class TaskTwo {
    public static void arrayFor(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("===========================");
    }

    public static <T> void arrayForEach(ArrayList<T> arrayList) {
        for (T item : arrayList) {
            System.out.println(item);
        }
        System.out.println("===========================");
    }

    public static void arrayWhile(ArrayList arrayList) {

        int i = 0;
        while (i < arrayList.size()) {
            System.out.println(arrayList.get(i));
            i++;
        }
    System.out.println("===========================");
    }
}