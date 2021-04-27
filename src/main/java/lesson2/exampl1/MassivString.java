package lesson2.exampl1;

public class MassivString {

    void massivFor(String[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    void massivForEach(String [] arr){
        for (String a: arr) {
            System.out.print(a + " ");
            
        }
    }

    void massivWhile(String[] arr){
        int i = 0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        MassivString massivString = new MassivString();
        String[] arr1 = new String[] {"Пятница", "это", "лучший", "день", "недели"};
        massivString.massivFor(arr1);
        System.out.println();
        massivString.massivForEach(arr1);
        System.out.println();
        massivString.massivWhile(arr1);


    }


}
