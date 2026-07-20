public class ForExample {
    public static void main(String[] args) {
        int row,column;

        for(row=1;row<=3;row++) // 1<=3  T  2<=3 T  3<=3 T 4<=3
        {
            for (column=1;column<=5;column++) // 1<=5 T
            {
                System.out.println(column);
            }
            System.out.println();
        }
    }
}
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5