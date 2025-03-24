package AEA3.PR.PR4recursivitat;

public class factorial {
    
    public static int factorial(int n) {
        System.out.println("1. En esta iteración n = " + n);
        if (n == 0) { //factorial(0)
            System.out.println("2. Estoy en el caso base, n = " + n);
            return 1; // Caso base
        }
        System.out.println("3. En esta iteración, volveré a llamar a la misma función con n = " + (n-1));
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }
}
