package colection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskFour {
    public static void arrayListToFilterSummPrint(Integer[] arr) {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(arr));

        List<Integer> evenNumb = numList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> multiNum = numList.stream()
                        .map(n -> n * 2)
                        .collect(Collectors.toList());

        Integer summ = numList.stream()
                        .reduce(0,Integer::sum);

        System.out.println("Четные числа: " + evenNumb);
        System.out.println("Умноженые на два: " + multiNum);
        System.out.println("Сумма чисел: " + summ);
        System.out.println("===========================");
    }
}
