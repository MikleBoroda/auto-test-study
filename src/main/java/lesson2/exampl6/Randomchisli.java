package lesson2.exampl6;

public class Randomchisli {

    public static void main(String[] args) {
        int n = (int) (3 + Math.random() * 3);
        int m = (int) (3 + Math.random() * 3);

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }

        int u = (int) (1 + Math.random() * (n - 2));
        int p = (int) (1 + Math.random() * (m - 2));
        arr[u][p] = 2;

        System.out.println("Исходный масиив");

        for (int[] y : arr) {
            for (int x : y) {
                System.out.print(x + " ");
            }
            System.out.println();
        }


        int invertion = 0;
        boolean bol = false;
        int[][] destMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) {
                    destMatrix[i][j] = 2;
                    invertion = 1;
                    bol = true;
                    continue;
                } else
                    destMatrix[i][j] = bol
                            ? (arr[i][j] + 1) % 2
                            : arr[i][j];
            }
        }
        System.out.println();

        System.out.println("Конечный массив");

        for (int[] row : destMatrix) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }


    }
}
