package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.utils.ConeccionBDD;

public class AdminProductos {
private static final Logger  LOGGER=LogManager.getLogger(AdminProductos.class);
	
	public static void insertar(ProductoEntidades producto) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Producto a insertar>>>>>" + producto);
	try {
		//abrir la coneccion
		con=ConeccionBDD.conectar();
		//System.out.println("insertar");
		// "INSERT INTO productos(codigo,nombre,descripcion,precio,stock)
		ps=con.prepareStatement("insert into productos(codigo,nombre,descripcion,precio,stock)"
				+ "			values(?,?,?,?,?)");
		ps.setInt(1, producto.getCodigo());
		ps.setString(2,producto.getNombre());
		ps.setString(3, producto.getDescripcion());
		ps.setBigDecimal(4, producto.getPrecio());
		ps.setInt(5, producto.getStock());	
		ps.executeUpdate();
	
	}catch (Exception e) {
		//mostar el error al usuario
		//System.out.println(e.getMessage());
		//loggear el error
		LOGGER.error("Error al insertar",e);//e.printStackTrace();
		//propragar la exepcion
		throw new Exception("Error al insertar");
	}finally {
		//cerrar la coneccion
		try {
			con.close();
		} catch (SQLException e) {
			LOGGER.error("Error con la base de datos",e);//e.printStackTrace();
			throw new Exception("Error con la base de datos");
			//System.out.println("Error de infraestructura");
		}
	}
	
	}
	
	//RETO 33 METODO ACTUALIZAR
	public static void actualizar(ProductoEntidades producto) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a actualizar>>>>>" + producto);
	try {
		//abrir la coneccion
		con=ConeccionBDD.conectar();
		//"insert into productos(codigo,nombre,descripcion,precio,stock)"
		ps=con.prepareStatement("UPDATE productos SET nombre=?, descripcion=?, precio=?, "
                + "stock=? "
                + " WHERE codigo=? ");
		
			ps.setString(1,producto.getNombre());
			ps.setString(2, producto.getDescripcion());
			ps.setBigDecimal(3, producto.getPrecio());
			ps.setInt(4, producto.getStock());	
			ps.setInt(5, producto.getCodigo());
		
		 ps.executeUpdate();
	
	}catch (Exception e) {
		//mostar el error al usuario
		//System.out.println(e.getMessage());
		//loggear el error
		LOGGER.error("Error al actualizar000",e);//e.printStackTrace();
		//propragar la exepcion
		throw new Exception("Error al actualizar");
	}finally {
		//cerrar la coneccion
		try {
			con.close();
		} catch (SQLException e) {
			LOGGER.error("Error con la base de datos",e);//e.printStackTrace();
			throw new Exception("Error con la base de datos");
			
		}
	}
	
	}
	
	//RETO 33 METODO ELIMINAR
	public static void eliminar(ProductoEntidades producto) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a eliminar>>>>>" + producto);
	try {
		con=ConeccionBDD.conectar();
		ps=con.prepareStatement("DELETE FROM productos WHERE codigo=?");
		
		
		ps.setInt(1, producto.getCodigo());
		
		 ps.executeUpdate();
	
	}catch (Exception e) {
		//mostar el error al usuario
		//System.out.println(e.getMessage());
		//loggear el error
		LOGGER.error("Error al eliminar",e);//e.printStackTrace();
		//propragar la exepcion
		throw new Exception("Error al eliminar");
	}finally {
		//cerrar la coneccion
		try {
			con.close();
		} catch (SQLException e) {
			LOGGER.error("Error con la base de datos",e);//e.printStackTrace();
			throw new Exception("Error con la base de datos");
			//System.out.println("Error de infraestructura");
		}
	}
	
	}
	
	

}
