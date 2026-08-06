import java.util.ArrayList;

// Example 1: Store Student Names
public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();

        student.add("Pritish");
        student.add("Ganesh");
        student.add("kiran");
        student.add("Kiran"); // Arraylist allows duplicate elements.
        student.add("Yogesh");

        // ArrayList support indexing.
//        System.out.println(student.get(0)); // get the single element by index
//      System.out.println(student.get(8)); // Exception in thread "main" java.lang.IndexOutOfBoundsException

        //print all element using for-each
        for(String obj : student){
            System.out.println(obj);
        }
    }
}
