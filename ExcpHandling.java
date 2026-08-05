//public class ExcpHandling {
//    public static void main(String[] args) {
//        String name = "Rajeshwari";
//        boolean check =  name.equals("Rajeshwar"); // true   false
//        int len = name.length();
//        System.out.println("is Equal :"+check);
//        System.out.println("Length :"+len);
//    }
//}
//
//public class ExcpHandling {
//
//    public static void main(String[] args) {
//        String name =null;
//        int len=0;
//        try{
//             len = name.length();
//        } catch (NullPointerException e) {
//            System.out.println("Name is null");
//        }
//        System.out.println("Length :"+len);
//    }
//}


public class ExcpHandling {
    public static void main(String[] args) {
        String first = "10";
        String second = "20";
        int f=0;

        try{
            f = Integer.parseInt(first); //  throe NumberFormatException obj
        }catch (NumberFormatException obj){
            System.out.println("Invalid number format");
        }finally {
            System.out.println("Finally block always execute!!");
        }

        int s = Integer.parseInt(second);

        // for string -> String.toString(variable_name) // String.valueOf(variable_name)

        int add = f + s; // abc + demo = abc demo

        System.out.println("Addition :"+add);

    }
}