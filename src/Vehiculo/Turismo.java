package Vehiculo;

public abstract class Turismo extends Vehiculo implements Comparable {

    private Asiento tipoAsiento;

    // CONSTRUCTOR
    public Turismo(String marca, String modelo, String numBastidor, int numPuertas, Asiento tipoAsiento) {
        super(marca, modelo, numBastidor, numPuertas);
        this.tipoAsiento = tipoAsiento;
    }

    // GETTERS Y SETTERS
    public Asiento getAsiento() {
        return tipoAsiento;
    }

    public void setAsiento(Asiento asiento) {
        this.tipoAsiento = asiento;
    }

    // ToString
    @Override
    public String toString() {

        return super.toString() + "; TipoAsiento: " + this.getAsiento();
    }

    // Metodos abstractos

    public abstract double calcularPrecioAlquiler(int numDias);

    public abstract int getMaxVelocidad();

    // CompareTo

    @Override
    public int compareTo(Object o) {

        if (o instanceof Turismo) {

            if ((this.tipoAsiento == Asiento.CALEFACCION) && (((Turismo) o).tipoAsiento != Asiento.CALEFACCION)) {
                return 1;

            } else if ((this.tipoAsiento == Asiento.CUERO) && (((Turismo) o).tipoAsiento == Asiento.RECLINABLE)) {
                return 1;

            } else if ((this.tipoAsiento == Asiento.RECLINABLE) && (((Turismo) o).tipoAsiento != Asiento.RECLINABLE)) {
                return -1;

            } else if ((this.tipoAsiento == Asiento.CUERO) && (((Turismo) o).tipoAsiento == Asiento.CALEFACCION)) {
                return -1;

            } else {
                return 0;

            }

        } else {
            return super.compareTo(o);

        }

    }

}
