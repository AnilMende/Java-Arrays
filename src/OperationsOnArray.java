import java.util.Arrays;

public class OperationsOnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,0,0};
        operations(arr);
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Applying Operations
    //nums[i] == nums[i+1]
    //set nums[i] to nums[i] * 2
    //set nums[i+1] to 0
    static void operations(int arr[]){
        for(int i=0;i < arr.length - 1;i++){
            if(arr[i] == arr[i+1]){
                arr[i] = arr[i] * 2;
                arr[i+1] = 0;
            }
        }
    }

    //Moving Zeros to the end
    //if the elememt is non zero move it to left
    // then move i to right
    static int[] moveZeros(int arr[]){
        int i = 0;
        for(int j=0;j < arr.length;j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }
}
