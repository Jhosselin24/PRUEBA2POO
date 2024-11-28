public class Automovil extends VehiculoTerrestre {
    private String tipoCarroceria;

    // Constructor
    public Automovil(String marca, String modelo, int capacidad, int ruedas, String tipoCarroceria) {
        super(marca, modelo, capacidad, ruedas);
    }

    // Getter y Setter
    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    // METODO PERSONALIZADO
    @Override
    public String toString() {
        return super.toString() + ", Tipo de Carrocería: " + tipoCarroceria;
    }
}
