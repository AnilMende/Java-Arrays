import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cycle sort for range 1 to N
        //int n = sc.nextInt();
        int arr[]={3,0,1};
        int n = arr.length;

        //for(int i=0;i<n;i++){
        //    arr[i] = sc.nextInt();
       // }

        //for(int i=0;i<n;i++){
          //  System.out.print(arr[i]);
        //}
        //int index = 0;
        //while(index < n){
          //  int element = arr[index];
            //int actpos = element - 1;
            //int actpos = element;// for 0 to N
            //if(arr[index] < n && arr[index] != actpos){
              //  int temp = arr[index];
                //arr[index] = arr[actpos];
                //arr[actpos] = temp;
            //}
            //else{
              //  index++;
            //}
        //}
        int epectsum = 0;
        int sum = n*(n+1)/2;
        for(int i=0;i<n;i++){
            epectsum += arr[i];
        }
        int ans = sum - epectsum;
        System.out.println("The missing element is " +ans);
    }
}
