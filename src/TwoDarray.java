import java.util.*;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n and m");
        int n = sc.nextInt();
        int m = sc.nextInt();


        int[][] arr = new int[n][m];
        //Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == x) {
                    System.out.print("x is found at(" + i + ","+j+")");

                }


            }
        }
    }
}
