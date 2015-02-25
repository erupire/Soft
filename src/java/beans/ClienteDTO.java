/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author jazmin
 */
public class ClienteDTO {
    
    private int idCliente,idCreditos,dni;   
 private String userNameCliente,userPasswordCliente,fechaNacimiento,clienteEmail,nameCliente,apellidoCliente;   
private String genero;    

    public ClienteDTO() {
    }

    public ClienteDTO(int dni, String userNameCliente, String userPasswordCliente, String fechaNacimiento, String clienteEmail, String nameCliente, String genero) {
        this.dni = dni;
        this.userNameCliente = userNameCliente;
        this.userPasswordCliente = userPasswordCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.clienteEmail = clienteEmail;
        this.nameCliente = nameCliente;
        this.genero = genero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCreditos() {
        return idCreditos;
    }

    public void setIdCreditos(int idCreditos) {
        this.idCreditos = idCreditos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getUserNameCliente() {
        return userNameCliente;
    }

    public void setUserNameCliente(String userNameCliente) {
        this.userNameCliente = userNameCliente;
    }

    public String getUserPasswordCliente() {
        return userPasswordCliente;
    }

    public void setUserPasswordCliente(String userPasswordCliente) {
        this.userPasswordCliente = userPasswordCliente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public String getNameCliente() {
        return nameCliente;
    }

    public void setNameCliente(String nameCliente) {
        this.nameCliente = nameCliente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }
    
    
}
