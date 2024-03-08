/**
 * Ciclista
 */
public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoAcumulado;

    // Constructor
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    // Métodos get y set
    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempo) {
        this.tiempoAcumulado = tiempo;
    }

    // Método abstracto para imprimir el tipo de ciclista
    public abstract String imprimirTipo();
}

