package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.utils.ConeccionBDD;

public class AdminEstudiante {
private static final Logger  LOGGER=LogManager.getLogger(AdminEstudiante.class);
	
	public static void insertar(EstudianteEntidades Estudiante) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a insertar>>>>>" + Estudiante);
	try {
		//abrir la coneccion
		con=ConeccionBDD.conectar();
		//System.out.println("insertar");
		ps=con.prepareStatement("insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor)"
				+ "			values(?,?,?,?,?,?)");
		ps.setString(1, Estudiante.getCedula());
		ps.setString(2, Estudiante.getNombre());
		ps.setString(3, Estudiante.getApellido());
		ps.setString(4, Estudiante.getEmail());			
		ps.setDate(5,new java.sql.Date(Estudiante.getFechaNacimiento().getTime()));
		ps.setInt(6, Estudiante.getCodigo_profesor().getCodigo());
	
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
	public static void actualizar(EstudianteEntidades Estudiante) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a actualizar>>>>>" + Estudiante);
	try {
		//abrir la coneccion
		con=ConeccionBDD.conectar();
		ps=con.prepareStatement("UPDATE estudiantes SET nombre=?, apellido=?, email=?, "
                + "fecha_nacimiento=?, codigo_profesor=? "
                + " WHERE cedula=?");
		ps.setString(1, Estudiante.getNombre());
		ps.setString(2, Estudiante.getApellido());
		ps.setString(3, Estudiante.getEmail());			
		ps.setDate(4,new java.sql.Date(Estudiante.getFechaNacimiento().getTime()));
		ps.setInt(5, Estudiante.getCodigo_profesor().getCodigo());
		ps.setString(6, Estudiante.getCedula());
	
		
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
	public static void eliminar(EstudianteEntidades Estudiante) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante a eliminar>>>>>" + Estudiante);
	try {
		con=ConeccionBDD.conectar();
		ps=con.prepareStatement("DELETE FROM estudiantes WHERE cedula=?");
		
		
		ps.setString(1, Estudiante.getCedula());
		
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
