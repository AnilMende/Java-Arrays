public class RemoveDuplicatesinSortedArr {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3};

        int res[] = removeDuplicates(arr);
        for(int i=0;i < res.length;i++){
            System.out.println(res[i]);
        }

    }

    static int[] removeDuplicates(int arr[]){

        int j = 0;
        int i = 1;

        while(i < arr.length){
            if(arr[i] == arr[j]){
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j+1];
                arr[j+1] = temp;
                i++;
                j++;
            }
        }

        return arr;
    }


//    When Order matters don't swap , just overwrite
    static int removeDuplicates2(int arr[]){

        int j = 0;
        for(int i=1;i < arr.length;i++){
            if(arr[i] != arr[j]){
                arr[j + 1] = arr[i];
                j++;
            }
        }

        return j+1;
    }
}
