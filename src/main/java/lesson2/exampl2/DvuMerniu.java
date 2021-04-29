package lesson2.exampl2;


public class DvuMerniu {
    // Через While
    void dvuhWhile(int[][] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr.length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;

        }
    }


    // цикл For
    void dvuhFor(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    // вывод через Foreach
    void dvuhForEach(int[][] arr) {
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        DvuMerniu dvuMerniu = new DvuMerniu();
        int[][] dvuhMerMas = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0) dvuhMerMas[i][j] = 0;
                else dvuhMerMas[i][j] = 1;
            }
        }


        dvuMerniu.dvuhFor(dvuhMerMas);
        System.out.println();
        dvuMerniu.dvuhForEach(dvuhMerMas);
        System.out.println();
        dvuMerniu.dvuhWhile(dvuhMerMas);


    }
}
