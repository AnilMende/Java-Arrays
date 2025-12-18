import java.util.Scanner;

public class twodArraysjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        //Input
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int x = 9;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == x){
                    System.out.print("Element is found at index (" + i + " ," + j + ")");
                }
            }
        }
    }
}
