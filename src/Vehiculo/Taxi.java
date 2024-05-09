package Vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable, Comparable {

    // Abtributos
    private static final double IMPORTE_INICIO = 2.00;
    private double kmRecorridos;
    private double importeKm;

    // Constructor
    public Taxi(String marca, String modelo, String numBastidor, int numPuertas, Asiento asiento,
            double kmRecorridos, double importeKm) {
        super(marca, modelo, numBastidor, numPuertas, asiento);
        this.kmRecorridos = kmRecorridos;
        this.importeKm = importeKm;
    }

    // Getters y Setters

    public double getIMPORTE_INICIO() {
        return IMPORTE_INICIO;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getImporteKm() {
        return importeKm;
    }

    public void setImporteKm(double importeKm) {
        this.importeKm = importeKm;
    }

    public String toString() {

        return super.toString() + "; Importe Inicio: " + IMPORTE_INICIO + "; Importe KM: "
                + this.importeKm + " ; Km Recorridos: " + this.kmRecorridos + "; Coste del trayecto: "
                + this.calcularCosteTrayecto();
    }

    // METODOS A IMPLEMENTAR

    @Override
    public double calcularCosteTrayecto() {

        return (IMPORTE_INICIO + (this.kmRecorridos * this.importeKm));
    }

    @Override
    public void reiniciarContador(double kilometros) {

        this.kmRecorridos = kilometros;
        System.out.println("El Taxi tiene acumulados un total de " + this.kmRecorridos + "km.");

    }

    @Override
    public double calcularPrecioAlquiler(int numDias) {

        return (numDias * 50.00);
    }

    @Override
    public int getMaxVelocidad() {

        return 200;
    }

    @Override
    public int compareTo(Object o) {

        if (o.getClass() == Taxi.class) {

            if (this.importeKm > ((Taxi) o).importeKm) {
                return 1;
                
            } else if (this.importeKm == ((Taxi) o).importeKm) {
                return 0;

            } else {
                return -1;

            }

        } else {
            return super.compareTo(o);

        }

    }

}
