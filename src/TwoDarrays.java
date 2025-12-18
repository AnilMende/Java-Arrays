import java.util.Scanner;
public class TwoDarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] numbers = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose is: ");
        //int x = sc.nextInt();
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                //if(numbers[i][j]==x){
                    System.out.println(numbers[i][j]+" ");
                }
            }
        }
    }
