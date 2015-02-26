/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Gianarlo
 */
public class ProductoDTO {
    
private String nombreProducto,descripcion,autor,categoria;
private InputStream foto;
private int precioBase;

    public ProductoDTO() {
    }

    public ProductoDTO(String nombreProducto, String descripcion, String autor, String categoria, InputStream foto, int precioBase) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.autor = autor;
        this.categoria = categoria;
        this.foto = foto;
        this.precioBase = precioBase;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

  



    
    
    
}
