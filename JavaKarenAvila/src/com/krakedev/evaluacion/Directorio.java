package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {

	private Contacto contacto;
	private Date fechaModificacion;
	ArrayList<Contacto> directorio = new ArrayList<Contacto>();
	ArrayList<Contacto> correctos = new ArrayList<Contacto>();
	ArrayList<Contacto> incorrectos = new ArrayList<Contacto>();
	
	public ArrayList<Contacto> getContactos() {
	    return directorio;
	}
	
	public ArrayList<Contacto> getDirectorio() {
		return directorio;
	}
	public void setDirectorio(ArrayList<Contacto> directorio) {
		this.directorio = directorio;
	}
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	public Contacto getContacto() {
		return contacto;
	}
	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	public boolean agregarContacto(Contacto contacto) {
	
		 boolean agregado = directorio.add(contacto);

		    if (agregado) {
		        fechaModificacion = new Date(); // Solo asigna fecha, sin afectar el boolean
		    }
		    return agregado;
	  
	}
	
	public Contacto buscarPorCedula(String cedula) {
		for(int i=0;i<directorio.size();i++) {
			  Contacto resultado=directorio.get(i);
			if(resultado.getCedula().equals(cedula) ) {
				return resultado;
			}
	}
		return null;
	}
	public String consultaUltimaModificacion() {
		
		if (fechaModificacion == null) {
	        return "Sin modificaciones";
	    }

	    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    return formato.format(fechaModificacion);
	}
	
	public int contarPerdidos() {
		
		 int perdidos = 0;
		 for(int i=0; i<directorio.size();i++) {
			 Contacto contacto = directorio.get(i);
			 if(contacto != null &&contacto.getDireccion()==null) {
				 perdidos++;
			 }
		 }
		    
		    return perdidos;
	}
	
	public int contarFijos() {
		
		 int perdidos = 0;
		 for(int i=0; i<directorio.size();i++) {
			 Contacto telefono = directorio.get(i);
			 if (telefono != null && telefono.getTelefono() != null) {
		            Telefono t = telefono.getTelefono();
		            if ("Convencional".equals(t.getTipo())) {
		                perdidos++;
		            }
		        }
				
			 }		    
		    return perdidos;
		
	}
public void depurar() {
	
	for(int i=0; i<directorio.size();i++) {
		 Contacto telefono = directorio.get(i);
		 if ( telefono.getDireccion()!= null) {
			 incorrectos.add(telefono);
	      }else {
	    	  
	    	  correctos.add(telefono);
	        }
			
		 }
	directorio.clear();
}
}