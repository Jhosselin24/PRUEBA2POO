public class Main {
    public static void main(String[] args) {
        // Crear objetos de cada tipo de transporte
        Automovil auto = new Automovil("Toyota", "Corolla", 5, 4, "Sedán");
        Avion avion = new Avion("Boeing", "747", 350, 2, 4);
        Barco barco = new Barco("Carnival", "Vista", 2000, 3, 150);

        // Mostrar la información
        System.out.println(auto);
        System.out.println(avion);
        System.out.println(barco);
    }
}
