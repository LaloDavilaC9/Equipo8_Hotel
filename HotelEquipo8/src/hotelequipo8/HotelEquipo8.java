
package hotelequipo8;

import consultas.baseDeDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HotelEquipo8 {

    public static void main(String[] args) {
        HashMap <String, String> lista = new HashMap();
        baseDeDatos b = new baseDeDatos();
        lista = b.habDisponibles();
        Iterator it = lista.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
