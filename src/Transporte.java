public class Transporte {
    private String marca;
    private String modelo;
    private int capacidad;

    // Constructor
    public Transporte(String marca, String modelo, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // METODO PERSONALIZADO
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Capacidad: " + capacidad;
    }
}


