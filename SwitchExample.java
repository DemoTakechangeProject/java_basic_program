//public class SwitchExample {
//    public static void main(String[] args) {
//        int choice=6;
//        switch (choice){
//            case 1:
//                System.out.println("Fan On");
//                break;
//            case 2:
//                System.out.println("Charging On");
//                break;
//            case 3:
//                System.out.println("Washing Machine On");
//                break;
//            case 4:
//                System.out.println("AC On");
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class SwitchExample {
//    int first,second;
//    String choice;
//
//    Scanner scanner = new Scanner(System.in);
//
//    void enterValue(){
//        System.out.println("Enter two number :");
//        first = scanner.nextInt();
//        second = scanner.nextInt();
//    }
//    void enterChoice(){
//        System.out.println("Enter your choice(add,sub,div,mul) :");
//        choice = scanner.next();
//    }
//    void doCalculation(){
//        switch (choice){
//            case "add":
//                System.out.println("Addition :"+(first+second));
//                break;
//            case "sub":
//                System.out.println("Subtraction :"+(first-second));
//                break;
//            case "mul":
//                System.out.println("Multiplication :"+(first*second));
//                break;
//            case "div":
//                System.out.println("Division :"+(first/second));
//                break;
//            default:
//                System.out.println("Invalid choice!");
//        }
//    }
//
//    public static void main(String[] args) {
//        SwitchExample switchExample = new SwitchExample();
//        switchExample.enterValue();
//        switchExample.enterChoice();
//        switchExample.doCalculation();
//    }
//}

//Enter two number
//10 20
//
//Enter your choice(add,sub,div,mul):
//sub
//
//Substraction : -10


import java.util.Scanner;
public class SwitchExample {
    int first,second;
    int choice;
    String userChoice;

    Scanner scanner = new Scanner(System.in);

    void enterValue(){
        System.out.println("Enter two number :");
        first = scanner.nextInt();
        second = scanner.nextInt();
    }
    void ourMenu(){
        System.out.println("\n\n** Menu **");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("**************\n\n");
    }
    void enterChoice(){
        System.out.println("Enter your choice  :");
        choice = scanner.nextInt();
    }
    void doCalculation(){
            switch (choice){
                case 1:
                    System.out.println("Addition :"+(first+second));
                    break;
                case 2:
                    System.out.println("Subtraction :"+(first-second));
                    break;
                case 3:
                    System.out.println("Multiplication :"+(first*second));
                    break;
                case 4:
                    System.out.println("Division :"+(first/second));
                    break;
                default:
                    System.out.println("Invalid choice!");
        }
    }

    void executeAgainChoice(){
        System.out.println("Do you want again?(Yes/No):");
        userChoice = scanner.next();
    }

    void commonCall(){
        do{
            enterValue();
            ourMenu();
            enterChoice();
            doCalculation();
            executeAgainChoice();
        }while (userChoice.equals("Yes"));
    }

    public static void main(String[] args) {
        SwitchExample switchExample = new SwitchExample();
        switchExample.commonCall();
    }
}