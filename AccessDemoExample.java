//import access_package.AccessPackageClass;
//public class AccessDemoExample {
//    public static void main(String[] args) {
//        AccessPackageClass obj = new AccessPackageClass();
//        obj.display();
//    }
//}
//import access_package.AccessPackageClass;
//public class AccessDemoExample extends AccessPackageClass {
//    void myName(){
//        System.out.println("My name is pritish");
//    }
//    public static void main(String[] args) {
//        AccessDemoExample obj = new AccessDemoExample();
//        obj.display();
//        obj.myName();
//    }
//}

import access_package.AccessPackageClass;
public class AccessDemoExample extends AccessPackageClass {
    protected void myName(){
        System.out.println("My name is pritish");
    }
    public static void main(String[] args) {
        AccessDemoExample obj = new AccessDemoExample();
        obj.display();
        obj.myName();
    }
}