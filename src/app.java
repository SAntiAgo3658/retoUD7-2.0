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

        System.out.println(taxi1);
        System.out.println(taxi2);
        System.out.println(particular1);
        System.out.println(particular2);
        System.out.println(autobus1);

        System.out.println("total de vehículos funcionando: " + Vehiculo.getCantVehiculos());

        taxi1.reiniciarContador(200);
        System.out.println("El coste de trayecto del taxi con bastidor " + taxi1.getNumBastidor() + " es de: " + taxi1.calcularCosteTrayecto());

        System.out.println(taxi1);
        
    }
    
}
