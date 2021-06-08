
package hotelequipo8;
import consultas.baseDeDatos;
import java.util.ArrayList;

public class HotelEquipo8 {

    public static void main(String[] args) {
        baseDeDatos consulta = new baseDeDatos();
        ArrayList<String> info = new ArrayList();
        info.add("Javier");
        info.add("Pérez");
        info.add("Sánchez");
        info.add("100");
        consulta.editarInformacion(info);
    }
    
}
