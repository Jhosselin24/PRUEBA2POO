public class VehiculoMaritimo extends Transporte {
    private int velas;

    // Constructor
    public VehiculoMaritimo(String marca, String modelo, int capacidad, int velas) {
        super(marca, modelo, capacidad);
        this.velas = velas;
    }

    // Getter y Setter
    public int getVelas() {
        return velas;
    }

    public void setVelas(int velas) {
        this.velas = velas;
    }

    // METODO PERSONALIZADO
    @Override
    public String toString() {
        return super.toString() + ", Velas: " + velas;
    }
}


