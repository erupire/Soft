package edu.ulima.dto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements UsuarioIF  {
	String url="jdbc:mysql://localhost:3306/db_subasta?user=root&password=root";
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
	

	public void datosGenerales(UsuarioDTO p) {
		String sql="INSERT INTO tbusuario (articuloID,adminID,nombre,apellido,fechaNac,dni,genero,direccion,telefono) VALUES(?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt=null;
		Connection con=null;
		con = getConnection();
		try{
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, p.getUsuarioID());
			pstmt.setString(2,p.getAdminID());
			pstmt.setString(3, p.getNombre());
			pstmt.setString(4, p.getApellido());
			pstmt.setString(5, p.getFechaNac());
			pstmt.setInt(6, p.getDni());
			pstmt.setString(7, p.getGenero());
			pstmt.setString(8, p.getDireccion());
			pstmt.setInt(9, p.getTelefono());
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
	public void Articulos(UsuarioDTO p) {
		
		String sql1="Insert into tbarticulo(articuloID,usuarioID,descripcion,antiguedad,stock,creditos,alto,ancho,disposicion) VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt=null;
		Connection con=null;
		con = getConnection();
		try{
			
			pstmt=con.prepareStatement(sql1);
			
			
			pstmt=con.prepareStatement(sql1);
			pstmt.setInt(1, p.getArticuloID());
			pstmt.setInt(2, p.getUsuarioID());
			pstmt.setString(3, p.getDescripcion());
			pstmt.setString(4, p.getAntiguedad());
			pstmt.setFloat(5, p.getStock());
			pstmt.setFloat(6, p.getCreditos());
			pstmt.setFloat(7, p.getAlto());
			pstmt.setString(8, p.getAncho());
			pstmt.setString(9, p.getDisposicion());
			
			pstmt.executeUpdate();
			
			
			
			
		}catch(SQLException e){
			System.out.println("ERROR EN EL SQL---INSERTAR " + e);
		}finally{
			try{
				con.close();
				pstmt.close();
			}catch(SQLException e){
				System.out.println("REVISA EL CIERRE DE CONEXION");
			}
		}
		
	}
	public void actualizar(UsuarioDTO p) {
		// TODO 
		String sql = "UPDATE tbusuario  SET usuarioID=?,nombre=?,apellido=?,fechaNac=?,dni=?,genero=?,direccion=?,telefono=? WHERE usuarioID=?";
		PreparedStatement pstmt = null;
        Connection con = getConnection();

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, p.getUsuarioID());
            pstmt.setString(2, p.getNombre() );
            pstmt.setString(3, p.getApellido() );
            pstmt.setString(4, p.getFechaNac() );
            pstmt.setInt(5, p.getDni());
            pstmt.setString(6,p.getGenero());
            pstmt.setString(7, p.getDireccion());
            pstmt.setInt(8, p.getTelefono());
            
            pstmt.setInt(9, p.getUsuarioID());
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	try {
				pstmt.close();
	        	con.close();
			} catch (SQLException e) {
			}
        }
		
		
	}

	public List<UsuarioDTO> mostrar() {
		// TODO Auto-generated method stub
		List<UsuarioDTO> l=new ArrayList<UsuarioDTO>();
		String sql="select * from tbusuario order by nombre";
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Connection con=getConnection();
		try{
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				UsuarioDTO a=new UsuarioDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
												rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getInt(9));
				l.add(a);
			}
		}catch(SQLException e){
			System.out.println("ERROR EN EL SQL---SELECT "+ e);
			
		}finally{
			try{
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e){
				System.out.println("REVISA TU CIERRE DE CONEXION");
				
			}
		}
		
		return l;
	}

	
	public void eliminar(int dni) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM tbusuario where dni=?";
		PreparedStatement pstmt = null;
        Connection con = getConnection();
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, dni);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	try {
				pstmt.close();
	        	con.close();
			} catch (SQLException e) {
				
			}
        }
		
	}


	public UsuarioDTO mostrarArticulos(int dni) {
		// TODO Auto-generated method stub
		
		List<UsuarioDTO> l=new ArrayList<UsuarioDTO>();
		String sql="Select * from tbarticulos where dni= "+ dni;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Connection con=getConnection();
		UsuarioDTO a=new UsuarioDTO();
		try{
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()){
			a.setAntiguedad(rs.getString(3));
			a.setStock(rs.getFloat(4));
			a.setCreditos(rs.getFloat(5));
			a.setAlto(rs.getFloat(6));
			a.setAncho(rs.getString(7));
			a.setDisposicion(rs.getString(8));
			
			}
		}catch(SQLException e){
			System.out.println("ERROR EN EL SQL" + e);
			
		}finally{
			try{
				rs.close();
				ps.close();
				con.close();
			}catch(SQLException e){
				System.out.println("REVISA CIERRE DE CONEXION");
				
			}
		}
		return a;
		
	}
	public boolean UsuarioAcceder(String login, String password){
		 boolean log=false;
	       String pass="";
	            try {
	                
	                String strsql = "SELECT * FROM tbadmin where usuario=?";
	                PreparedStatement pstm = getConnection().prepareStatement(strsql);
	                pstm.setString(1, login);
	                ResultSet rs = pstm.executeQuery();
	                
	                if(rs.next()){
	                    if(rs.getString(1).equals(login) ){
	                    	pass=rs.getString(2);
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
	       
	    
}
