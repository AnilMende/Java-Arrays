public class Overloading {
    public static void main(String[] args) {
        int res1= sum(10);
        System.out.println(res1);
        int res2 =  sum(10,20);
        System.out.println(res2);
        String res3 = sum("Anil");
        System.out.println(res3);
    }
    //This is Method Overloading
    static int sum(int a){
        return a;
    }

    static int sum(int a, int b){
        return a + b;
    }

    static String sum(String name){
        return name;
    }
}
