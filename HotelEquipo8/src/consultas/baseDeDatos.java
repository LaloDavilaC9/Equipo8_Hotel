
package consultas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class baseDeDatos {
    MySqlConn conn;
    public baseDeDatos(){
        conn = new MySqlConn();
    }
    
    //Consultas punto 2
    public float consultarIngresos(){
        String query = "SELECT ingresos_hotel FROM info_hotel";
        this.conn.Consult(query);
        try {
            return Float.parseFloat(conn.rs.getString("ingresos_hotel"));
        } catch (SQLException ex) {
            Logger.getLogger(baseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1.0f;
    }
    //Consultas punto 3
    
    public float[] consultarPorcentajesOcupacion(){
        float porcentajes[]= new float [3],ocupadas,totales;
        String querys[] = {"SELECT COUNT(Disponible) FROM habitaciones WHERE Disponible=0 AND Tipo_id=1\n" +"UNION\n" + "SELECT hab_sencillas FROM info_hotel",
        "SELECT COUNT(Disponible) FROM habitaciones WHERE Disponible=0 AND Tipo_id=2\n" + "UNION\n" + "SELECT hab_dobles FROM info_hotel",
        "SELECT COUNT(Disponible) FROM habitaciones WHERE Disponible=0 AND Tipo_id=3\n" + "UNION\n" + "SELECT hab_triples FROM info_hotel"};
       
        try {
            for(short i=0;i<3;i++){
                this.conn.Consult(querys[i]);
                ocupadas = Float.parseFloat(conn.rs.getString("COUNT(Disponible)"));
                conn.rs.next();
                totales = Float.parseFloat(conn.rs.getString("COUNT(Disponible)"));
                porcentajes[i] = ocupadas / totales * 100;
            }
            return porcentajes;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return porcentajes;
    }
    

}
