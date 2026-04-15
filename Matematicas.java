public class Matematicas {

    // Método static para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método static para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método static para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método static para dividir con validación
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }
}