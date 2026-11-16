
import java.util.Scanner;

public class FibonacciNoRecursivo {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Ingresa la posicion de fibonacci que deseas: ");
        int pos = t.nextInt();
        if (pos >= 0) {
            double resultado = fibonacci(pos);
            System.out.println("El termino de la posicion de fibonacci es: " + resultado);
        } else {
            System.out.println("Error: la posicion debe ser mayor o igual a 0");
        }

    }

    public static double fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int anterior = 0;
        int siguente = 0;
        int actual = 1;
        for (int i = 2; i <= n; i++) {
            siguente = anterior + actual;
            anterior = actual;
            actual = siguente;
        }
        return actual;
    }
}
