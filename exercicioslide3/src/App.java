import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Peso: ");
        double p = teclado.nextDouble();

        System.out.print("Altura: ");
        double alt = teclado.nextDouble();

        double imc = calcular(p, alt);

        System.out.println("Resultado: " + imc);
    }

    public static double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }
}