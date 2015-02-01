/***********************************************************************
 * Module:  Padres.java
 * Author:  George
 * Purpose: Defines the Class Padres
 ***********************************************************************/
package DP;
import java.util.*;

/** @pdOid a818c061-2d46-4dbf-8936-4ef8d68fba82 */
public class Padres {
   /** @pdOid 60d47c41-e27b-4d74-a74f-498563d61c26 */
   private String Codigo_Padre;
   /** @pdOid cb3ee2f1-4ea1-426d-8982-38b604c036db */
   private String Nombre_Padre;
   /** @pdOid da09dcfa-e96a-4379-b12c-07d276f5ae7f */
   private String Apellido_Padre;
   /** @pdOid 2d3b2b3e-b95f-45f8-95d1-3a390716629d */
   private java.util.Date Fecha_nacimiento_Padre;
   /** @pdOid fe919ad1-1584-4283-8311-8ed22a2952b0 */
   private String Parentesco_;
   /** @pdOid 7ac1c015-5eb5-4028-b5e7-e8dfde7bea51 */
   private int Numero_Hijos;
   /** @pdOid 680bb1ba-191f-43de-b285-d39c62fd2ad7 */
   private boolean Casado_a;
   
   /** @pdOid a7d888db-9132-4f38-87e9-8f58e1424710 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Ingreso assc=Association_6 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Ingreso> ingreso;
   
   /** @param oldPadres
    * @pdOid 85a62b66-5c7a-4bdb-8b8e-12039e55635f */
   public Padres(Padres oldPadres) {
      Codigo_Padre = oldPadres.Codigo_Padre;
      Nombre_Padre = oldPadres.Nombre_Padre;
      Apellido_Padre = oldPadres.Apellido_Padre;
      Fecha_nacimiento_Padre = oldPadres.Fecha_nacimiento_Padre;
      Parentesco_ = oldPadres.Parentesco_;
      Numero_Hijos = oldPadres.Numero_Hijos;
      Casado_a = oldPadres.Casado_a;
   }
   
   /** @pdOid 3b4878d4-6fa0-400d-b821-086fade9013f */
   public Padres() {
      // TODO: implement
   }
   
   /** @pdOid 67cc3e47-2ca8-40b4-99a3-16e1cf2f1310 */
   public String getCodigo_Padre() {
      return Codigo_Padre;
   }
   
   /** @param newCodigo_Padre
    * @pdOid 12c39644-95f0-4aa4-b5b0-0bdcfe5703a0 */
   public void setCodigo_Padre(String newCodigo_Padre) {
      Codigo_Padre = newCodigo_Padre;
   }
   
   /** @pdOid 8c6506b5-210d-44a9-a2ab-43bdd12c0c9f */
   public String getNombre_Padre() {
      return Nombre_Padre;
   }
   
   /** @param newNombre_Padre
    * @pdOid 85334ecf-2545-4df5-b89c-136dd6482171 */
   public void setNombre_Padre(String newNombre_Padre) {
      Nombre_Padre = newNombre_Padre;
   }
   
   /** @pdOid bf44941a-8989-4ae2-a441-99c0a3882e09 */
   public String getApellido_Padre() {
      return Apellido_Padre;
   }
   
   /** @param newApellido_Padre
    * @pdOid 7e51a2e3-74f4-45b1-b3dc-d5b81bbf01ba */
   public void setApellido_Padre(String newApellido_Padre) {
      Apellido_Padre = newApellido_Padre;
   }
   
   /** @pdOid 1c1c19f9-c3dc-41d7-92ab-6afbfa072653 */
   public java.util.Date getFecha_nacimiento_Padre() {
      return Fecha_nacimiento_Padre;
   }
   
   /** @param newFecha_nacimiento_Padre
    * @pdOid dbab6c19-6c5b-45ac-93e1-3b780b62c32e */
   public void setFecha_nacimiento_Padre(java.util.Date newFecha_nacimiento_Padre) {
      Fecha_nacimiento_Padre = newFecha_nacimiento_Padre;
   }
   
   /** @pdOid 6f8be135-cc74-4542-b33a-22c064eb404b */
   public String getParentesco_() {
      return Parentesco_;
   }
   
   /** @param newParentesco_
    * @pdOid aaadc28e-e68e-40ef-9a79-93b2c847213c */
   public void setParentesco_(String newParentesco_) {
      Parentesco_ = newParentesco_;
   }
   
   /** @pdOid a326654a-1e96-42a8-bb1c-def634c3ea21 */
   public int getNumero_Hijos() {
      return Numero_Hijos;
   }
   
   /** @param newNumero_Hijos
    * @pdOid d5daf817-6a88-4d29-b345-4a6823e21f1e */
   public void setNumero_Hijos(int newNumero_Hijos) {
      Numero_Hijos = newNumero_Hijos;
   }
   
   /** @pdOid 37aa7922-82c1-4fa6-9fb1-bf5c9ebc9542 */
   public boolean getCasado_a() {
      return Casado_a;
   }
   
   /** @param newCasado_a
    * @pdOid 546bade9-485a-4f24-9abc-ec28f4386cf0 */
   public void setCasado_a(boolean newCasado_a) {
      Casado_a = newCasado_a;
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