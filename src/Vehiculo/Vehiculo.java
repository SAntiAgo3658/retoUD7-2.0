package Vehiculo;

import java.io.File;
import java.io.Serializable;

public abstract class Vehiculo implements Comparable, Serializable {

    // Atributos
    private String marcaVehiculo;
    private String modeloVehiculo;
    private String numBastidor; // 17 digitos
    private int numPuertas;

    private static int cantVehiculos = 0;

    // Constructor

    public Vehiculo(String marca, String modelo, String numeroBast, int numPuertas) {
        this.marcaVehiculo = marca;
        this.modeloVehiculo = modelo;
        if (numeroBast.length() == 17) {
            this.numBastidor = numeroBast;
        } else {
            this.numBastidor = null;
        }
        this.numPuertas = numPuertas;
        cantVehiculos++;
    }

    // Getters y setters

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public static int getCantVehiculos() {
        return cantVehiculos;
    }

    @Override
    public String toString() {
        return "Marca: " + this.getMarcaVehiculo() + "; Modelo: " + this.getModeloVehiculo()
                + "; Nbastidor: " + this.getNumBastidor() + "; Npuertas: " + this.getNumPuertas();
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Vehiculo) {
            return (this.numBastidor.compareTo(((Vehiculo) o).numBastidor));

        } else {
            return 1;

        }

    }

    // Guardar

    public void guardarVehiculo(File File) {

        

    }

}
