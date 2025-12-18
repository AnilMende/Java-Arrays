public class recursion1 {
    static void fun(int n){
        if(n<1){
            return;// break can not be used inside a function
        }
        System.out.println(n);
        fun(n-1);
    }

    public static void main(String[] args) {
        fun(5);
    }
}

