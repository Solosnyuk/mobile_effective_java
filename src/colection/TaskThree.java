package colection;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskThree {
    public static <T> ArrayList<T> convertToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
