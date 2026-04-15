public class PruebaMemoria {
    // Atributo NO estático (pertenece al objeto)
    int nivelEnergia = 100;

    // Método estático (pertenece a la clase)
    public static void modificarEnergia() {
        // ERROR DE COMPILACIÓN:
        nivelEnergia = 50;
    }
}