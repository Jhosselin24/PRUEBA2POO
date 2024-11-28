public class VehiculoAereo extends Transporte {
    private int alas;

    // Constructor
    public VehiculoAereo(String marca, String modelo, int capacidad, int alas) {
        super(marca, modelo, capacidad);
        this.alas = alas;
    }

    // Getter y Setter
    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    // METODO PERSONALIZADO
    @Override
    public String toString() {
        return super.toString() + ", Alas: " + alas;
    }
}
