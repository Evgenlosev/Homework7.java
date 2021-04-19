package Java2.HomeWork2;

public class ExeptionsExpiriments {
    public static void main(String[] args) {
        try {
        int sum = elementsSum(new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        });
        System.out.println("Сумма элементов равна: " + sum);
        } catch (MySizeArrayException e) {
            e.printStackTrace();
            System.out.println("Размер массива не равен 4 на 4");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int elementsSum (String array[][]) throws MyArrayDataException, MySizeArrayException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new MySizeArrayException();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int a = Integer.parseInt(array[i][j]);
                    sum += a;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
