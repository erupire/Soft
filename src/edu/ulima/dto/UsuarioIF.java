package edu.ulima.dto;

import java.util.List;

public interface UsuarioIF {
	
	public void datosGenerales( UsuarioDTO p);
	public void Articulos( UsuarioDTO p);
	public List<UsuarioDTO> mostrar();
	public void actualizar(UsuarioDTO p);
	public UsuarioDTO mostrarArticulos(int dni);
	public boolean UsuarioAcceder(String login, String password);
	public void eliminar(int dni);
	

}
