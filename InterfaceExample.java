//
//interface shape{
//    void draw();
//}
//
//class Circle implements shape{
//    @Override
//    public void draw() {
//        System.out.println("Drawing circle");
//    }
//}
//
//class Rectangle implements shape{
//    @Override
//    public void draw() {
//        System.out.println("Drawing rectangle");
//    }
//}
//
//public class InterfaceExample {
//    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.draw();
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();
//    }
//}

interface Student{
    void displayStudent();
}

interface Teacher{
    void displayTeacher();
}

class KKWCollege implements Student,Teacher{
    @Override
    public void displayStudent() {
        System.out.println("Student name : yogesh");
    }

    @Override
    public void displayTeacher() {
        System.out.println("Teacher name : Mr.Jadhav");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        KKWCollege kkwCollege = new KKWCollege();
        kkwCollege.displayStudent();
        kkwCollege.displayTeacher();
    }
}
