import java.util.ArrayList;
import java.util.List;

import Vehiculo.Asiento;
import Vehiculo.Autobus;
import Vehiculo.Particular;
import Vehiculo.Taxi;
import Vehiculo.Turismo;
import Vehiculo.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {

        Taxi taxi1 = new Taxi("Seat", "Ibiza", "0123456789abcdef@", 5, Asiento.RECLINABLE, 256000, 5.6);
        Taxi taxi2 = new Taxi("Seat", "Leon", "0123456789abcdef€", 3, Asiento.CALEFACCION, 1000, 7.2);

        Particular particular1 = new Particular("Seat", "Ibiza", "0123456789abcdef?", 5, Asiento.RECLINABLE, "Daniel",
                true);
        Particular particular2 = new Particular("Seat", "Ibiza", "0123456789abcdef¿", 3, Asiento.RECLINABLE, "Daniel",
                false);

        Autobus autobus = new Autobus("Iveco", "JXY", "0123456789abcdef#", 3, 60, 26);

        List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        listaVehiculos.add(taxi1);
        listaVehiculos.add(taxi2);
        listaVehiculos.add(particular1);
        listaVehiculos.add(particular2);
        listaVehiculos.add(autobus);

        // System.out.println("El taxi1 es: " + taxi1);
        // System.out.println("El vehículo 1 de la lista es: " + listaVehiculos.get(0));

        // y con array se puede heredar ??
        Vehiculo[] arrayVehiculos = new Vehiculo[5];
        for (int i = 0; i < arrayVehiculos.length; i++) {
            arrayVehiculos[i] = listaVehiculos.get(i);
        }
        // System.out.println("El taxi1 es: " + taxi1);
        // System.out.println("El vehículo 1 del array es: " + arrayVehiculos[0]);

        // mostrarVehiculos("taxi", listaVehiculos);
        // mostrarVehiculos("particular", listaVehiculos);
        // mostrarVehiculos("autobus", listaVehiculos);

        // comparamos los dos taxis.
        System.out.println(taxi1.compareTo(taxi2)!=taxi2.compareTo(taxi1));
        System.out.println(taxi1.compareTo(particular1));
        System.out.println(particular1.compareTo(taxi1));
        System.out.println(autobus.compareTo(taxi1));
        System.out.println(autobus.compareTo(particular1));
        System.out.println(taxi1.compareTo(autobus));
        System.out.println();
        System.out.println(taxi1 instanceof Vehiculo);
        System.out.println(autobus instanceof Vehiculo);
        System.out.println(taxi1 instanceof Turismo);
        System.out.println(autobus instanceof Object);

    }

    public static void mostrarVehiculos(String tipoVehiculo, List<Vehiculo> listaVehiculos) {
        System.out.println("************************************");
        System.out.println("Se muestran los vehículos del tipo: " + tipoVehiculo);
        System.out.println("************************************");
        for (int index = 0; index < listaVehiculos.size(); index++) {
            switch (tipoVehiculo) {
                case "taxi":
                    if (listaVehiculos.get(index).getClass().equals(Taxi.class) ) {
                        System.out.println(listaVehiculos.get(index));
                    }
                    break;
                case "particular":
                    if (listaVehiculos.get(index).getClass() == Particular.class) {
                        System.out.println(listaVehiculos.get(index));
                    }
                    break;
                case "autobus":
                    if (listaVehiculos.get(index).getClass() == Autobus.class) {
                        System.out.println(listaVehiculos.get(index));
                    }
                    break;
                default:
                    System.out.println("Error en tipo de vehículo introducido");
                    break;
            }
        }
    }
}