package lesson5.task1;


import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int m = new Random().nextInt(5) + 5;
        int n = new Random().nextInt(5) + 5;
        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] result = new int[m][n];

        for (int i = 0; i < dividends.length; i++) {
            dividends[i] = new Random().nextInt(4) + 5;
        }

        for (int i = 0; i < dividers.length; i++) {
            dividers[i] = new Random().nextInt(3);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    result[i][j] = dividends[i] / dividers[j];

                } catch (ArithmeticException e) {
                    result[i][j] = -1;
                }
            }
        }

        for (int resultDividends : dividends) {
            System.out.print(resultDividends + " ");
        }
        System.out.println();
        for (int resultDividers : dividers) {
            System.out.print(resultDividers + " ");
        }
        System.out.println();
        System.out.println("Вывод результата двумерного массива");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
