import java.util.Scanner;

public class Array_2D_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:- ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of col:- ");
        int col = sc.nextInt();

        int a[][] = new int[rows][col];

        for(int i = 0; i<rows;i++)
        {
            for(int j=0; j<col;j++)
            {
                System.out.println("Enter the value of " +i+ " "+j);
                a[i][j] = sc.nextInt();
            }
        }
//        for (int i =0;i<rows;i++)
//        {
//            for(int j =0;j<col;j++)
//            {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        for(int[] x : a)
        {
            for(int y : x)
            {
                System.out.print(" " + y);
            }
            System.out.println();
        }
    }
}
