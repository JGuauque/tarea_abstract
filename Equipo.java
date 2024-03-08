class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private static int sumaTiemposCiclistas = 0; // Atributo estático

    // Constructor
    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
    }

    // Métodos get y set
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getPaisEquipo() {
        return paisEquipo;
    }

    // Método para añadir un ciclista al equipo
    protected void agregarCiclista(Ciclista ciclista) {
        sumaTiemposCiclistas += ciclista.getTiempoAcumulado();
    }

    // Método para imprimir los datos del equipo
    protected void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("País: " + paisEquipo);
        System.out.println("Suma de tiempos de los ciclistas: " + sumaTiemposCiclistas + " minutos");
    }
}