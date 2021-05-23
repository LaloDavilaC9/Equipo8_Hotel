
package hotelequipo8;

import consultas.baseDeDatos;

public class HotelEquipo8 {

    public static void main(String[] args) {
        float arreglo[] = new float[3];
        baseDeDatos b = new baseDeDatos();
        arreglo = b.consultarPorcentajesOcupacion();
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
    }
}
