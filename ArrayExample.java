import java.util.Scanner;

//public class ArrayExample {
//    public static void main(String[] args) {
//        int[] eid = new int[5];
//        int sum=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Five emp id :");
//        for(int i=0;i<=4;i++){
//            eid[i]=sc.nextInt();
//        }
//        System.out.println("Given array is:");
//        for(int i=0;i<=4;i++){
//            System.out.println(eid[i]);
//            sum = sum + eid[i];  // sum = 0+ 101  sum=101   sum=sum+eid[1]  sum=101+102 sum=203
//        }
//        System.out.println("Sum of array :"+sum);
//    }
//}

// i=0  0<=4 T eid[0]=101
// sum=sum+eid[0] sum=0+101  sum=101

// i=1   1<=4 T   eid[1]=102
// sum=101+eid[1]  sum=101+102  sum=203

// i=2  2<=4 T  eid[2]=301
// sum=sum+eid[i]  sum=203+301  sum=504

//i=3  3<=4 T  eid[3]= 501
// sum=504+501  sum=1005

//i=4  4<=4  T  eid[4] = 890
// sum=sum+eid[i]  sum=1005+eid[4] sum=1005+890  sum=1895

// i=5  i<=4  5<=4 F
// sum = 1895

public class ArrayExample {
    public static void main(String[] args) {
        int roll[] = {34,11,74,33,89};
        // Reverse an array
        for(int i=4;i>=0;i--){
            System.out.println(roll[i]);
        }
    }
}