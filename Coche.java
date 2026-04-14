public class Coche {
    // 1. Atributos de instancia (cada coche tiene el suyo)
    String marca;
    String modelo;

    // Atributo static (compartido por todos los coches creados)
    static int contadorCoches = 0;

    // 2. Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

        // Cada vez que nace un coche, sumamos 1 al contador global
        contadorCoches++;
    }

    // 3. Método static para mostrar el total
    public static void mostrarTotalCoches() {
        // Un método static puede acceder a variables static sin problemas
        System.out.println("Total de coches creados hasta ahora: " + contadorCoches);
    }

    // Ejemplo de ejecución
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Mazda", "3");
        Coche coche3 = new Coche("Chevrolet", "Onix");

        // Llamamos al método static usando el nombre de la CLASE
        Coche.mostrarTotalCoches();
    }
}