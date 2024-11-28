public class Barco extends VehiculoMaritimo {
    private int camarotes;

    // Constructor
    public Barco(String marca, String modelo, int capacidad, int velas, int camarotes) {
        super(marca, modelo, capacidad, velas);
        this.camarotes = camarotes;
    }

    // Getter y Setter
    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    // METODO PERSONALIZADO
    @Override
    public String toString() {
        return super.toString() + ", Camarotes: " + camarotes;
    }
}

