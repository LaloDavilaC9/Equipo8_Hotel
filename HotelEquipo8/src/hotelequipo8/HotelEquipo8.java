
package hotelequipo8;

import consultas.baseDeDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HotelEquipo8 {

    public static void main(String[] args) {
        HashMap <String,String> lista = new HashMap();
        ArrayList e = new ArrayList();
        baseDeDatos b = new baseDeDatos();
        lista = b.consultaListaAlfabetica();
        Iterator it = lista.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry x = (Map.Entry)it.next();
            System.out.println(x.getKey() + " -> " + x.getValue());
        }
    }
}
