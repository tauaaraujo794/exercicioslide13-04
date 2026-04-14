public class App {
    public static void main(String[] args) throws Exception {
        int maximo = maior(10, 42);
        System.out.println(maximo);
    }

    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}