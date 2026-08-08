//import java.util.ArrayList;
//
//public class ArraylistExam {
//    public static void main(String[] args) {
//        ArrayList<String> student = new ArrayList<>();
//
//        student.add("Ankita");
//        student.add("Rajeshwari");
//        student.add("Gayatri");
//        student.add("yogesh");
//        student.add("Gayatri"); // it allows the duplicate element
//
//
////        System.out.println(student); // print all list
////        System.out.println(student.get(1)); // get an element by index
//
////        student.set(2,"Sakshi"); // update an element
//
////        student.remove(2);
////        student.remove("yogesh");
//
////        System.out.println("Number of element in list is :"+student.size());
//
////        System.out.println("Check if an element exists (true/false) :"+student.contains("Ganesh"));
//
////        System.out.println("isEmpty :"+student.isEmpty());
//
////        student.clear(); // Remove all element
//
////        System.out.println("Number of element in list is :"+student.size());
//
////        System.out.println("Element index :"+student.indexOf("Gayatri")); // Find the index of an element
//
////        System.out.println(student.lastIndexOf("Gayatri")); // it returns the last occurrence index
//
//
//        for(String temp : student){
//            System.out.println(temp);
//        }
//    }
//}

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExam {
    public static void main(String[] args) {
        ArrayList<Integer> roll = new ArrayList<>();

        roll.add(70);
        roll.add(40);
        roll.add(20);
        roll.add(10);
        roll.add(100);

        Collections.sort(roll);

        for(int temp : roll){
            System.out.println(temp);
        }
    }
}

