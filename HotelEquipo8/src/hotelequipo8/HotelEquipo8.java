
package hotelequipo8;

import consultas.baseDeDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HotelEquipo8 {

    public static void main(String[] args) {
        baseDeDatos b = new baseDeDatos();
        ArrayList <String> lista = new ArrayList();
        lista = b.datosCobro("102");
        System.out.println(lista);
    }
}
