import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};
        //swap(arr,1,4);
        //System.out.println(Arrays.toString(arr));
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int []arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int[] Reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
