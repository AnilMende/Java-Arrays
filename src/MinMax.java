import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //int maxValue = MaxNum(a,b,c);
        //System.out.println("Max of 3 nums " +"" +  maxValue );
        int minValue = MinNum(a,b,c);
        System.out.println("Min of 3 nums is" + "" + minValue);
    }
    //for Max in 3 numbers
    static int MaxNum(int a,int b,int c){
        return Math.max(c, Math.max(a,b));
    }

    static int MinNum(int a,int b, int c){
        return Math.min(c,Math.min(a,b));
    }
}
