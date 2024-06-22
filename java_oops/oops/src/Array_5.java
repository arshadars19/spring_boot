import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-" );
        int size = sc.nextInt();
        System.out.println("Enter the values:- ");
//        int a [] = {9,1,2,5,5,6,9,6,7,2,7};
        int a [] = new int[size];
        for (int i =0 ;i<a.length-1;i++)
        {
            a[i] = sc.nextInt();
        }
        int count =0;
        for (int i =0;i<a.length-1;i++)
        {
            for(int j= i+1;j<a.length;j++)
            {
                if((a[i] == a[j]) && (i!=j))//9==1 using(i!=j) will help more
                {
                    System.out.println("Duplicate number :- " + a[j]);
                    count++;
                }
            }
        }
        System.out.println("No of duplicate elements:- " + count);
    }
}
