//public class BreakContinueExample {
//    public static void main(String[] args) {
//
//        for(int i=1;i<=5;i++){
//            if(i==3){
//                break;   // Exit the loop completely
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("Below statement");
//    }
//}

public class BreakContinueExample {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            if(i==3 || i!=2){ // F  T = T  F  F= F  T  T = T i=4  F T =T  i=5  f t = t
                continue;   // Skip the current iteration and continue with the next one.
            }
            System.out.println(i);
            System.out.println("My name is Gayatri");
        }

        System.out.println("Below statement");
    }
}
