import java.util.Scanner;
public class MCD {
        
   // Función recursiva basada en el Algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        // Caso base: si el residuo es 0, 'a' es el MCD
        if (b == 0) {
            return a;
        }
        // Llamada recursiva con el divisor y el residuo
        return calcularMCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MCD RECURSIVO (Algoritmo de Euclides) ===");
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Aplicamos valores absolutos para evitar problemas con negativos
        int resultado = calcularMCD(Math.abs(num1), Math.abs(num2));
        
        System.out.println("\nEl Máximo Común Divisor de " + num1 + " y " + num2 + " es: **" + resultado + "**");
        
        scanner.close();
    }
}