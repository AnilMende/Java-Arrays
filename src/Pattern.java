import java.util.HashMap;
import java.util.HashSet;

public class Pattern {
    public static void main(String[] args) {

        int arr[] = {1,1,2,2,2,3,4,4,5};
        int n = arr.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
       }
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(5));
        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }
        if(map.containsValue(3)){
            System.out.println("val is present");
        }
        map.remove(1);
        System.out.println("The new map is:");
        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        System.out.println("The set is:");
        System.out.println(set);
        System.out.println("The size of the set is:"+set.size());

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(6);
        set1.add(7);
        set1.add(8);
        set1.add(8);
        set1.add(9);
        System.out.println("Elements of the set1 are:"+set1);
        System.out.println("The size of the set1 is:"+set1.size());

        int n1 = set.size();
        int n2 = set1.size();
        if(n1 != n2){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}






