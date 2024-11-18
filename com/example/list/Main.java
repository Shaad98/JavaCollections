import java.util.*;
public class Main {
    public static void main(String[] args) {
        // By Dynamic Dispatch We can give Parent Reference to Child Object
        // List<Integer> list = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        // Get Class Name of Created Object
        System.out.println(list.getClass().getName());

        // It appends the element in list {at last}
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // 1st param is Index and 2nd param is Value 
        list.add(1,20);
        System.out.println(list);


        // Returns an element at given index 
        System.out.println(list.get(1));

        // Remove an element at an given index 
        System.out.println(list.remove(2));
        System.out.println(list);

        // Remove the element which pass in param 
        System.out.println(list.remove(Integer.valueOf(1)));
        System.out.println(list);

        // Two ways to iterate the list same but premitive and wrapper classes 

        for (Integer integer : list) {
            System.out.println(integer);
        }

        for (int integer : list) {
            System.out.println(integer);
        }

        List<Integer> l1 = new ArrayList<>(Arrays.asList(7,2,1,3));

        // Append list all elements as it is at last 
        list.addAll(l1);
        System.out.println(list);

        List<Integer> l2 = new ArrayList<>(List.of(1,9,2,4));

        // At index 3 add list l2 
        list.addAll(3, l2);
        System.out.println(list);

        // It take argument as custom comparator class implementation 
        // list.sort(null);
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);

        // For printing size of an array 
        System.out.println(list.size());

        // Check can it present in list or not
        System.out.println(list.contains(7));

        // System.out.println(list);
        // System.out.println(list.contains(l2));

        List<Integer> l3 = Arrays.asList(1,2,3,4,5);
        // Cannot add only update bcz it returns fixed size list
        // l3.add(4);
        // System.out.println(l3.getClass().getName());

        // Update 1st index to 12 
        l3.set(1, 12);
        System.out.println(l3);

        // Cannot Remove 
        // l3.remove(3);
        // System.out.println(l3);

        // Returns fixed size list cannot add,remove and update too 
        List<Integer> l4  = List.of(5,4,3,2,1);
        System.out.println(l4);
    }
}
