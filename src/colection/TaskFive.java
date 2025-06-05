package colection;

import java.util.Arrays;

public class TaskFive {
    public static int sumDeepArray (String[][] array) {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер двойного массива не соотвествует 4х4.");
        }
        int summ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summ += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не верные данные! Элемент: " + array[i][j] + ", не является числом." +
                            "\n Находящийся в "+ ( i + 1) + " блоке: " + Arrays.toString(array[i]) );
                }
            }
        }
        System.out.println("Сумма чисел из массива 4х4:");
        return summ;
    }
}