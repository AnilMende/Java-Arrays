import java.util.Scanner;

public class DigitPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
//        int res = 1;
//        while(num > 0){
//            int val = num % 10;
//
//            res = res * val;
//            num /= 10;
//        }
//
//        System.out.println("The product of digits is" + " " + res);

        int res = 0;

        while(num > 0){
            int val = num % 10;
            res += val;
            num /= 10;
        }
        System.out.println("The Sum is " + " " + res);
    }
}
