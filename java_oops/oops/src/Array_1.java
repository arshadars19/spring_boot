import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {

        //array declaration
        int a [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(a[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:- ");
        int size = sc.nextInt();
        int b[] = new int[size];

        //getting and storing elements
        for(int i = 0;i<size;i++)
        {
            b[i] = sc.nextInt();
        }

        //for printing output using for loop
        for (int i = 0; i<size ;i++)
        {
            System.out.println(b[i]);
        }
/*
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);

        //enhanced for loop
        for(int element : b)
        {
            System.out.println(element);
        }*/
    }
}
