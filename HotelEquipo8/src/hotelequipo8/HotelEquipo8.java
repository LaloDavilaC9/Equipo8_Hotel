
package hotelequipo8;

import consultas.baseDeDatos;
import java.util.ArrayList;

public class HotelEquipo8 {

    public static void main(String[] args) {
        ArrayList e = new ArrayList();
        baseDeDatos b = new baseDeDatos();
        e = b.consultaPorPiso("1");
        if(e==null)
            System.out.println("Nohay ni mangos");
        System.out.println(e);
    }
}
