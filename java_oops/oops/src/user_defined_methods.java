public class user_defined_methods {
    public static void main(String[] args) {
        Methods a = new Methods();
        a.add();
    }

    //without return and arguments
    public static class Methods {
        public void add() {
            int a = 10;
            int b = 20;
            int c = a+b;
            System.out.println("addition " + c);
        }
    }
}
