import java.util.ArrayList;
import java.util.List;

import Vehiculo.Asiento;
import Vehiculo.Autobus;
import Vehiculo.Particular;
import Vehiculo.Taxi;
import Vehiculo.Vehiculo;

public class app {

    public static void main(String[] args) {

        Taxi taxi1 = new Taxi("Córdoba", "Seat", "7341hsfh34uf7yu8i", 5, Asiento.RECLINABLE, 10000, 5.7);
        Taxi taxi2 = new Taxi("Pryus", "Toyota", "7341hsfh34uf7yu8j", 5, Asiento.CALEFFACCION, 100000, 9.7);

        Particular particular1 = new Particular("AMG", "Mercedes", "37837oehrigeago0p", 3, Asiento.CUERO, "Juan de Dios", true);
        Particular particular2 = new Particular("Sportage", "KIA", "37837oehrigeago0ñ", 7, Asiento.CALEFFACCION, "Juan de Mena", true);

        Autobus autobus1 = new Autobus("Iveco", "Tata", "eahrtp9q8734hy9p4", 3, 11, 123);

        List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
        listaVehiculos.add(taxi1);
        listaVehiculos.add(taxi2);
        listaVehiculos.add(autobus1);
        listaVehiculos.add(particular1);
        listaVehiculos.add(particular2);

        System.out.println("El taxi1 es: " + taxi1);
        System.out.println("El vehiculo 1 de la lista es: " + listaVehiculos.get(0));

        // Arrays?

        Vehiculo[] arrayVehiculos = new Vehiculo[5];

        for (int i = 0; i < arrayVehiculos.length; i++) {
            arrayVehiculos[i] = listaVehiculos.get(i);
            
        }

        System.out.println("El taxi1 es: " + taxi1);
        System.out.println("El vehiculo 1 de la lista es: " + arrayVehiculos[0]);

    }

    public void mostrarVehiculos(String tipoVehiculo, ArrayList<Vehiculo> listaVehiculos) {



    }
    
}
