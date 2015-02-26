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
public interface ServicioIF {
    
 public boolean usuarioAcceder(String login, String password);  
 
 public void registrarCliente(ClienteDTO c);
 
 public void insertarProducto(ProductoDTO pa);
  
 public boolean adminAcceder(String login, String password);
 
 public void actualizarCliente(ClienteDTO c);
 
 public void registrarPacks();
 
 public void actualizarCreditos(PackCreditosDTO pk);
 
 
}
