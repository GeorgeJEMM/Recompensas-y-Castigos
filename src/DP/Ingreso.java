/***********************************************************************
 * Module:  Ingreso.java
 * Author:  George
 * Purpose: Defines the Class Ingreso
 ***********************************************************************/
package DP;
import java.util.*;

/** @pdOid 87485e44-37af-4fc9-ae08-6ba3b4e1f310 */
public class Ingreso {
   /** @pdOid 68a64405-0736-4f6e-9686-2665db73415b */
   private String Usuario;
   /** @pdOid 4b40518f-cc7a-4d8c-b83b-78ca1105f9f4 */
   private String Clave_usuario;
   /** @pdOid 66f734c3-448a-448e-b6c5-4101dab064d3 */
   private String Tipo_Usuario;
   
   /** @pdOid f18e02bc-0951-49a3-9108-716f11dc27f6 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid c571e266-d6b7-42ef-93bf-70e9dc72599c */
   public Ingreso() {
      // TODO: implement
   }
   
   /** @param oldIngreso
    * @pdOid a242ce51-b20c-4fed-b760-932840d4dac6 */
   public Ingreso(Ingreso oldIngreso) {
      Usuario = oldIngreso.Usuario;
      Clave_usuario = oldIngreso.Clave_usuario;
      Tipo_Usuario = oldIngreso.Tipo_Usuario;
   }
   
   /** @pdOid abb4ccff-c6b0-480f-a34d-2eaa062baa6e */
   public String getUsuario() {
      return Usuario;
   }
   
   /** @param newUsuario
    * @pdOid 5e2b2b12-0d7d-4333-917f-8c521f72925c */
   public void setUsuario(String newUsuario) {
      Usuario = newUsuario;
   }
   
   /** @pdOid 797c4b15-36e0-4616-96df-cfb5f046a9a7 */
   public String getClave_usuario() {
      return Clave_usuario;
   }
   
   /** @param newClave_usuario
    * @pdOid c5ad11cd-9bf0-4a07-8380-9f1d24c6ed58 */
   public void setClave_usuario(String newClave_usuario) {
      Clave_usuario = newClave_usuario;
   }
   
   /** @pdOid ec901184-6551-4eb7-8bba-814bd4b194a3 */
   public String getTipo_Usuario() {
      return Tipo_Usuario;
   }
   
   /** @param newTipo_Usuario
    * @pdOid 9956ca8b-4ac7-4822-a4b6-68a60dd63cd0 */
   public void setTipo_Usuario(String newTipo_Usuario) {
      Tipo_Usuario = newTipo_Usuario;
   }

}