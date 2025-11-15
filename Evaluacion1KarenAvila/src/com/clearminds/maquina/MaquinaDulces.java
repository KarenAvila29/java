package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;


public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo=0.0;
	
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }
	/*55*/
	 public MaquinaDulces() {
	        celdas = new ArrayList<>();
	        saldo = 0.0;
	    }
	
	public void agregarCelda(String codigo) {
		Celda nuevaCelda = new Celda();
        nuevaCelda.setCodigo(codigo);
        celdas.add(nuevaCelda);
	       		
	}
	
	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			System.out.println("Codigo: " + elementoCelda.getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada=null;
		Celda elementoCelda=null;
		for(int i=0 ; i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codigo.equals(elementoCelda.getCodigo())) {
				return elementoCelda;
			}
		}
		return celdaEncontrada;
	}
	
	public void cargarProducto(Producto producto, String codigo, int stock) {
					Celda celdaRecuperada=buscarCelda(codigo);
					if(codigo.equals(celdaRecuperada.getCodigo())) {
						celdaRecuperada.ingresarProducto(producto, stock);	
					}
	}
	public void mostrarProductos() {
		Celda elementoCelda;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto() == null) {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock() +" la celda no tiene producto");
			}else
			System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()+
					" Producto: "+elementoCelda.getProducto().getNombre()+" Precio: "+elementoCelda.getProducto().getPrecio());
		} 
		System.out.println("Saldo: "+saldo);
		
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		//Celda celdaEncontrada=null;
		Celda elementoCelda=null;
		for(int i=0 ; i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codigo.equals(elementoCelda.getCodigo())) {
				return elementoCelda.getProducto();
			}
		}
		return null;
	}
	
	public double consultarPrecio(String codigo) {
		Celda elementoCelda=null;
		for(int i=0 ; i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(codigo.equals(elementoCelda.getCodigo())) {
				return elementoCelda.getProducto().getPrecio();
			}
		}
		return -1;
	}
	public Celda buscarCeldaProducto(String codigo){
		Celda elementoCelda=null;
		for(int i=0 ; i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto() != null && codigo.equals(elementoCelda.getProducto().getCodigo())) {
				return elementoCelda;
			}
		}
		return null;		
	}
	
	public void incrementarProductos(String codigo , int cantidad) {
		 Celda celdaEncontrada = buscarCeldaProducto(codigo);
		 celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
	}
	
	public void vender(String codigo) {
		
		Celda r=buscarCelda(codigo);
		 r.setStock(r.getStock() - 1);
		 double precio = r.getProducto().getPrecio();
		 saldo=saldo+precio;
	}
	
	public double venderConCambio(String codigo, double valor) {
		Celda v=buscarCelda(codigo);
		 v.setStock(v.getStock() - 1);
		 double precio = v.getProducto().getPrecio();
		 saldo=saldo+precio;
		double vuelto=valor-precio;
		return vuelto;
	}
	
	public ArrayList<Celda> buscarMenores(double limite){
		ArrayList<Celda> menores=new ArrayList<Celda>();
		Celda elementoCelda;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto() != null && elementoCelda.getProducto().getPrecio()<limite) {
				menores.add(elementoCelda);
			}
		}
		return menores;
	}
	
}
	