import java.util.Arrays;

public class Array_4 {
    public static void main(String[] args) {
        //insert element in an array
        int a [] = {10,20,30,40,50,60,70,80,90,100};

        int index= 5;
        int value = 55;

        for(int i = a.length-1;i>index;i--)
        {
            a[i]= a[i-1]; //9th value gets stored in 8th place
        }
        a[index] = value;
        System.out.println(Arrays.toString(a));


        //in this our own case value is getting deleted in that index
//        for(int i = 0;i<a.length-1;i++)
//        {
//            if(a[i]== a[index-1])
//            {
//                a[index] = value;
//            }
//        }
//        System.out.println(Arrays.toString(a));

    }
}
