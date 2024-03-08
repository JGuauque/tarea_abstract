public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadSprint;

    // Constructor
    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    // Implementación del método imprimirTipo
    public String imprimirTipo() {
        return "Es un Velocista";
    }
}
