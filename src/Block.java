import java.util.Arrays;
import java.util.Scanner;

public class Block {
    public static void main(String[] args) {
        // 1 задание
        Change();
        // 2 задание
        Create();
        // 3 Задание
        ElementMultiplication();
        // 4 Задание
        Diagonal();
        // 5 задание
        MinMaxElement();
        // 6 задание
        System.out.println("Check left and right balance of array - Task 6");
        int length = (int) Math.round((Math.random()*6));
        int[] arr = new int [length];
                for (int i =0;i<length; i++) {
                    arr[i] = (int) Math.round((Math.random()*5));
                    System.out.print(arr[i] + " ");
                }
        System.out.println(checkbalance(arr));
        //Задание 7
        System.out.println("Modificate Array = Task№7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        Modificate(arr,n);

    }
    static void Change() {
        int [] array = new int[10];
        System.out.println("Change array - Task№1");
        System.out.print("Before: ");
        for (int i =0; i<array.length; i++) {
            array[i] = (int) Math.round((Math.random()));
            System.out.print(array[i]);
            if (array[i]==0) array[i] =1;
            else array[i] = 0;
        }
        System.out.print("\nAfter: ");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]);
        }
    }
    static void Create() {
        System.out.println("\nArray initialization - Task№2");
        int j =0;
        int[] array = new int[8];
        for (int i=0; i<array.length; i++,j+=3){
            array[i] = j;
            System.out.print(array[i] + " ");
        }
    }
    static void ElementMultiplication () {
        System.out.println("\nMultiplication - Task№3");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Before: ");
        for (int i =0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nAfter: ");
        for (int i =0; i<array.length; i++){
            if (array[i]<6) array[i] *=2;
            System.out.print(array[i] + " ");
        }

    }

    static void Diagonal () {
        int length = (int) Math.round((Math.random()*10));
        int[][] array = new int[length][length];
        for (int i=0; i<length; i++){
            for (int j=0; j<length; j++) {
                if ((i==j)||(i==length-1-j)) {
                    array[i][j] =1;
                }
            }
        }
        //check
        System.out.println("\nDiagonal Check - Task№4");
        for (int i=0; i<length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
    static void MinMaxElement () {
        int length = (int) Math.round((Math.random()*10));
        int[] array = new int[length];
        int min = array[0];
        int max=array[0];
        System.out.println("\nFind Min and Max - Task№5");
        System.out.println("Our array");
        for (int i =0; i<length; i++){
            array[i] = (int) Math.round((Math.random()*30)-15);
            System.out.print(array[i] + " ");
            if (min>array[i]) min = array[i];
            if (max<array[i]) max = array[i];
        }
        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);
    }

    public static boolean checkbalance(int[] array){
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < array.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }

            for (int j = i; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
    static void Modificate(int[]array, int n){

        System.out.println("Before modificate");
        for (int i =0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }

        if (n>0) {
            for (int i =0; i<n; i++) {
                int shift = array[array.length-1];
                for (int j = array.length-1; j>0; j--) {
                    array[j] = array[j-1];
                }
                array[0] = shift;
            }

            } else if (n<0) {
            for (int i= 0; i<n*(-1); i++) {
                int shift = array[0];
                for (int j=0; j< array.length-1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = shift;
            }
        }
        System.out.println("\nAfter modificate ");
        for (int i =0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
