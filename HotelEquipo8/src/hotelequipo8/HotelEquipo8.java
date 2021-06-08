
package hotelequipo8;
import consultas.baseDeDatos;
import java.util.ArrayList;

public class HotelEquipo8 {

    public static void main(String[] args) {
        baseDeDatos consulta = new baseDeDatos();
        ArrayList <String> info = new ArrayList();
        info = consulta.huespedesPiso("1");
        for(int i=0 ; i<info.size();i++){
            System.out.print(info.get(i));
            System.out.println("");
        }
    }
    
}
