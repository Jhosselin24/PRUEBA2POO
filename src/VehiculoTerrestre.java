public class VehiculoTerrestre extends Transporte {
    private int ruedas;

    // Constructor
    public VehiculoTerrestre(String marca, String modelo, int capacidad, int ruedas) {
        super(marca, modelo, capacidad);
        this.ruedas = ruedas;
    }

    // Getter y Setter
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    // Metodo Personalizado
    @Override
    public String toString() {
        return super.toString() + ", Ruedas: " + ruedas;
    }
}

