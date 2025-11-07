package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperadora() == "movi") {
			telf.setTieneWhatsapp(true);
		}
			
	}
	
	public int  contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contador=0;
		if(t1.getOperadora()=="movi") {
			contador=contador+1;
		}if(t2.getOperadora()=="movi") {
			contador=contador+1;
		}if (t3.getOperadora()=="movi") {
			contador=contador+1;
		}
		return contador;
	}
	
	public int  contarClaro(Telefono t1, Telefono t2, Telefono t3,Telefono t4) {
		int contador=0;
		if(t1.getOperadora()=="claro") {
			contador=contador+1;
		}if(t2.getOperadora()=="claro") {
			contador=contador+1;
		}if (t3.getOperadora()=="claro") {
			contador=contador+1;
		}if (t4.getOperadora()=="claro") {
			contador=contador+1;
		}	
		return contador;
	}
}
