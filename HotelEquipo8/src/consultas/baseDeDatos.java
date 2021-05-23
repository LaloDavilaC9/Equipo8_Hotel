
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
    
    

}
