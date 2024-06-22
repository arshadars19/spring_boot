public class user_defined_methods {
    public static void main(String[] args) {
        Methods a = new Methods();
        a.add();
        a.sub(100,50);
        System.out.println("multiplication:- "+ a.mul());
        int c =  a.div(10,2);
        System.out.println(c);
        System.out.println("divide:- "+ a.div(50,2));
        System.out.println("Factorial:- " + a.factorial(5));
    }

    public static class Methods {
        //without return and arguments
        public void add() {
            int a = 10;
            int b = 20;
            int c = a+b;
            System.out.println("addition " + c);
        }
        //without return and with arguments
        public void sub(int x, int y)
        {
            System.out.println("subtraction: "+ (x-y) );
        }
        //with return and no arguments
        public int mul()
        {
            int a= 6;
            int b = 5;
            return a*b;
        }
        //with return and arguments
        public int div(int a, int s)
        {
            return a/s;
        }

        //recursion
        public int factorial(int n)//5
        {
            if(n==1)
            {
                return 1;
            }
            else {
                return(n*factorial(n-1));
            }
        }
    }
}
