public class Avion extends VehiculoAereo {
    private int motores;

    // Constructor
    public Avion(String marca, String modelo, int capacidad, int alas, int motores) {
        super(marca, modelo, capacidad, alas);
        this.motores = motores;
    }

    // Getter y Setter
    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    // METODO PERSONALIZADO
    @Override
    public String toString() {
        return super.toString() + ", Motores: " + motores;
    }
}

