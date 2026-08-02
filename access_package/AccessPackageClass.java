package access_package;

//public class AccessPackageClass {
//    void display(){
//        System.out.println("I am access package class method..!!");
//    }
//
//    void callAbove(){
//        display();
//    }
//}
public class AccessPackageClass {
    protected void display(){
        System.out.println("I am access package class method..!!");
    }
    public void callAbove(){
        display();
    }
}

