
package hotelequipo8;

import consultas.baseDeDatos;

public class HotelEquipo8 {

    public static void main(String[] args) {
        int arreglo[] = new int[3];
        baseDeDatos b = new baseDeDatos();
        arreglo = b.consultarNumeroHabitaciones();
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
    }
}
