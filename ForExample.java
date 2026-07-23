import java.util.Scanner;

public class ForExample {
    void designPattern(int r,int c){
        for(int row=1;row<=r;row++){ // r=4
            for (int column=1;column<=c;column++){ // c=4
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rowValue,columnValue;
        ForExample obj = new ForExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Row and Column:");
        rowValue = scanner.nextInt(); // 4
        columnValue = scanner.nextInt(); // 4
        obj.designPattern(rowValue,columnValue);
    }
}
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
//
//* * * *
//* * * *
//* * * *
//* * * *
