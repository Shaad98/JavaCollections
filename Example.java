import java.util.*;

public class Example {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // Add at last
        list.add(1);
        list.add(2);
        // Index , Element
        list.add(1,3);
        
     List<Integer> l1 = new LinkedList<>(Arrays.asList(5,3,4));
     List<Integer> l2 = new LinkedList<>(Arrays.asList(9,4,7,6,8));

     list.addAll(2,l1);
     // Append list at last
     list.addAll(l2);

     System.out.println(list); 
     //Remove Elements by Criteria
     list.removeIf(x-> x%2 ==0);

     System.out.println(list);

     list.addFirst(20);
     list.addLast(50);
     
     System.out.println(list);
     System.out.println(list.get(3));
     System.out.println(list.getFirst());
     System.out.println(list.getLast());

     List<String> n1 = new LinkedList<>(Arrays.asList("Ajay","Ravi","Niraj","Pavan","Ron"));
     List<String> n2 = new LinkedList<>(Arrays.asList("Ron","Niraj"));

     n1.removeAll(n2);

     System.out.println(n1);

     System.out.println(list.peek());
    }
}
