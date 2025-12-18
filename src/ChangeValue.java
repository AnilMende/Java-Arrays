public class ChangeValue {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int changedValue = Change(num1,num2);
        System.out.println(changedValue);
        System.out.println(num1);
        System.out.println(num2);
    }

    static int Change(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // this change will only be valid within this function
        return a;
    }
}
