class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    // Constructor
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Implementación del método imprimirTipo
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }
}