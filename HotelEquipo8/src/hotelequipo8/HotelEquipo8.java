
package hotelequipo8;

import consultas.baseDeDatos;

public class HotelEquipo8 {

    public static void main(String[] args) {
        baseDeDatos b = new baseDeDatos();
        float arreglo = b.consultarPorcentajeTotalOcupacion();
        System.out.println(arreglo);
        
    }
}
