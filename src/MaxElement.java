public class MaxElement {

    public static void main(String[] args) {
        int arr[] = {23,13,67,95,67,76};

       // System.out.println("The max element is " + Max(arr));
        System.out.println("The max element in Range is " + MaxRange(arr,0,2));
    }

    static int Max(int arr[]){
        //int max = Integer.MIN_VALUE;
        //for(int num : arr){
        //    max = Math.max(num, max);
        //}
        //assuming array is not empty
        int max = arr[0];
        for(int i=0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int MaxRange(int arr[], int start, int end){

        if(arr.length == 0){
            return -1;
        }
        int max = arr[start];

        for(int i=start; i <= end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
