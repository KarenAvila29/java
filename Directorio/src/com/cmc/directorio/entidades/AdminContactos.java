package com.cmc.directorio.entidades;

public class AdminContactos {
	
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
			if(c1.getPeso()>c2.getPeso()) {
				return c1;
			}else if (c2.getPeso()>c1.getPeso()) {
				return c2;
			}else {
				return null;
			}
	}
	
	public boolean compararOperadora(Telefono o1, Telefono o2) {
		if(o1.getOperadora() == o2.getOperadora()) {
			return true;
		}else {
			return false;
		}
	}

	
		
	public void activarUsuario(Contacto c1) {
		Telefono r1=new Telefono();
		r1=c1.getTelefono();
		boolean r2 =r1.isTieneWhatsapp();
		if(r2==true) {
			c1.setActivo(true);
			
		}else {
			c1.setActivo(false);
		}
			
		
	}

}
