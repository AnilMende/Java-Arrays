import java.util.Stack;

public class Stackpractice {
    public static void main(String[] args) {
        //follows LIFO order

        //System.out.println(stack);
        //System.out.println(stack.search(6));
        //System.out.println(stack.peek());
        //System.out.println(stack.isEmpty());

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack);
        int el = stack.peek();
        System.out.println(el);

        Stack<Integer> stack1 = new Stack<>();
        int arr[] = {2,3,4,5,6,7,8};
        for(int num : arr){
            if(num % 2 != 0){
                stack1.push(num);
            }
        }
        System.out.println("The elements of new stack are"+ stack1);
        System.out.println(stack1.size());
        int top = stack1.peek();
        System.out.println(top);
        System.out.println(stack1.pop());
        System.out.println(stack1);

        System.out.println(stack1.search(5));
        System.out.println(stack1.search(3));
        stack1.push(9);
        System.out.println(stack1);
        System.out.println(stack1.search(9));
    }
}
