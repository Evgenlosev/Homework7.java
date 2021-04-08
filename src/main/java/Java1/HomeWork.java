package Java1;

public class HomeWork {
    //Задание 1
    public static void main(String[] args) {

        //Задание 2
        byte val1 = 12;
        short val2 = -15278;
        int val3 = 100;
        long val4 = 100000000L;
        float val5 = 3.14f;
        double val6 = 258.5421;
        char val7 = '*';
        boolean val8 = true;


    }

        //Задание 3
        public static float calculate(float a, float b, float c, float d) {
            return a * (b + (c / d));
        }

        //Задание 4
        public static boolean proverka(int a, int b) {
            return ((a+b) >= 10 & (a+b) <= 20);

        }

        //Задание 5
        public static void proverka2(int a) {
            if (a >= 0) {
                System.out.println("Число положительное");
            } else
                System.out.println("Число отрицательное");
        }

        //Задание 6
        public static boolean proverka3(int a) {
            return (a < 0);
        }

        //Задание 7
        public static void privetstvie(String name) {
            System.out.println("Привет, "+ name + "!");
        }

        //Задание 8
        public static void visokosniyGod(int a) {
            if ((a % 4 == 0) & ((a % 100 != 0) | (a % 400 == 0))) {
                System.out.println("Год високосный");
            } else
                System.out.println("Год не високосный");
        }

}
