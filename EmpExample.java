//public class EmpExample {
//    public static void main(String[] args) {
//        // static declaration
//        int[] roll =  {101,102,103,104};
//
////        System.out.println(roll[0]);
////        System.out.println(roll[1]);
////        System.out.println(roll[2]);
////        System.out.println(roll[3]);
//
//        for(int i=0;i<=3;i++){
//            System.out.println(roll[i]); // roll[0]
//        }
//    }
//}


//
//    102
//
//roll[1] = 404;

public class EmpExample {
    public static void main(String[] args) {
        // dynamic declaration
        int [] roll = new int[5];

        roll[0] = 701;
        roll[1] = 902;
        roll[2] = 903;
        roll[3] = 204;
        roll[4] = 505;

//        System.out.println(roll[0]);
//        System.out.println(roll[1]);
//        System.out.println(roll[2]);
//        System.out.println(roll[3]);
//        System.out.println(roll[4]);

//        for(int i=0 ;i<5 ;i++){ //0<5 1<5 2<5 3<5 4<5 5<5 F
//            System.out.println(roll[i]);
//        }

        for(int temp : roll){
            System.out.println(temp);
        }

    }
}
