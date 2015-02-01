/***********************************************************************
 * Module:  Castigos.java
 * Author:  George
 * Purpose: Defines the Class Castigos
 ***********************************************************************/
package DP;
import java.util.*;

/** @pdOid fa5796d2-94d5-445d-879e-4f0c3dd592ae */
public class Castigos {
   /** @pdOid 15e999ac-9dec-4d69-a682-28ceba1f0843 */
   private String Codigo_Castigo;
   /** @pdOid f79ef75c-a19a-420e-97a9-3228b0d65a56 */
   private String Castigo;
   /** @pdOid 3981ab82-6f04-4647-b9ae-32faf0922990 */
   private java.util.Date Tiempo;
   /** @pdOid 2ee1473e-05be-4f24-930b-982ee1970c87 */
   private java.util.Date Fecha_Inicio;
   /** @pdOid 9e3222ff-1773-49d5-bd94-782cffb1048f */
   private java.util.Date Fecha_Fin;
   /** @pdOid 45de0004-bef3-4902-86f6-59adad3b21c3 */
   private String Causa;
   
   /** @pdOid 54e2224b-13d0-49d8-8462-462ec4895628 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Hijos assc=Association_4 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Hijos hijos;
   
   /** @param oldCastigos
    * @pdOid 6433a2dc-19db-4c37-994c-04d02826dff7 */
   public Castigos(Castigos oldCastigos) {
      Codigo_Castigo = oldCastigos.Codigo_Castigo;
      Castigo = oldCastigos.Castigo;
      Tiempo = oldCastigos.Tiempo;
      Fecha_Inicio = oldCastigos.Fecha_Inicio;
      Fecha_Fin = oldCastigos.Fecha_Fin;
      Causa = oldCastigos.Causa;
   }
   
   /** @pdOid b6fe9ecc-10fd-4db1-9b1a-3d15e8ecbb45 */
   public Castigos() {
      // TODO: implement
   }
   
   /** @pdOid 736ac95e-a8f3-4176-b9bb-0ea77e5c35b6 */
   public String getCodigo_Castigo() {
      return Codigo_Castigo;
   }
   
   /** @param newCodigo_Castigo
    * @pdOid 314a80e2-1056-4391-8df0-9134b3f9fa48 */
   public void setCodigo_Castigo(String newCodigo_Castigo) {
      Codigo_Castigo = newCodigo_Castigo;
   }
   
   /** @pdOid 3146f8a1-1729-4cb2-810e-d9b9078bee3d */
   public String getCastigo() {
      return Castigo;
   }
   
   /** @param newCastigo
    * @pdOid bf063f44-180f-4141-9f68-ea93fe738367 */
   public void setCastigo(String newCastigo) {
      Castigo = newCastigo;
   }
   
   /** @pdOid d0ab8ae2-1a06-495e-9557-2f2b45334d2f */
   public java.util.Date getTiempo() {
      return Tiempo;
   }
   
   /** @param newTiempo
    * @pdOid 9f9c908e-6b41-4887-b6df-17777f98e6e2 */
   public void setTiempo(java.util.Date newTiempo) {
      Tiempo = newTiempo;
   }
   
   /** @pdOid f9691a4e-52b1-45a0-b60f-ef5fa8f79bb6 */
   public java.util.Date getFecha_Inicio() {
      return Fecha_Inicio;
   }
   
   /** @param newFecha_Inicio
    * @pdOid d653fb56-7922-4757-8466-9364c2719181 */
   public void setFecha_Inicio(java.util.Date newFecha_Inicio) {
      Fecha_Inicio = newFecha_Inicio;
   }
   
   /** @pdOid a26a6ec9-479c-4967-af76-0009312a43ab */
   public java.util.Date getFecha_Fin() {
      return Fecha_Fin;
   }
   
   /** @param newFecha_Fin
    * @pdOid f3715c14-1969-4baa-9949-883db6952fd8 */
   public void setFecha_Fin(java.util.Date newFecha_Fin) {
      Fecha_Fin = newFecha_Fin;
   }
   
   /** @pdOid f72bfb6a-daa4-476e-9417-310bc6dd88da */
   public String getCausa() {
      return Causa;
   }
   
   /** @param newCausa
    * @pdOid e9b22a20-4aa0-4d5c-866a-9fa04d4f4bf0 */
   public void setCausa(String newCausa) {
      Causa = newCausa;
   }

}