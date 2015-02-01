/***********************************************************************
 * Module:  Responsabilidades.java
 * Author:  George
 * Purpose: Defines the Class Responsabilidades
 ***********************************************************************/
package DP;
import java.util.*;

/** @pdOid 437e593e-47da-4aee-a241-cdd9cea26aca */
public class Responsabilidades {
   /** @pdOid ee39f535-36b1-4e2b-acfb-642a7c5f96aa */
   private String Codigo_Responsabilidad;
   /** @pdOid 5d7e4bbc-ec3f-419a-a96d-e4f34152c629 */
   private String Responsabilidad;
   /** @pdOid 7263980b-95cb-439c-a5fe-a109b1a6d3bd */
   private java.util.Date Tiempo_estimado;
   /** @pdOid b4b6445c-e114-437d-aaf3-71f23af71098 */
   private boolean Completo;
   
   /** @pdOid 6407d0d7-8389-43a8-8995-381d8971611c */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Hijos assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Hijos> hijos;
   
   /** @param oldResponsabilidades
    * @pdOid 0dfe758c-3f5a-4904-a6e7-0781dd03873b */
   public Responsabilidades(Responsabilidades oldResponsabilidades) {
      Codigo_Responsabilidad = oldResponsabilidades.Codigo_Responsabilidad;
      Responsabilidad = oldResponsabilidades.Responsabilidad;
      Tiempo_estimado = oldResponsabilidades.Tiempo_estimado;
      Completo = oldResponsabilidades.Completo;
   }
   
   /** @pdOid 3f72aa8f-e570-41b6-ac05-1fe803d25428 */
   public Responsabilidades() {
      // TODO: implement
   }
   
   /** @pdOid 4c09e5f1-18e6-4146-aa34-6a9aa54ff807 */
   public String getCodigo_Responsabilidad() {
      return Codigo_Responsabilidad;
   }
   
   /** @param newCodigo_Responsabilidad
    * @pdOid f3c1f98f-6305-4603-91fc-dbd575a00dbe */
   public void setCodigo_Responsabilidad(String newCodigo_Responsabilidad) {
      Codigo_Responsabilidad = newCodigo_Responsabilidad;
   }
   
   /** @pdOid 97e66599-7881-4b9c-b725-fd5e7ea46e8a */
   public String getResponsabilidad() {
      return Responsabilidad;
   }
   
   /** @param newResponsabilidad
    * @pdOid 48674552-a95d-4360-afa7-16cc0032485e */
   public void setResponsabilidad(String newResponsabilidad) {
      Responsabilidad = newResponsabilidad;
   }
   
   /** @pdOid d6307e94-63c5-4c63-936a-8891efff1d4a */
   public java.util.Date getTiempo_estimado() {
      return Tiempo_estimado;
   }
   
   /** @param newTiempo_estimado
    * @pdOid 30d898b3-d1d7-4ce9-be70-3ee796f0b95e */
   public void setTiempo_estimado(java.util.Date newTiempo_estimado) {
      Tiempo_estimado = newTiempo_estimado;
   }
   
   /** @pdOid d4a18c71-c320-4822-9e52-eea4ac88304a */
   public boolean getCompleto() {
      return Completo;
   }
   
   /** @param newCompleto
    * @pdOid bd331723-04a0-4ca7-87aa-5d0d4c8c98ee */
   public void setCompleto(boolean newCompleto) {
      Completo = newCompleto;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Hijos> getHijos() {
      if (hijos == null)
         hijos = new java.util.HashSet<Hijos>();
      return hijos;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHijos() {
      if (hijos == null)
         hijos = new java.util.HashSet<Hijos>();
      return hijos.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHijos */
   public void setHijos(java.util.Collection<Hijos> newHijos) {
      removeAllHijos();
      for (java.util.Iterator iter = newHijos.iterator(); iter.hasNext();)
         addHijos((Hijos)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHijos */
   public void addHijos(Hijos newHijos) {
      if (newHijos == null)
         return;
      if (this.hijos == null)
         this.hijos = new java.util.HashSet<Hijos>();
      if (!this.hijos.contains(newHijos))
         this.hijos.add(newHijos);
   }
   
   /** @pdGenerated default remove
     * @param oldHijos */
   public void removeHijos(Hijos oldHijos) {
      if (oldHijos == null)
         return;
      if (this.hijos != null)
         if (this.hijos.contains(oldHijos))
            this.hijos.remove(oldHijos);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHijos() {
      if (hijos != null)
         hijos.clear();
   }

}