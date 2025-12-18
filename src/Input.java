import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //int arr[] = new int[5];

        //input using for loops
        //for(int i=0;i < arr.length;i++){
        //    arr[i] = in.nextInt();
        //}

        //printing array
        //for(int i=0;i < arr.length;i++){
        //    System.out.println(arr[i] + "");
        //}
        //for each loop
        //for(int num : arr){
        //    System.out.println(num);
       // }

        // to print array
       // System.out.println(Arrays.toString(arr));

        // MultiDimensional Array

        int arr[][]= new int[3][3];

        for(int row=0;row < arr.length;row++){
            for(int col=0;col < arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        ///printing the array
        //for(int row=0;row < arr.length;row++){
        //    for(int col=0;col < arr[row].length;col++){
        //        System.out.print(arr[row][col] + " ");
        //    }
        //    System.out.println();
        //}

        //for(int row=0;row < arr.length;row++){
        //    System.out.println(Arrays.toString(arr[row]));
       // }

        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
