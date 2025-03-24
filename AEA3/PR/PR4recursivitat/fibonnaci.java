package AEA3.PR.PR4recursivitat;

public class fibonnaci {
    public static int fibonacci(int n) {
        if (n == 0) return 0; // Caso base 1
        if (n == 1) return 1; // Caso base 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("El término " + num + " de Fibonacci es: " + fibonacci(num));
    }
}
