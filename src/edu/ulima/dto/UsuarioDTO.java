package edu.ulima.dto;

import java.io.Serializable;
import java.util.Date;

public class UsuarioDTO implements Serializable {
	private String nombre;
	private String apellido;
	private String fechaNac;
	private int dni;
	private String genero;
	private String direccion;
	private String descripcion;
	private int telefono;
	private String antiguedad;
	private float stock;
	private float creditos;
	private float alto;
	private String ancho;
	private String disposicion;
	private int usuarioID;
	private int articuloID;
	private String adminID;
	
	public UsuarioDTO(int pacienteID,String doctorID,String nombre, String apellido, String fechaNac,
			int dni,String genero,String direccion,int telefono) {
		super();
		this.usuarioID = pacienteID;
		this.adminID = doctorID;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.dni = dni;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}
	
	public UsuarioDTO(int hojaclinicaID,int pacienteID,String contacto,String alergias, float talla, float peso, float temp,
			String presion, String diagnostico) {
		super();
		this.articuloID = hojaclinicaID;
		this.usuarioID = pacienteID;
		this.descripcion = contacto;
		this.antiguedad = alergias;
		this.stock = talla;
		this.creditos = peso;
		this.alto = temp;
		this.ancho = presion;
		this.disposicion = diagnostico;
	}
	
	


	public UsuarioDTO() {
		
	}
	
	
	//getter y setters


	public String getNombre() {
		return nombre;
	}


	public int getArticuloID() {
		return articuloID;
	}

	public void setArticuloID(int articuloID) {
		this.articuloID = articuloID;
	}

	

	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public int getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}


	public float getStock() {
		return stock;
	}


	public void setStock(float stock) {
		this.stock = stock;
	}


	public float getCreditos() {
		return creditos;
	}


	public void setCreditos(float creditos) {
		this.creditos = creditos;
	}


	public float getAlto() {
		return alto;
	}


	public void setAlto(float alto) {
		this.alto = alto;
	}


	public String getAncho() {
		return ancho;
	}


	public void setAncho(String ancho) {
		this.ancho = ancho;
	}


	public String getDisposicion() {
		return disposicion;
	}


	public void setDisposicion(String disposicion) {
		this.disposicion = disposicion;
	}




	
	
	
	
	
	
	
	
	
	
	

}
