
package consultas;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

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
            resultado+=info[0]+" "+info[1]+" "+info[2]+" habitaci??n "+this.conn.rs.getString("No_habitacion")+" Piso: "+this.conn.rs.getString("Piso");
            return resultado;
        }
        catch(SQLException ex){
            resultado = "Hu??sped no registrado";
        }
        return resultado;
    }
    //Consultas punto 8
    public String consultaQuienHabita(int nHabitacion){
        String query = "SELECT nombre,Ap_paterno,Ap_materno FROM huespedes WHERE No_habitacion = "+nHabitacion+" ";
        String resultado="";
        try{
            this.conn.Consult(query);
            resultado+="La habitaci??n "+nHabitacion+" est?? ocupada "
                    + "por "+this.conn.rs.getString("nombre")+" "+this.conn.rs.getString("Ap_paterno")+" "
                    + this.conn.rs.getString("Ap_materno");
            return resultado;
        }
        catch(SQLException ex){
            resultado = "Habitaci??n no ocupada por nadie";
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
    
    //Consulta EXTRA, info de los huespedes por PISO
    public ArrayList<String> huespedesPiso(String piso){
        String query = "SELECT huespedes.No_Habitacion, huespedes.Nombre,huespedes.Ap_Paterno,huespedes.Ap_Materno,huespedes.Ciudad,huespedes.Ingreso,huespedes.Salida FROM huespedes INNER JOIN habitaciones ON huespedes.No_Habitacion = habitaciones.Hab_id WHERE habitaciones.piso = "+piso;
        String informacion = "";
        ArrayList<String> info = new ArrayList<String>();
        try{
            this.conn.Consult(query);
            do{
                informacion+=" "+this.conn.rs.getString("No_Habitacion");
                informacion+=" "+(this.conn.rs.getString("Nombre"));
                informacion+=" "+(this.conn.rs.getString("Ap_Paterno"));
                informacion+=" "+(this.conn.rs.getString("Ap_Materno"));
                informacion+=" "+(this.conn.rs.getString("Ciudad"));
                informacion+=" "+(this.conn.rs.getString("Ingreso"));
                informacion+=" "+(this.conn.rs.getString("salida"));
                info.add(informacion);
                informacion="";
            }while(this.conn.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No hay ningun huesped en ese piso");
        }
        return info;
        
    }
    
    public void registrarHuesped(String datos[]){
        //datos[4] = "YYYY-mm-DD"
        //datos[5] = "YYYY-mm-DD" ya sumada
        String parte1 = "Insert into huespedes (Nombre, Ap_Paterno, Ap_Materno, Ciudad, Ingreso, Salida, No_Habitacion, Huespedes,Activo,diasHospedaje) VALUES (";
        String parte2 = "'" + datos[1] + "','" + datos[2] + "','" + datos[3] + "','" + datos[4] + "','" + datos[5] + "','" + datos[6] + "','" + datos[7] + "','" + datos[8] + "','" + "1"+ "','" + datos[9] +"')";
        String query = parte1 + parte2;
        System.out.println(query);
        this.conn.Update(query);
        query="UPDATE `habitaciones` SET `Disponible` = '0', `ocupantes` = "+datos[8]+" WHERE `habitaciones`.`Hab_id` = "+datos[7];
        this.conn.Update(query);
    }
    
    public HashMap <String,String> habDisponibles(){
        HashMap <String,String> lista = new HashMap();
        String query="SELECT Tipo_id,Hab_id FROM habitaciones WHERE Disponible=1";
        try{
            this.conn.Consult(query);
            do
               lista.put(this.conn.rs.getString("Hab_id"), this.conn.rs.getString("Tipo_id"));
            while(this.conn.rs.next());
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No hay habitaciones disponibles");
            lista = null;
        }
        return lista;
    }
    
    public void bajaHuesped(String habitacion){
        String query="DELETE FROM huespedes WHERE No_Habitacion = "+habitacion;
        this.conn.Update(query);
        query="UPDATE `habitaciones` SET `Disponible` = '1', `ocupantes` = 0 WHERE `habitaciones`.`Hab_id` = "+habitacion;
        this.conn.Update(query);
    }
    
    public boolean habOcupada(String habitacion){
        String query="SELECT disponible FROM habitaciones WHERE Hab_id = "+habitacion;
        try{
            this.conn.Consult(query);
            //Habitaci??n ocupada
            return this.conn.rs.getString("disponible").equals("0");
        }
        catch(SQLException ex){
            return false;
        }
    }
    
    public ArrayList<String> datosCobro(String habitacion){
        //Datos[0] = Nombre completo ...
        ArrayList<String> datos = new ArrayList();
        String tipo="",entrada="",salida="",costo="",dias="";
        String query="SELECT * FROM huespedes WHERE No_Habitacion="+habitacion;
        try{
            this.conn.Consult(query);
            datos.add(this.conn.rs.getString("nombre")+" "+this.conn.rs.getString("Ap_paterno")+" "+this.conn.rs.getString("Ap_materno"));
            datos.add(this.conn.rs.getString("Ciudad"));
            entrada=this.conn.rs.getString("Ingreso");
            datos.add(entrada);
            salida=this.conn.rs.getString("Salida");
            datos.add(salida);
            //Tipo de habitaci??n
            query= "SELECT Tipo_Id FROM habitaciones WHERE Hab_id="+habitacion;
            this.conn.Consult(query);
            tipo=this.conn.rs.getString("Tipo_Id");
            datos.add(tipo);
            //Costo
            query= "SELECT Tipo_costo FROM tipos_hab WHERE Tipo_id = "+tipo;
            this.conn.Consult(query);
            costo=this.conn.rs.getString("Tipo_costo");
            datos.add(costo);
            //D??as que se qued??
            dias=""+diferenciaFechas(entrada,salida);
            datos.add(dias);
            //Total a pagar sin cargos extra
            switch(tipo){
                case "1":
                    datos.add(""+(Float.parseFloat(costo)*Integer.parseInt(dias)));
                    break;
                case "2":
                    datos.add(""+(Float.parseFloat(costo)*Integer.parseInt(dias)*2));
                    break;
                case "3":
                    datos.add(""+(Float.parseFloat(costo)*Integer.parseInt(dias)*3));
                    break;
            }
            return datos;
        }
        catch(SQLException ex){
            System.out.println("");
            return null;
        }
    }
    
    public void actualizarIngresos(float total){
        String query="SELECT ingresos_hotel FROM info_hotel";
        float ingresos;
        try{
            this.conn.Consult(query);
            ingresos=Float.parseFloat(this.conn.rs.getString("ingresos_hotel"));
            ingresos+=total;
            query="UPDATE info_hotel SET ingresos_hotel="+ingresos;
            this.conn.Update(query);
        }
        catch(SQLException ex){
            
        }
    }
    
    public ArrayList<String> datosHotel(){
        ArrayList<String> lista = new ArrayList();
        String query="SELECT nombre_hotel,slogan_hotel,direccion_hotel FROM info_hotel";
        try{
            this.conn.Consult(query);
            lista.add(this.conn.rs.getString("nombre_hotel"));
            lista.add(this.conn.rs.getString("slogan_hotel"));
            lista.add(this.conn.rs.getString("direccion_hotel"));
        }
        catch(SQLException ex){
            lista=null;
        }
        return lista;
        
    }
    
    public float consultarCostoExtra(String tipoHabitacion){
        String query = "SELECT Tipo_cargoExtra FROM Tipos_hab WHERE "
                + "Tipo_id="+tipoHabitacion;
        try{
            this.conn.Consult(query);
            return Float.parseFloat(this.conn.rs.getString("Tipo_cargoExtra"));
        }
        catch(SQLException ex){
            return 1;
        }
    }

    public boolean consultarInicioSesion(String usuario, String contrasena) {
        String cuenta, contrase??a, query;

        query = "select * from cuentas where usuario = " + "'" + usuario + "'";
        this.conn.Consult(query);
        try {
            String contrase??aMySql = this.conn.rs.getString(2);
            /*char[] passw = this.jPasswordFieldLogin.getPassword();
             contrase??a = new String (passw);*/

            String contrase??aencriptada = DigestUtils.md5Hex(contrasena);
            if (contrase??aMySql.equals(contrase??aencriptada)) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error dentro de la consulta");
        }
        return false;
    }
    
    //M??todo para editar informaci??n del h??esped
    
    public void editarInformacion(ArrayList <String> info){
        //info[0] = Nombre
        //info[1] = Ap paterno
        //info[2] = Ap materno
        //info[3] = No habitaci??n
        String query = "UPDATE huespedes SET Nombre = '"+info.get(0)+"', Ap_Paterno='"+info.get(1)+"', Ap_Materno='"+info.get(2)+"' WHERE No_habitacion = "+info.get(3);
        if(this.habOcupada(info.get(3))){
            this.conn.Update(query);  
            JOptionPane.showMessageDialog(null, "Datos del huesped actualizados");
        }else{
            JOptionPane.showMessageDialog(null, "Verifique que su informaci??n sea correcta");
        }
    }
    
    private long diferenciaFechas(String salida, String entrada){
         SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date ini = formato.parse(entrada);
            Date fin = formato.parse(salida);
            return TimeUnit.MILLISECONDS.toDays((ini.getTime() - fin.getTime()));
        } catch (ParseException ex) {
            System.out.println("Error en el formato");
        }
        return 0;
    }
    public String[] consultaCheckOut(int nHabitacion){
        String info [] = new String [19];
        String query = "select * from huespedes where No_Habitacion = " + "'" +nHabitacion+ "'";
        int j;
        String tipo = "";
        try{
            this.conn.Consult(query);
            info[0] = this.conn.rs.getString(2); //Nombre
            info[1] = this.conn.rs.getString(3); //Apellido P.
            info[2] = this.conn.rs.getString(4); //Apellido M.
            info[3] = this.conn.rs.getString(5); //Ciudad.
            info[4] = this.conn.rs.getString(6); //Fecha ingreso.
            info[5] = this.conn.rs.getString(7); //Fecha salida.
            info[6] = this.conn.rs.getString(9); //Huespedes en la habitacion.
            info[7] = this.conn.rs.getString(11); //Dias de hospedaje.
            int aux2 = nHabitacion;
            if (aux2 >= 101 && aux2 <= 105 || aux2 >= 201 && aux2 <= 203 || aux2 >= 301 && aux2 <= 306) {//Para el tipo 1
                tipo = "Sencilla";
                info[8] = "Osaka (Sencilla)";//Tipo de habitacion.
            }
            if (aux2 >= 106 && aux2 <= 111 || aux2 >= 204 && aux2 <= 210 || aux2 >= 307 && aux2 <= 309) {//Para el tipo 2
                tipo = "Doble";
                info[8] = "Osaka (Sencilla)";//Tipo de habitacion.
            }
            if (aux2 >= 112 && aux2 <= 115 || aux2 >= 211 && aux2 <= 215 || aux2 >= 310 && aux2 <= 315) {//Para el tipo 3
                tipo = "Triple";
                info[8] = "Osaka (Sencilla)";//Tipo de habitacion.
            }
            query = "select * from tipos_hab where tipo_modelo = " + "'" +tipo+ "'";
            this.conn.Consult(query);
            info[9] = this.conn.rs.getString(3); //Costo habitacion.
            info[10] = this.conn.rs.getString(4); //Costo extra.
            //Borramos al huesped de la BDD.
            query = "DELETE FROM huespedes WHERE No_Habitacion = " + "'" +nHabitacion+ "'";
            this.conn.Update(query);
            //Habilitamos la habitacion para su uso.
            query="UPDATE habitaciones SET Disponible = '1', ocupantes = '0' WHERE habitaciones.Hab_id = "+nHabitacion;
            this.conn.Update(query);
            return info;
        }
        catch(SQLException ex){
            System.out.println("Error");
        }
        return info;
    }
    
}
