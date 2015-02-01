/***********************************************************************
 * Module:  Recompensas.java
 * Author:  George
 * Purpose: Defines the Class Recompensas
 ***********************************************************************/
package DP;
import java.util.*;

/** @pdOid 0da1e67a-f0c4-4eef-8daf-50dd6901384c */
public class Recompensas {
   /** @pdOid 33806a07-8517-4947-83d4-f4d783d4590c */
   private String Codigo_Recompensa;
   /** @pdOid 4758e606-2790-405c-9f54-8c5542752865 */
   private String Recompensa;
   /** @pdOid 30fa144c-d3bb-4e3b-94fd-1006bd4a3ed9 */
   private int Nivel;
   
   /** @pdOid b8eddbf1-5356-4f16-88c8-9c2c516a9ec3 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Hijos assc=Association_3 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Hijos hijos;
   
   /** @param oldRecompensas
    * @pdOid 821609fa-b4c5-4a5a-869c-ce2ccd4be464 */
   public Recompensas(Recompensas oldRecompensas) {
      Codigo_Recompensa = oldRecompensas.Codigo_Recompensa;
      Recompensa = oldRecompensas.Recompensa;
      Nivel = oldRecompensas.Nivel;
   }
   
   /** @pdOid fbbcb3fb-48de-4dcf-bd42-fddb08d77e15 */
   public Recompensas() {
      // TODO: implement
   }
   
   /** @pdOid 4ab17583-9515-4340-a973-f03e207d1216 */
   public String getCodigo_Recompensa() {
      return Codigo_Recompensa;
   }
   
   /** @param newCodigo_Recompensa
    * @pdOid c9758519-657c-4577-99ff-ba9f6a251158 */
   public void setCodigo_Recompensa(String newCodigo_Recompensa) {
      Codigo_Recompensa = newCodigo_Recompensa;
   }
   
   /** @pdOid a18968e1-ddc8-4b23-83ec-7f37b2283027 */
   public String getRecompensa() {
      return Recompensa;
   }
   
   /** @param newRecompensa
    * @pdOid 9a38bb03-e95f-43ec-b03a-a4592600ad9f */
   public void setRecompensa(String newRecompensa) {
      Recompensa = newRecompensa;
   }
   
   /** @pdOid f4902e99-42bc-4890-83bd-7ceb7a63f713 */
   public int getNivel() {
      return Nivel;
   }
   
   /** @param newNivel
    * @pdOid 2de97b82-b849-4b29-ad79-1220eea747d0 */
   public void setNivel(int newNivel) {
      Nivel = newNivel;
   }

}