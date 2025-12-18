import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//       int ans = sum();
//        System.out.println(ans);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = input.nextInt();
        System.out.println("Enter num2");
        int num2 = input.nextInt();

        int ans = sum2(num1,num2);
//        int ans = sum2(1,2)
        System.out.println(ans);
    }

    // passing the arguments from the main while calling it in the main
    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2");
        int num2 = sc.nextInt();

        int res = num1 + num2;

        return res;
    }
}
