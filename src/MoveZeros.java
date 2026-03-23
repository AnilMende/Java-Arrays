public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int res[] = moveZeros(arr);

        for(int i=0;i < res.length;i++){
            System.out.println(res[i]);
        }
    }

    //Fast-Slow pointer Pattern
    static int[] moveZeros(int arr[]){

        int i = 0;
        int j = 0;

        while(i < arr.length){
            if(arr[i] == 0){
                i++;
            }
            else if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }

        return arr;

    }
}
