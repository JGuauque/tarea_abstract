public class Escalador extends Ciclista {
    private float aceleracionSubida;
    private float gradoRampa;

    // Constructor
    public Escalador(int identificador, String nombre, float aceleracionSubida, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionSubida = aceleracionSubida;
        this.gradoRampa = gradoRampa;
    }

    // Implementación del método imprimirTipo
    public String imprimirTipo() {
        return "Es un Escalador";
    }
    
}
