import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        System.out.println("Enter Operator");
        char ch = sc.next().trim().charAt(0);

        while(true){
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){

                System.out.println("Enter Num1");
                int num1 = sc.nextInt();
                System.out.println("Enter Num2");
                int num2 = sc.nextInt();

                if(ch == '+'){
                    ans = num1 + num2;
                }
                else if(ch == '-'){
                    ans = num1 - num2;
                }
                else if(ch == '*'){
                    ans = num1 * num2;
                }
                else if(ch == '/'){
                    if(num2 > 0){
                        ans = num1 / num2;
                    }
                }
               else if(ch == '%'){
                    ans = num1 % num2;
                }
               else if(ch == 'x' || ch == 'X'){
                   break;
                }
               else {
                    System.out.println("Invalid Operation");
                }
            }
            System.out.println("The result is" + " " + ans);
        }
    }
}
