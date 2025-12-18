import java.util.Stack;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class QueueusingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void enqueue(int val){
        stack1.push(val);
    }
    public int dequeue(){
        if(stack1.isEmpty()){
            System.out.println("stack1 is empty");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    public int peek(){
        if(stack1.isEmpty()){
            System.out.println("stack1 is empty");
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val = stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    public boolean empty(){
        if(stack1.size() == 0 && stack2.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       // Queue<Integer> queue = new LinkedList<>();
        QueueusingStack queue = new QueueusingStack();
        queue.enqueue(7);
        queue.enqueue(9);
        queue.enqueue(5);
        System.out.println("peek is" + queue.peek());
        System.out.println("dequeue is" + queue.dequeue());
        queue.enqueue(7);
        System.out.println("peel is" + queue.peek());

    }
}
