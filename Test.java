
import java.util.*;


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Shaad",9.8);
        Student s2 = new Student(2,"Ajay",9.2);
        Student s3 = new Student(3,"Ravi",9.2);
        Student s4 = new Student(4,"Ravi",9.2);
        List<Student> students = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        // students.sort((a,b)->{
        //     if(b.getCgpa()-a.getCgpa()>0)
        //     {
        //         return 1;
        //     }else if(b.getCgpa()-a.getCgpa()<0)
        //     {
        //         return -1;
        //     }
        //     else{
        //         if(a.getName().equals(b))
        //         {
        //             return Integer.compare(b.getId(), a.getId());
        //         }
        //         else{
        //             return b.getName().compareTo(a.getName());
        //         }
        //     }
        // });
        students.sort(Comparator.comparing(Student :: getCgpa).reversed().thenComparing(Student :: getName));
           for (Student student : students) {
            System.out.println(student);
        }
        

    }
}
