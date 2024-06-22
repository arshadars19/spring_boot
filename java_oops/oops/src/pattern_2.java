public class pattern_2 {
    // 1 1 1 1 1
    // 1 1 1 1 1
    // 1 1 1 1 1
    public static void main(String[] args) {
        int row = 3;
        int col = 5;

        int value = 1;
        char ch = 'A';
        char ch1 = '*';

        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                System.out.print(value+  " ");
            }
            System.out.println(" ");
        }
    }
}


