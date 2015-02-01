/***********************************************************************
 * Module:  Hijos.java
 * Author:  George
 * Purpose: Defines the Class Hijos
 ***********************************************************************/
package DP;
import java.util.*;

/** @pdOid e9c20253-242e-4e38-ae88-7bfc73cd3e38 */
public class Hijos {
   /** @pdOid 58073b6e-f036-4c1c-b497-1439d7afcd66 */
   private String Codigo_Hijo;
   /** @pdOid 1f8534e4-f1a0-4eaa-9fe9-c939fce4af97 */
   private String NombreHijo;
   /** @pdOid 0bcfc40b-7a96-41b1-99f2-7190e3f66628 */
   private String Apellido_Hijo;
   /** @pdOid e3e0cb2d-cba1-416f-85dc-2d87465561ed */
   private String Lugar_Hijo;
   /** @pdOid 45bd6a63-f332-4902-a891-07904d048b7e */
   private java.util.Date Fecha_Nacimiento_Hijo;
   
   /** @pdOid 13d05464-c981-4555-a02c-9daa97d73eee */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Ingreso assc=Association_1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Ingreso> ingreso;
   
   /** @param oldHijos
    * @pdOid a576a205-d777-4327-94c0-31fe54f5d743 */
   public Hijos(Hijos oldHijos) {
      Codigo_Hijo = oldHijos.Codigo_Hijo;
      NombreHijo = oldHijos.NombreHijo;
      Apellido_Hijo = oldHijos.Apellido_Hijo;
      Lugar_Hijo = oldHijos.Lugar_Hijo;
      Fecha_Nacimiento_Hijo = oldHijos.Fecha_Nacimiento_Hijo;
   }
   
   /** @pdOid 4fa4676a-5b56-4287-99fd-f91f2ab8a16d */
   public Hijos() {
      // TODO: implement
   }
   
   /** @pdOid 599e6916-1a37-458f-a85d-a29e6263a85e */
   public String getCodigo_Hijo() {
      return Codigo_Hijo;
   }
   
   /** @param newCodigo_Hijo
    * @pdOid d0ae20b1-bbc9-4c03-ab35-bfb04d758dae */
   public void setCodigo_Hijo(String newCodigo_Hijo) {
      Codigo_Hijo = newCodigo_Hijo;
   }
   
   /** @pdOid f8e14c8a-c764-4d3e-af43-b68d2eb6612b */
   public String getNombreHijo() {
      return NombreHijo;
   }
   
   /** @param newNombreHijo
    * @pdOid 8dd66d00-2d74-46e8-b84d-ddea644575e4 */
   public void setNombreHijo(String newNombreHijo) {
      NombreHijo = newNombreHijo;
   }
   
   /** @pdOid b63695d6-4286-4152-9b79-50d1741b0da0 */
   public String getApellido_Hijo() {
      return Apellido_Hijo;
   }
   
   /** @param newApellido_Hijo
    * @pdOid a8665ac4-57e3-4b4a-ac3a-eba2ca76b467 */
   public void setApellido_Hijo(String newApellido_Hijo) {
      Apellido_Hijo = newApellido_Hijo;
   }
   
   /** @pdOid df856f5f-a94b-4865-bc14-15ef7268e931 */
   public String getLugar_Hijo() {
      return Lugar_Hijo;
   }
   
   /** @param newLugar_Hijo
    * @pdOid 88efb898-c9af-40d9-ba81-fc1b82493767 */
   public void setLugar_Hijo(String newLugar_Hijo) {
      Lugar_Hijo = newLugar_Hijo;
   }
   
   /** @pdOid 950071ca-58f4-4c85-a3d8-4b7f44bc5dd3 */
   public java.util.Date getFecha_Nacimiento_Hijo() {
      return Fecha_Nacimiento_Hijo;
   }
   
   /** @param newFecha_Nacimiento_Hijo
    * @pdOid 0ea61874-cde1-4a28-80b0-8de526d63a49 */
   public void setFecha_Nacimiento_Hijo(java.util.Date newFecha_Nacimiento_Hijo) {
      Fecha_Nacimiento_Hijo = newFecha_Nacimiento_Hijo;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Ingreso> getIngreso() {
      if (ingreso == null)
         ingreso = new java.util.HashSet<Ingreso>();
      return ingreso;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIngreso() {
      if (ingreso == null)
         ingreso = new java.util.HashSet<Ingreso>();
      return ingreso.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIngreso */
   public void setIngreso(java.util.Collection<Ingreso> newIngreso) {
      removeAllIngreso();
      for (java.util.Iterator iter = newIngreso.iterator(); iter.hasNext();)
         addIngreso((Ingreso)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIngreso */
   public void addIngreso(Ingreso newIngreso) {
      if (newIngreso == null)
         return;
      if (this.ingreso == null)
         this.ingreso = new java.util.HashSet<Ingreso>();
      if (!this.ingreso.contains(newIngreso))
         this.ingreso.add(newIngreso);
   }
   
   /** @pdGenerated default remove
     * @param oldIngreso */
   public void removeIngreso(Ingreso oldIngreso) {
      if (oldIngreso == null)
         return;
      if (this.ingreso != null)
         if (this.ingreso.contains(oldIngreso))
            this.ingreso.remove(oldIngreso);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIngreso() {
      if (ingreso != null)
         ingreso.clear();
   }

}