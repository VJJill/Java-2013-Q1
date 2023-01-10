public class HelloWorld {
    public static void add(int a, int b) {
        int c;
         c = a + b;
        System.out.print("Hello" + c);
    }
    public static void ygdisplay() {
        System.out.println("Hello Team !");
    }
    public static void main(String[] args) {
        int c = substract(3, 2);
        HelloWorld.ygdisplay();
        System.out.println("Hello");
        HelloWorld.add(12,5);
        System.out.println("hi");
    }
    public static int substract(int n1, int n2) {
        return n1 - n2;
    }
}