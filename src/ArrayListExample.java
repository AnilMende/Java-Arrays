import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(9);
//        list.add(0);
//        list.add(7);
//        list.add(7);
        //System.out.println(list);
//        System.out.println(list.contains(56));
//        System.out.println(list.remove(2));
//        System.out.println(list);

        //input
        for(int i=0;i < 5;i++){
            list.add(in.nextInt());
        }

        //get an element with index
        for(int i=0;i < 5;i++){
            System.out.println(list.get(i));
        }
    }
}
