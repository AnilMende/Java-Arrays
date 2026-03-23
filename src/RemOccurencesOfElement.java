public class RemOccurencesOfElement {
    public static void main(String[] args) {

        int arr[] = {3,2,2,3};
        int val = 3;

        System.out.println(removeOccurences(arr,val));
    }
    //Fast and Slow pointer Pattern
    static int removeOccurences(int arr[], int val){
        int j = 0;
        for(int i=0;i < arr.length;i++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }
}
