package Serj;

public class Class2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }
        System.out.println();

        int[] x = new int[8];
        for (int i = 0; i < x.length; i++) {
            x[i] = 3 * i;
            System.out.println(x[i]);
        }
        System.out.println();

        int[] y = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < y.length; i++) {
            if (y[i] < 6) {
                y[i] = y[i] * 2;
            }
            System.out.println(y[i]);
        }
        System.out.println();

        int[][] arr2 = new int[6][6];
        for (int j = 0; j < arr2.length; j++) {
            for (int w = 0; w < arr2[j].length; w++) {
                if (j == w) {
                    arr2[j][w] = 1;
                }
                System.out.print(arr2[j][w]);
            }
            System.out.println();
        }

    }

}


