import java.util.Stack;

public class StacksPractice {
    public static void main(String[] args) {
//          stack Last In First Out
        Stack<String> stack = new Stack<String>();

        stack.push("Thor");
        stack.push("IrnonMan");
        stack.push("Hulk");
        stack.push("Thanos");

//        String SuperVillain = stack.pop();
        System.out.println(stack);
//        System.out.println("Super villain is" +" " +  SuperVillain);
        System.out.println(stack.peek());

        System.out.println(stack.search("Thor"));
        System.out.println(stack.size());
    }
}
