import java.util.Scanner;
public class MethodExample {
    void addition(int a,int b){
        int add = a + b;
        System.out.println("Addition of two number is: "+add);
    }
    public static void main(String[] args) {
//        int num1=10;
//        int num2=30;
        int num1,num2;
        Scanner scanner = new Scanner(System.in);
        MethodExample obj = new MethodExample();
//        obj.addition(10,20);  // call by value
//        obj.addition(num1,num2);  // call by refernce
//        System.out.println("Enter the two number:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        obj.addition(num1,num2);
    }
}

