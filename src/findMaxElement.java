public class findMaxElement {
    public static void main(String[] args) {

        int arr[] = {1,2,5,7,4,5};
        System.out.println("Max Element is " + maxElement(arr));
    }

    static int maxElement(int arr[]){

        int max = Integer.MIN_VALUE;

        for(int i=0;i < arr.length;i++){
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
