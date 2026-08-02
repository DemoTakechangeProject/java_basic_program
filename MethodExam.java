import java.util.Scanner;
public class MethodExam {
    void display(int r,String stud_name,double percentage,boolean pass_status){
        System.out.println("Roll number:"+r);
        System.out.println("Student name:"+stud_name);
        System.out.println("Percentage:"+percentage);
        System.out.println("Pass Status"+pass_status);
    }
    public static void main(String[] args) {
        int roll;
        String stud_name;
        double percentage;
        boolean pass_status;
        Scanner obj = new Scanner(System.in);
        MethodExam obj1 = new MethodExam();
        System.out.println("Enter the student Roll,Name,Percentage and Passing status:");
        roll = obj.nextInt();
        stud_name = obj.next();
        percentage = obj.nextDouble();
        pass_status = obj.nextBoolean();

        obj1.display(roll,stud_name,percentage,pass_status);
    }
}
