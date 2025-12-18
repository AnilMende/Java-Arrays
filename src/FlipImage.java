import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
     //int arr[][] = {
     //          {1,2,3,4},
        //          {4,5,6,7},
     //          {7,8,9,10}
     //   };

        int nums[][] = {
                {1,0,1},
                {0,1,0},
                {0,0,0}
        };

        //Invert(nums);
        //for(int row=0;row < nums.length;row++){
         //   System.out.println(Arrays.toString(nums[row]));
        //}

       //Flip(nums);
       Invert(nums);
       for(int row=0;row < nums.length;row++){
           System.out.println(Arrays.toString(nums[row]));
     }

//        for(int row = 0;row < nums.length;row++){
//            SingleFlip(nums[row]);
//            System.out.println(Arrays.toString(nums[row]));
//        }

    }

    static int [][] Flip(int arr[][]){
        //row length
        int n = arr.length;
        for(int row=0;row < n;row++){
            //we only iterate to the middle element so arr[row].length / 2
            for(int col =0;col < arr[row].length / 2;col++){
                //column length
                int cols = arr[row].length;
                //[cols-1-col] gives the column element we need to swap
                //with the current [row][col] element based on col value or column
                int temp = arr[row][col];
                arr[row][col] = arr[row][cols - 1-col];
                arr[row][cols - 1- col] = temp;
            }
        }
        return arr;
    }

    static void SingleFlip(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    static int [][] Invert(int nums[][]){

        for(int row=0;row < nums.length;row++){
            //Here we are passing reference so changes made by method will
            // be visible in the original array it applicable only for the objects in java
            SingleFlip(nums[row]);
            for(int col=0;col < nums[row].length;col++){
                if(nums[row][col] == 1){
                    nums[row][col] = 0;
                }
                else{
                    nums[row][col] = 1;
                }
            }
        }
        return nums;
    }
}
