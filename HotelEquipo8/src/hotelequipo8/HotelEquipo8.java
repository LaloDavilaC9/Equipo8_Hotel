
package hotelequipo8;

import consultas.baseDeDatos;

public class HotelEquipo8 {

    public static void main(String[] args) {
        baseDeDatos b = new baseDeDatos();
        float [] arreglo = b.consultarCostosHabitaciones();
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
    }
}
