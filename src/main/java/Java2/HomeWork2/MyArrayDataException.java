package Java2.HomeWork2;

public class MyArrayDataException extends Exception {
    int n;
    int d;

    public MyArrayDataException (int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Значение в ячейке (" + n + ", " + d + ") не удалось преобразовать в int";
    }

}

