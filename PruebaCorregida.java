public class PruebaCorregida {
    // Ahora el atributo también es de la clase
    static int nivelEnergia = 100;

    public static void modificarEnergia() {
        // Funciona porque ambos viven en el contexto de la clase
        nivelEnergia = 50;
    }
}
