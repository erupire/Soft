/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Alain
 */
public class AdminDTO {
    
    private String userNameAdmin,userPasswordAdmin,nombreAdmin,apellidoAdmin,tipoAdmin;
    private int dni;

    public String getUserNameAdmin() {
        return userNameAdmin;
    }

    public void setUserNameAdmin(String userNameAdmin) {
        this.userNameAdmin = userNameAdmin;
    }

    public String getUserPasswordAdmin() {
        return userPasswordAdmin;
    }

    public void setUserPasswordAdmin(String userPasswordAdmin) {
        this.userPasswordAdmin = userPasswordAdmin;
    }

    public String getNombreAdmin() {
        return nombreAdmin;
    }

    public void setNombreAdmin(String nombreAdmin) {
        this.nombreAdmin = nombreAdmin;
    }

    public String getApellidoAdmin() {
        return apellidoAdmin;
    }

    public void setApellidoAdmin(String apellidoAdmin) {
        this.apellidoAdmin = apellidoAdmin;
    }

    public String getTipoAdmin() {
        return tipoAdmin;
    }

    public void setTipoAdmin(String tipoAdmin) {
        this.tipoAdmin = tipoAdmin;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
  
    
}
