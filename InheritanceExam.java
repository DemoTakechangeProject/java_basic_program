//class NewParentClass{
//    int a=10;
//    int b=20;
//
//    void display(){
//        System.out.println("A :"+a+"\nB"+b);
//    }
//}
//
//public class InheritanceExam extends NewParentClass {
//    void add(){
//        System.out.println(a+b);
//    }
//
//    public static void main(String[] args) {
//        InheritanceExam inheritanceExam = new InheritanceExam();
//        inheritanceExam.display();
//        inheritanceExam.add();
//    }
//}

class NewParentClass{
    int a;
    int b;
    NewParentClass(int a,int b){
        this.a = a; // 10
        this.b = b; // 20
        System.out.println("I am parent class constructor");
    }
    void display(){
        System.out.println("A :"+a+"\nB :"+b);
    }
}

public class InheritanceExam extends NewParentClass {
    InheritanceExam(int a,int b){
        super(a,b);
        System.out.println("I am child class constructor!!");
    }
    void add(){
        System.out.println("Addition is :"+(a+b));
    }
    public static void main(String[] args) {
        int a=10,b=20;
        InheritanceExam inheritanceExam = new InheritanceExam(a,b);
        inheritanceExam.display();
        inheritanceExam.add();
    }
}

