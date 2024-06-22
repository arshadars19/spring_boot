public class Array_jagged {
    public static void main(String[] args) {
        int a [][] = {
                {10,20,30},
                {10,20,30,40},
                {10,20,50}
        };

        //loop
        for(int i = 0 ; i<a.length;i++)
        {
            for(int j = 0 ;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("---------------------------------");
        //enhanced loop
        for(int[] k : a)
        {
            for(int l : k)
            {
                System.out.print(l + " ");
            }
            System.out.println(" ");
        }
    }
}
