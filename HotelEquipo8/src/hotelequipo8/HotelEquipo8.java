
package hotelequipo8;

import consultas.baseDeDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HotelEquipo8 {

    public static void main(String[] args) {
        String datos[] = new String[7];
        datos[0]= "Luis";
        datos[1]= "Beltrán";
        datos[2]= "Arroyo";
        datos[3]="México";
        datos[4]="2021-05-23";
        datos[5]="2021-05-27";
        datos[6]="103";
        baseDeDatos b = new baseDeDatos();
        b.registrarUsuario(datos);
    }
}
