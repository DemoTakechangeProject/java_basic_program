import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();

//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the student name :");
//
//        for (int i=0;i<=3;i++){
////            String name = sc.next();
//            student.add(sc.next());
//        }


        student.add("Pankaj");
        student.add("Ganesh");
        student.add("Divya");
        student.add("Sakshi");

        student.addFirst("Pooja");
        student.addLast("Vaibhav");

//        System.out.println(student.getFirst());
//        System.out.println(student.getLast());

//        System.out.println(student.get(2));

//        student.remove("Divya");

        String RM = student.removeFirst();
        System.out.println("Return remove element :"+RM);
        System.out.println(student.removeLast());


        System.out.println("Given list is :");
        for(String temp : student){
            System.out.println(temp);
        }
    }
}

// get set contains size clear isEmpty