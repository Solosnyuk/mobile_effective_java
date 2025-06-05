package colection;

public class TaskFive {
    public static int sumDeepArray (String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер не соотвествует 4х4.");
        }
        int summ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summ += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать в Integer: " + i + ", " + j);
                }
            }
        }
        System.out.println("Сумма чисел из массива 4х4:");
        return summ;
    }
}