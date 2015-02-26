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
public class PackCreditosDTO {

    private int idCreditos,numCreditos,precio;

    public PackCreditosDTO() {
    }

    public PackCreditosDTO(int idCreditos, int numCreditos, int precio) {
        this.idCreditos = idCreditos;
        this.numCreditos = numCreditos;
        this.precio = precio;
    }

    public int getIdCreditos() {
        return idCreditos;
    }

    public void setIdCreditos(int idCreditos) {
        this.idCreditos = idCreditos;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
