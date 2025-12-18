import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;
//        while(count != 5){
//            System.out.println(count);
//            count++;
//        }

//        for(int i=1; i < 5; i++){
//            System.out.println(count);
//            count++;
//        }

//        for(int i=1; i <= 5;i++){
//            for(int j=1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //print numbers from 1 to n

//        int n = sc.nextInt();
//
//        for(int num = 1; num <= n; num++){
//            System.out.print(" " + num + " ");
//        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println(max);
    }
}
