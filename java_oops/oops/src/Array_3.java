import java.util.Arrays;
import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size:- ");
            int size = sc.nextInt();
            int array [] = new int[size];
            int temp;

            for(int i =0; i<size;i++)
            {
                System.out.println("Enter the values need to sort:- ");
                array[i] = sc.nextByte();
            }
            System.out.println("Before array "+ Arrays.toString(array));

            for (int i = 0;i<size;i++)
            {
                for(int j = i+1;j<size;j++)
                {
                    if(array[i]>array[j]) // ascending sort
//                    if(array[i]<array[j]) //descending sort
                    {
                        temp = array[i];
                        array[i]=array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("After sort:- "+ Arrays.toString(array));
        }
    }
}
