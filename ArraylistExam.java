import java.util.ArrayList;

public class ArraylistExam {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();

        student.add("Ankita");
        student.add("Rajeshwari");
        student.add("Gayatri");
        student.add("yogesh");
        student.add("Gayatri"); // it allows the duplicate element


//        System.out.println(student); // print all list
//        System.out.println(student.get(1)); // get an element by index

//        student.set(2,"Sakshi"); // update an element

//        student.remove(2);
//        student.remove("yogesh");

//        System.out.println("Number of element in list is :"+student.size());

//        System.out.println("Check if an element exists (true/false) :"+student.contains("Ganesh"));

        System.out.println("isEmpty :"+student.isEmpty());

        for(String temp : student){
            System.out.println(temp);
        }
    }
}
