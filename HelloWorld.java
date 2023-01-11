public class HelloWorld {
    public void add(int a, int b){
        int c=a+b;
        System.out.print("Hello"+c);
    }
    public static String  display(String s1,String s2){
        return s1.concat(s2);
    }
    public static void  ygdisplay(){
        System.out.println("Hello Team !");
    }
    public static void main(String[] args) {
        int c=substract(3,2);
        HelloWorld.ygdisplay();
        System.out.println("Hello");
        System.out.println("i am akhila");
        System.out.println("Hi there");
        System.out.println(display("hi ","sridevi"));
        System.out.println(multiplication(10, 15));
    }
    public static int substract(int n1, int n2){
        return n1-n2;
    }
    public static int multiplication(int num1, int num2)
    {
        return num1*num2;
    }

}
