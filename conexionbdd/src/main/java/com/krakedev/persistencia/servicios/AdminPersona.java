package com.krakedev.persistencia.servicios;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConeccionBDD;
//System.out.println solo se va a poder utilizar en los tests
public class AdminPersona {
	private static final Logger  LOGGER=LogManager.getLogger(AdminPersona.class);
	
	public static void insertar(Persona persona) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>>>>" + persona);
	try {
		//abrir la coneccion
		con=ConeccionBDD.conectar();
		//System.out.println("insertar");
		ps=con.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
				+ "			values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, persona.getCedula());
		ps.setString(2, persona.getNombre());
		ps.setString(3, persona.getApellido());
		ps.setString(4,persona.getEstadoCivil().getCodigo() );
		ps.setInt(5, persona.getNumeroHijos());
		ps.setDouble(6, persona.getEstatura());
		ps.setBigDecimal(7, persona.getCantidadAhorrada());
		//setear fecha y tiempo 
		ps.setDate(8,new java.sql.Date(persona.getFechaNacimiento().getTime()));
		ps.setTime(9,new Time(persona.getHoraNacimiento().getTime()));
		
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
	public static void actualizar(Persona persona) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>>>>" + persona);
	try {
		//abrir la coneccion
		con=ConeccionBDD.conectar();
		//System.out.println("insertar");
		ps=con.prepareStatement("UPDATE personas SET nombre=?, apellido=?, estado_civil_codigo=?, "
                + "numero_hijos=?, estatura=?, cantidad_ahorrada=?, "
                + "fecha_nacimiento=?, hora_nacimiento=? "
                + "WHERE cedula=?");
		
		
		ps.setString(1, persona.getNombre());
		ps.setString(2, persona.getApellido());
		ps.setString(3,persona.getEstadoCivil().getCodigo() );
		ps.setInt(4, persona.getNumeroHijos());
		ps.setDouble(5, persona.getEstatura());
		ps.setBigDecimal(6, persona.getCantidadAhorrada());
		//setear fecha y tiempo 
		ps.setDate(7,new java.sql.Date(persona.getFechaNacimiento().getTime()));
		ps.setTime(8,new Time(persona.getHoraNacimiento().getTime()));
		ps.setString(9, persona.getCedula());
		
		 ps.executeUpdate();
	
	}catch (Exception e) {
		//mostar el error al usuario
		//System.out.println(e.getMessage());
		//loggear el error
		LOGGER.error("Error al actualizar",e);//e.printStackTrace();
		//propragar la exepcion
		throw new Exception("Error al actualizar");
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
	
	//RETO 33 METODO ELIMINAR
	public static void eliminar(Persona persona) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a eliminar>>>>>" + persona);
	try {
		//abrir la coneccion
		con=ConeccionBDD.conectar();
		//System.out.println("insertar");
		ps=con.prepareStatement("DELETE FROM personas WHERE cedula=?");
		
		
		ps.setString(1, persona.getCedula());
		
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
	//BUSCAR
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> persona=new ArrayList<Persona>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=ConeccionBDD.conectar();
			ps=con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda +"%");
			
			rs=ps.executeQuery();
			//recorriendo el arreglo hasta que de falso
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula=rs.getString("cedula");
				Persona p=new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				persona.add(p);
			}
		
		} catch (Exception e) {
			LOGGER.error("Error al consultar nombre",e);//e.printStackTrace();
			//propragar la exepcion
			throw new Exception("Erroral consultar nombre");
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
		
		return persona;
		
	}
	
	public static Persona buscarPorCedula(String cedula) throws Exception{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Persona persona=new Persona();
		try {
			con=ConeccionBDD.conectar();
			ps=con.prepareStatement("select * from personas where cedula = ? ");
			ps.setString(1, cedula);
			
			rs=ps.executeQuery();
			//recorriendo el arreglo hasta que de falso
			if(rs.next()) {
				
				String nombre=rs.getString("nombre");
				String apellido=rs.getString("apellido");
				double estatura=rs.getDouble("estatura");
				persona.setNombre(nombre);
				persona.setApellido(apellido);
				persona.setEstatura(estatura);
			}else {
				LOGGER.error("No existe");
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar nombre",e);//e.printStackTrace();
			//propragar la exepcion
			throw new Exception("Erroral consultar nombre");
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
		
		return persona;
		
	}
	
	//BUSCAR GRUPO DE CEDULAS
	public static ArrayList<Persona> buscarPorGrupoCedula(String cedula) throws Exception{
		ArrayList<Persona> persona=new ArrayList<Persona>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=ConeccionBDD.conectar();
			ps=con.prepareStatement("select * from personas where cedula like ?");
			ps.setString(1, "%"+cedula+"%");
			
			rs=ps.executeQuery();
			//recorriendo el arreglo hasta que de falso
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String apellido=rs.getString("apellido");
				Persona p=new Persona();
				
				p.setNombre(nombre);
				p.setApellido(apellido);;
				persona.add(p);
			}
		
		} catch (Exception e) {
			LOGGER.error("Error al consultar nombre",e);//e.printStackTrace();
			//propragar la exepcion
			throw new Exception("Erroral consultar nombre");
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
		
		return persona;
		
	}
	
}
