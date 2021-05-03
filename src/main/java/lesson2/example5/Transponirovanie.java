package lesson2.example5;

public class Transponirovanie {
    public static void main(String[] args) {
        int n = (int)(3 + Math.random() * 3);
        int m = (int)(3 + Math.random() * 3);
        System.out.println(n);
        System.out.println(m);

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 15);

            }

        }

        for (int[] y : arr) {
            for (int x : y) {
                System.out.print(x + " ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }

        for (int[] y : arr) {
            for (int x : y) {
                System.out.print(x + " ");
            }
            System.out.println();

        }

    }
}
