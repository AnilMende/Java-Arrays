import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueuePractice {
    public static void main(String[] args) {
        // Priority Queue : FIFO Data Structure that serves elements with
        //                  the highest priorities first before elements with
        //                  lower priority

        Queue<Double> queue = new PriorityQueue<Double>();

        queue.offer(8.9);
        queue.offer(8.5);
        queue.offer(6.7);
        queue.offer(4.6);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
