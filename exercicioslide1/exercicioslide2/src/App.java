import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n = leitor.nextInt();
        
        if (ehPar(n)) {
            System.out.println("E par");
        } else {
            System.out.println("E impar");
        }
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}