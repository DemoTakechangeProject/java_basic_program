//class A {
//    void displayA(){
//        System.out.println("I a A class method");
//    }
//}
//class B extends A {
//    void displayB(){
//        System.out.println("I a B class method");
//    }
//}
//class C extends B {
//    void displayC(){
//        System.out.println("I a C class method");
//    }
//}
//public class D extends C{
//    void displayD(){
//        System.out.println("I a D class method");
//    }
//
//    public static void main(String[] args) {
//        D obj = new D();
//        obj.displayA();
//        obj.displayB();
//        obj.displayC();
//        obj.displayD();
//    }
//}

class A {
    void displayA(){
        System.out.println("I a A class method");
    }
}
class B extends A {
    void displayB(){
        System.out.println("I a B class method");
    }
}
public class D extends A{
    void displayD(){
        System.out.println("I a D class method");
    }
    public static void main(String[] args) {
        D objD = new D();
        objD.displayA();
        objD.displayD();

        B objB = new B();
        objB.displayA();
        objB.displayB();

        A objA = new A();
        objA.displayA();

    }
}
