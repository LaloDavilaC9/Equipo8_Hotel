
package hotelequipo8;

import consultas.baseDeDatos;

public class HotelEquipo8 {

    public static void main(String[] args) {
        baseDeDatos b = new baseDeDatos();
        String info[]={"Brayan","Gaytán","Sánchez"};
        System.out.println(b.consultaDatoHuesped(info));
    }
}
