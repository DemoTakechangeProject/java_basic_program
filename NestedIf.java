public class NestedIf {
    int roll;
    public static void main(String[] args) {
        int num=20;
        if(num==20)  // true
        {
            System.out.println("Number is equal to 20");
            if(num<5) // false
            {
                System.out.println("Number is grater then 5");
                if(num<50) // true
                {
                    System.out.println("Number is less then 50");
                }
                System.out.println("I am spider man");
            }
            System.out.println("I am king");
        }
    }
}
