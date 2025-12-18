import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int res = fact(n);
//        System.out.println(res);
        boolean res = Palindrome(n);
        System.out.println(res);
    }

    static int fact(int n){
        int val = 1;
        if(n == 0 || n == 1) {
            return val;
        }
        while(n > 1){
            val = val * n;
            n--;
        }
        return val;
    }

    static boolean Palindrome(int num){
        int original = num;
        int rev = 0;

        while(num > 0){
            int val = num % 10;
            num = num / 10;
            rev = rev * 10 + val;
        }

        return rev == original;
    }
}
