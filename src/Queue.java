public class Queue {
    int front;
    int rear;
    int size;
    int capacity;
    int queue[];
    public Queue(int capacity){
        queue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty(){
        if(front == -1 || rear == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(rear == capacity-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }
    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear++;
        }
        size++;
        queue[rear] = val;
    }
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int val = queue[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        size--;
        return val;
    }
    public int size(){
        return size;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is EMpty");
        }
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
            if(i!=rear){
                System.out.println(",");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue Queue = new Queue(5);
        Queue.enqueue(9);
        System.out.println(""+Queue.peek());
    }
}
