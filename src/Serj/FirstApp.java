package Serj;

public class FirstApp {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float f = 0.20f;
        double g = 440.40;
        boolean tf = true;
        char ch = 's';

        System.out.println(a);
        System.out.println(b);
        System.out.println(calculate(2, 2, 10, 3));
        System.out.println(task10and20(4, 6));
        isPositiveOrNegative(5);
        System.out.println(isNegative(-15));
        hello("Андрей");

    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }


    public static boolean task10and20(int x, int y) {
        return (10 <= x + y) && (x + y <= 20);
    }


    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(x + " is positive");
        } else {
            System.out.println(x + " is negative");
        }
    }

    public static boolean isNegative(int g) {
        if (g < 0) {
            return true;
        } else {
            return false;
        }
    }

        public static void hello(String name) {
            System.out.println("Привет " + name + "!"); }
        }

