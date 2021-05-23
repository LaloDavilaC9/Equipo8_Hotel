
package hotelequipo8;

import consultas.baseDeDatos;

public class HotelEquipo8 {

    public static void main(String[] args) {
        baseDeDatos b = new baseDeDatos();
        System.out.println(b.consultarIngresos());
    }
}
