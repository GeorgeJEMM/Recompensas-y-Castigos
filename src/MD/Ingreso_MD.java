/***********************************************************************
 * Module:  Consultas_MD.java
 * Author:  George
 * Purpose: Defines the Class Consultas_MD
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

/** @pdOid c49bbf7e-f55f-41c5-a133-1d23115221ea */
public class Ingreso_MD {
   /** @pdOid fcad23a2-77fc-4f3a-bbaa-465333d02d08 */
        private DP.Ingreso DPING;
    private Connection conexion;
    private Statement stm;
    private ResultSet resultado;
    private String query;
   public void Ingreso_MD(DP.Ingreso elDP) {
      // TODO: implement
       this.DPING=elDP;
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PRC", "postgres", "george1991");
            stm = conexion.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
   }
   
   /** @pdOid 7f1c7815-5c9a-4cbb-834f-6ee80baad02d */
  public void insertarIngreso() {
      // TODO: implement
       //----->query = "insert into \"castigos\" values("+DPING.getCodigo_Castigo()+", '"+DPCAS.getCastigo()+"', '"+DPCAS.getTiempo()+"', '"+DPCAS.getFecha_Inicio()+"', '"+DPCAS.getFecha_Fin()+"', '"+DPCAS.getCausa()+"');";
        try {
            stm.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }

   }
   
   /** @pdOid ef6a05c8-e6b9-4f69-a015-c73ad2de073e */
   public void consultarRecompensas() {
      // TODO: implement
   }
   
   /** @pdOid 087d5174-809c-4c48-84cd-6f2dcb8c0c20 */
   public void consultarResponsabilidades() {
      // TODO: implement
   }
   
   /** @pdOid e5d2ada3-74bc-4898-a9ba-128aaad89f50 */
  

}