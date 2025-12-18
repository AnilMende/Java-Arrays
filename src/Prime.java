import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        boolean res = isPrime(n);
//        System.out.println(res);

        //System.out.println(isArmstrong(n));

        //printing all the 3 digit armstrong numbers
        for(int i=100;i < 1000;i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }

//    static boolean isPrime(int n){
//
//        if(n <= 1){
//            return false;
//        }
//        int c = 2;
//        while(c * c <= n){
//            if(n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        return c * c > n;

    static boolean isArmstrong(int n){
        int originalNum = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }

        return sum == originalNum;
    }
}
