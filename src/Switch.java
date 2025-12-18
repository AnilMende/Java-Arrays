import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();


//        String fruit = "mango";
//        String fruit2 = "mango";

//        if(fruit.equals("mango")){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }

//        if(fruit == fruit2){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }

        switch (fruit){
            case "Mango":
                System.out.println("King of Fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Grape":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Please Enter a valid fruit");
        }
    }
}
