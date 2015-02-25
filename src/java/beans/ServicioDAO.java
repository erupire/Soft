/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jazmin
 */
public class ServicioDAO implements ServicioIF{

   String url="jdbc:mysql://localhost:3306/subastafinal?user=root&password=root";
	private  Connection getConnection(){
		
		Connection con= null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			try {
				con=DriverManager.getConnection(url);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
    
    
    @Override
    public boolean usuarioAcceder(String login, String password) {
    
      boolean log=false;
	       String pass="";
	            try {
	                
	                String strsql = "SELECT * FROM cliente where userNameCliente=?";
	                PreparedStatement pstm = getConnection().prepareStatement(strsql);
	                pstm.setString(1, login);
	                ResultSet rs = pstm.executeQuery();
	                
	                if(rs.next()){
	                    if(rs.getString(2).equals(login) ){
	                    	pass=rs.getString(3);
	                    	if(pass.equals(password)){
	                    	
	                    		log=true;
	              
	                    	}
	                    }else{
	                    	log=false;
	                    }
	                }
	                rs.close();
	            }
	            catch(SQLException e){
	                System.out.println(e);
	            }
	            
	            return log;   
        
    }

    @Override
    public void registrarCliente(ClienteDTO c) {
   
    String sql="insert into cliente (userNameCliente,userPasswordCliente,fechaNacimiento,clienteEmail,nameCliente,apellidoCliente,dni,genero) VALUES(?,?,?,?,?,?,?,?)";
    PreparedStatement pstmt=null;
		Connection con=null;
		con = getConnection();
    
    try{
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1,c.getUserNameCliente());
			pstmt.setString(2, c.getUserPasswordCliente());
			pstmt.setString(3, c.getFechaNacimiento()+"");
			pstmt.setString(4, c.getClienteEmail());
			pstmt.setString(5, c.getNameCliente());
			pstmt.setString(6, c.getApellidoCliente());
			pstmt.setInt(7, c.getDni());
			pstmt.setString(8, c.getGenero());
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			System.out.println("ERROR EN EL SQL---INSERTAR" +e);
		}finally{
			try{
				con.close();
				pstmt.close();
			}catch(SQLException e){
				System.out.println("REVISA EL CIERRE DE CONEXION");
			}
 
    }
    
    
    
    }

    @Override
    public void insertarProducto(ProductoDTO pa) {
   
    String sql="insert into producto(nombreProducto,precioBase,descripcion,Autor,Categoria) VALUES(?,?,?,?,?)";
    PreparedStatement pstmt=null;
		Connection con=null;
		con = getConnection();
    
    try{
			
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1,pa.getNombreProducto());
			pstmt.setInt(2, pa.getPrecioBase());
			pstmt.setString(3,pa.getDescripcion());
			pstmt.setString(4, pa.getAutor());
			pstmt.setString(5, pa.getCategoria());
			
			
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			System.out.println("ERROR EN EL SQL---INSERTAR" +e);
		}finally{
			try{
				con.close();
				pstmt.close();
			}catch(SQLException e){
				System.out.println("REVISA EL CIERRE DE CONEXION");
			}
    
    
    }   
        
    
    
    
    
    }
    
    
    
    
}
