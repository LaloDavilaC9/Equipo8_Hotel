
package consultas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
    
    //Consultas punto 4
    public int [] consultarNumeroHabitaciones(){
        String query = "SELECT hab_sencillas,hab_dobles,hab_triples FROM info_hotel";
        int habitaciones[] = new int [3];
        try {
            this.conn.Consult(query);
            habitaciones[0] = Integer.parseInt(conn.rs.getString("hab_sencillas"));
            habitaciones[1] = Integer.parseInt(conn.rs.getString("hab_dobles"));
            habitaciones[2] = Integer.parseInt(conn.rs.getString("hab_triples"));
            return habitaciones;
        } catch (SQLException ex) {
            Logger.getLogger(baseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }
    
    //Consultas punto 5
    public float consultarPorcentajeTotalOcupacion(){
        String query = "SELECT COUNT(Disponible) FROM habitaciones WHERE Disponible=0";
        String query2= "SELECT hab_sencillas + hab_dobles + hab_triples AS suma FROM info_hotel";
        float ocupadas,totales,porcentaje=0;
        try{
            this.conn.Consult(query);
            ocupadas = Float.parseFloat(conn.rs.getString("COUNT(Disponible)"));
            this.conn.Consult(query2);
            totales = Float.parseFloat(conn.rs.getString("suma"));
            porcentaje = ocupadas / totales * 100;
            return porcentaje;
        }
        catch(SQLException ex){
             Logger.getLogger(baseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return porcentaje;
    }
    
    //Consultas punto 6
    public float[] consultarCostosHabitaciones(){
        String query = "SELECT Tipo_costo FROM tipos_hab";
        float costos[] = new float[3];
        try{
            this.conn.Consult(query);
            for(short i=0;i<3;i++){
                costos[i] = Float.parseFloat(conn.rs.getString("Tipo_costo"));
                conn.rs.next();
            }
            return costos;
        }
        catch(SQLException ex){
             Logger.getLogger(baseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return costos;
    }
    
    //Consultas punto 7
    public String consultaDatoHuesped(String info[]){
        String resultado="",query="SELECT huespedes.No_Habitacion, habitaciones.Piso FROM huespedes INNER JOIN habitaciones ON huespedes.No_Habitacion = habitaciones.Hab_id WHERE huespedes.nombre = '"+info[0]+"' AND huespedes.Ap_Paterno = '"+info[1]+"' AND huespedes.Ap_Materno ='"+info[2]+"'";
        int j;
        try{
            this.conn.Consult(query);
            resultado+=info[0]+" "+info[1]+" "+info[2]+" habitación "+this.conn.rs.getString("No_habitacion")+" Piso: "+this.conn.rs.getString("Piso");
            return resultado;
        }
        catch(SQLException ex){
            resultado = "Huésped no registrado";
        }
        return resultado;
    }
    //Consultas punto 8
    public String consultaQuienHabita(int nHabitacion){
        String query = "SELECT nombre,Ap_paterno,Ap_materno FROM huespedes WHERE No_habitacion = "+nHabitacion+" ";
        String resultado="";
        try{
            this.conn.Consult(query);
            resultado+="La habitación "+nHabitacion+" está ocupada "
                    + "por "+this.conn.rs.getString("nombre")+" "+this.conn.rs.getString("Ap_paterno")+" "
                    + this.conn.rs.getString("Ap_materno");
            return resultado;
        }
        catch(SQLException ex){
            resultado = "Habitación no ocupada por nadie";
        }
        return resultado;
    }
    //Consultas punto 9
    public ArrayList consultaPorPiso(String piso){
        String query="SELECT Hab_id,Tipo_id FROM habitaciones WHERE Disponible=1 AND Piso="+piso;
        ArrayList <ArrayList<String>> disponibles = new ArrayList();
        ArrayList<String> sencillas = new ArrayList(),dobles= new ArrayList(),triples= new ArrayList();
        String resultado="";
        try{
            this.conn.Consult(query);
            do{
                resultado = this.conn.rs.getString("Hab_id");
                switch(this.conn.rs.getString("Tipo_id")){
                    case "1":
                        sencillas.add(resultado);
                        break;
                    case "2":
                        dobles.add(resultado);
                        break;
                    case "3":
                       triples.add(resultado);
                }
            }while(this.conn.rs.next());
            disponibles.add(sencillas);
            disponibles.add(dobles);
            disponibles.add(triples);
            return disponibles;
        }
        catch(SQLException ex){
            disponibles=null;
        }
        return disponibles;
    }
    //Consultas punto 10
    
    public HashMap <String,String>consultaListaAlfabetica(){
        HashMap <String,String> lista = new HashMap();
        String query = "SELECT nombre, Ap_Paterno,Ap_Materno, No_habitacion FROM huespedes WHERE activo = 1";
        String nombre="";
        try{
            this.conn.Consult(query);
            do{
                nombre=this.conn.rs.getString("nombre");
                nombre+=" "+this.conn.rs.getString("Ap_paterno");
                nombre+=" "+this.conn.rs.getString("Ap_materno");
                lista.put(nombre, this.conn.rs.getString("No_habitacion"));
            }while(this.conn.rs.next());
            
            return lista;
        }
        catch(SQLException ex){
            lista = null;
        }
        return lista;
    }
    
    public void registrarHuesped(String datos[]){
        //datos[4] = "YYYY-mm-DD"
        //datos[5] = "YYYY-mm-DD" ya sumada
        String query="INSERT INTO `huespedes` (`huesped_id`, `nombre`, `Ap_Paterno`, `Ap_Materno`, `Ciudad`, `Ingreso`, `Salida`, `No_Habitacion`, `Activo`) VALUES (NULL, '"+datos[0]+"', '"+datos[1]+"', '"+datos[2]+"', '"+datos[3]+"', "
                + "'"+datos[4]+"', '"+datos[5]+"', "
                + "'"+datos[6]+"', '1');";
        this.conn.Update(query);
    }
    
    
    
}
