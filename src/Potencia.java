
import java.util.Scanner;

public class Potencia {

    public static int Potencia(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * Potencia(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Ingresa tu base: ");
        int base = t.nextInt();
        System.out.println("Ingresa tu exponencial: ");
        int exponencial = t.nextInt();
        if (exponencial >= 0) {
            int resultado = Potencia(base, exponencial);
            System.out.println("El numero " + base + " Con exponencial " + exponencial + " Es igual a: " + resultado);
        } else {
            System.out.println("Error");
            System.out.println("Debes ingresar un Numero mayor o igual a 0");
        }
    }
}
