import java.io.*;
import java.util.*;
public class PasswordStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password");
        String password = sc.next();
        if(password.contains(" ")){
            System.out.println("Invalid Password");
            return;
        }
        boolean hasAtleat8Chars = password.length() >= 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for(int i = 0; i< password.length();i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
            else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }
            else if(Character.isDigit(ch)){
                hasDigit = true;
            }
            else{
                hasSpecialChar = true;
            }
        }

        boolean isStrongPassword = hasAtleat8Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        if(isStrongPassword){
            System.out.println(password + " is a Strong Password");
        }
        else{
            System.out.println(password + " is a Weak Password");
        }

    }


}
