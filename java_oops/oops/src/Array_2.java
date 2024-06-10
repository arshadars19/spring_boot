import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:- ");
        int size = sc.nextInt();
        int array [] = new int[size];
        int even = 0;
        int odd = 0;

        for (int i = 0 ; i<size;i++)
        {
            System.out.println("Enter the values:- ");
            array[i] = sc.nextInt();
        }

        for (int element : array)
        {
            if(element%2==0)
            {
                System.out.println("Even element:- " + element);
                even++;
            }
            else
            {
                System.out.println("Odd element :- " + element);
                odd++;
            }
        }
        System.out.println("Even count :- " + even);
        System.out.println("Odd count :- " + odd);
    }
}
