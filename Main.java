import java.util.*;

class CustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;

    }
    
    // For ascending o1-o2 
    // For descending o2-o1 

    //  Take example of o1-o2 
    // If result is negative then o1 comes first
    // If result is positive then o2 comes first 
    // for equal based on list order comes first  
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.sort(new CustomComparator());
        System.out.println(list);

        // ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(3,7,4,1,6,9,8,5));
        // l1.sort((a,b)->b-a);
        // l1.sort((a,b)->{ return b-a; });
        // System.out.println(l1);

        ArrayList<String> friends = new ArrayList<>(Arrays.asList("Ram","Ajay","Manoj","Chandrakant"));
        friends.sort((a,b)->{
            return b.length()-a.length();
        });
        System.out.println(friends);

        
    }
}
