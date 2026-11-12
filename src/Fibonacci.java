
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una posicion: ");
        int p = sc.nextInt();
        int res = fibonacci(p);
        System.out.println("El numero de Fibonacci en la posicion "+ p +" es: "+res);
    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}