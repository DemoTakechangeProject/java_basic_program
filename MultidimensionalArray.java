import java.util.Scanner;
//public class MultidimensionalArray {
//    public static void main(String[] args) {
//        int[][] mat = {
//                {10,20,30},
//                {40,60,80}
//        };

////        System.out.println(mat[0][0]);
////        System.out.println(mat[0][1]);
////        System.out.println(mat[0][2]);
////        System.out.println(mat[1][0]);
////        System.out.println(mat[1][1]);
////        System.out.println(mat[1][2]);
//        for(int r=0;r<=1;r++){
//            for(int c=0;c<=2;c++){
//                System.out.print(mat[r][c]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//10 20 30
//40 60 80

public class MultidimensionalArray {
    int r=3,c=4;
    int mat[][] = new int[r][c]; //

    Scanner scanner = new Scanner(System.in);

    void enterArray(){
        System.out.println("Enter the "+r+"x"+c+" matrix element :");
        for(int row=0;row<r;row++){
            for(int column=0;column<c;column++){
                mat[row][column] = scanner.nextInt();
            }
        }
    }
    void printArray(){
        System.out.println("Given matrix is :");
        for(int row=0;row<r;row++){
            for(int column=0;column<c;column++){
                System.out.print(mat[row][column]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
        multidimensionalArray.enterArray();
        multidimensionalArray.printArray();
    }
}