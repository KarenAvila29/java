package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	
	
	
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		
		if(numero!=null && tipo!=null) {
				estado="C";
		}else {
			estado="E";
		}
		
		if(tipo != null && numero != null && (tipo.equals("Movil") ||  tipo.equals("Convencional"))  ) {
			estado="C";
		}else {
			estado="E";
		}
		
		if(tipo != null  ){
			int nTelefono=0;
			if(numero!= null) {
				nTelefono=numero.length();
			}
			if(numero!= null && nTelefono==10) {
				tipo="Movil";
			}if(numero!= null && nTelefono==7) {
				tipo="Convencional";
			}
		}
		
	}
	
	
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}

	

}
