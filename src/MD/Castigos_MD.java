/***********************************************************************
 * Module:  Castigos_MD.java
 * Author:  George
 * Purpose: Defines the Class Castigos_MD
 ***********************************************************************/
package MD;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import DP.*; 
import java.sql.ResultSetMetaData;

import javax.swing.table.DefaultTableModel;

/** @pdOid 2b255850-ef95-4bc2-be31-de63e9288298 */
public class Castigos_MD {
   /** @pdOid b6d193cb-1b3c-4d4b-a473-f737b489f940 */
    private DP.Castigos DPCAS;
    private Connection conexion;
    private Statement stm;
    private ResultSet resultado;
    private String query;

    public Castigos_MD(DP.Castigos elDP) {
        this.DPCAS=elDP;
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PRC", "postgres", "george1991");
            stm = conexion.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
   public void insertarCastigos() {
      // TODO: implement
       query = "insert into \"castigos\" values("+DPCAS.getCodigo_Castigo()+", '"+DPCAS.getCastigo()+"', '"+DPCAS.getTiempo()+"', '"+DPCAS.getFecha_Inicio()+"', '"+DPCAS.getFecha_Fin()+"', '"+DPCAS.getCausa()+"');";
        try {
            stm.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }

   }
   
 
   public void modificarCastigos(String codigo_castigo,String castigo, java.util.Date tiempo, java.util.Date fecha_inicio, java.util.Date fecha_fin, String causa) {
      // TODO: implement
               try {   
stm.executeUpdate("update castigo set codigo_castigo='"+codigo_castigo+"'castigo='"+castigo+"',tiempo='"+tiempo+"',fecha_inicio='"+fecha_inicio+"',fecha_fin='"+fecha_fin+"',causa='"+causa+"'");     

        } catch (Exception e) {
            System.out.println(e);
        }

   }
   
   /** @pdOid 603f48da-af59-4322-8b9b-8c65ad5fe24d */
   public void borrarCastigos() {
      // TODO: implement
       query = "Delete from \"castigos\" where \"codigo_castigo\"='"+DPCAS.getCodigo_Castigo()+"'";
        try {
            stm.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }

   }   
}