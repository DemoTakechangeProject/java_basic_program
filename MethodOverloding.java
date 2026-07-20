class ParentClass{
    void display(int a,int b){
        System.out.println("Parent class : A:"+a+" B:"+b);
    }
}
class MethodOverloding extends ParentClass
{
    void display(int a,int b){
        System.out.println("child class : A:"+a+" B:"+b);
    }
    public static void main(String[] args) {
        MethodOverloding obj = new MethodOverloding();
        obj.display(10,20);
        ParentClass obj1 = new ParentClass();
        obj1.display(30,90);
    }
}






















//public class MethodOverloding {
//    MethodOverloding(){
//        System.out.println("This is a default constructor");
//    }
//    MethodOverloding(int a,int b){
//        System.out.println("A:"+a+" B:"+b);
//    }
//    MethodOverloding(int roll,String name){
//        System.out.println("Roll:"+roll+" Name:"+name);
//    }
//    MethodOverloding(int a,int b,int c){
//        System.out.println("A:"+a+" B:"+b+" C:"+c);
//    }
//    public static void main(String[] args) {
//        MethodOverloding obj2 = new MethodOverloding();
//        MethodOverloding obj1 = new MethodOverloding(10,20);
//        MethodOverloding obj3 = new MethodOverloding(10,20,30);
//        MethodOverloding obj4 = new MethodOverloding(101,"Gayatri");
//
//    }
//}


//public class MethodOverloding {
//    void display(int a,int b){
//        System.out.println("A:"+a+" B:"+b);
//    }
//    void display(int a,int b,int c){
//        System.out.println("A:"+a+" B:"+b+" C:"+c);
//    }
//    void display(int roll,String name){
//        System.out.println("Roll:"+roll+" Name:"+name);
//    }
//    void display(String name,int roll){
//        System.out.println("Roll:"+roll+" Name:"+name);
//    }
////    int display(int eid,String ename){
////        System.out.println("Employee Id:"+eid+" Employee name:"+ename);
////        return 0;
////    } not allowed
//    public static void main(String[] args) {
//        MethodOverloding obj = new MethodOverloding();
//        obj.display(10,20);
//        obj.display(10,20,30);
//        obj.display(101,"Rajeshwari");
//        obj.display("Vedant",101);
//    }
//}

//Example:1
//public class MethodOverloding {
//    void display(int a,int b){
//        System.out.println("A:"+a+" B:"+b);
//    }
//    void display(int a,int b,int c){
//        System.out.println("A:"+a+" B:"+b+" C:"+c);
//    }
//    void display(int roll,String name){
//        System.out.println("Roll:"+roll+" Name:"+name);
//    }
//    public static void main(String[] args) {
//        MethodOverloding obj = new MethodOverloding();
//        obj.display(10,20);
//        obj.display(10,20,30);
//        obj.display(101,"Rajeshwari");
//    }
//}
//
//
