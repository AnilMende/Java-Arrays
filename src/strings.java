import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        //String var = "data Structures";
        //System.out.println(var.toLowerCase());
        //System.out.println(var.toUpperCase());
        //for iteration we use charAt
        //System.out.println(var.charAt(6));
        //System.out.println(var.indexOf('c'));
        //System.out.println(var.length());
        //char ch[] = var.toCharArray();
        //for(int i=0;i<ch.length;i++){
          //  System.out.print(ch[i]+" ");
        //}
        //System.out.println( "Anil" + 9 + 34 );

        //substrings
        String input = "abc";
        int n = input.length();
        for(int start=0;start<n;start++){
            for(int end = start + 1;end <= n;end++){
                System.out.println(input.substring(start,end));
            }
            //System.out.println();
        }
        //revere of a string 1 st method
        String str = "anilm";
        String ans = " ";
        for(int i=0;i<str.length();i++){
            ans = str.charAt(i) + ans;
        }
        System.out.println(ans);

        //2nd method
        StringBuilder res = new StringBuilder(str);
        int k = res.length();
        for(int i=0;i<k/2;i++){
            char firstchar = res.charAt(i);
            char lastchar = res.charAt(k-1-i);

            res.setCharAt(i,lastchar);
            res.setCharAt(k-1-i,firstchar);
        }
        System.out.println(res.toString());

        //3rd method
        char Arr[] = str.toCharArray();
        int l = Arr.length;
        for(int i=0;i<l/2;i++){
            char first = Arr[i];
            char last = Arr[l-1-i];
            Arr[i] = last;
            Arr[l-1-i] = first;
        }
        for(int i=0;i<l;i++){
            System.out.print(Arr[i]);
        }
    }
}
