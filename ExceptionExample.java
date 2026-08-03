//import java.util.Scanner;
//public class ExceptionExample {
//    public static void main(String[] args) {
//        int a,b;
//        int div=0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter two number:");
//        a = scanner.nextInt(); //20
//        b = scanner.nextInt(); // 10
//
//        try{
//            div = a/b; // 20/10 = 2
//        }catch (ArithmeticException obj){
////            System.out.println("Throw exception is :"+obj);
//            System.out.println("Can not divide by zero!");
//        }
//        System.out.println("Division : "+div);
//
//        if(a%2==0){
//            System.out.println("Number is even!");
//        }else {
//            System.out.println("Number is Odd");
//        }
//    }
//}

public class ExceptionExample {
    public static void main(String[] args) {
        int[] roll = new int[3]; // 12 byte

        roll[0] = 101;
        roll[1] = 560;
        roll[2] = 870;
        roll[3] = 111;

        for(int i=0;i<=3;i++){
            try{
                System.out.println(roll[i]); // roll[3]
            }catch (Exception obj){
                System.out.println("This index is not found!");
            }
        }
        System.out.println("Below code");
    }
}

//10/90-90

//a/b-c