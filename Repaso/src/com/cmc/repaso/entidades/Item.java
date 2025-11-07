package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private double productosActuales;
	private double productosDevueltos;
	private double productosVendidos;
	
	public void Imprimir() {
		System.out.println("---------------------------");
		System.out.println("Cantidad Actual: " + productosActuales);
		System.out.println("Cantidad Devueltos: " + productosDevueltos);
		System.out.println("Cantidad Vendidos: " + productosVendidos);
		System.out.println("******************************");
	}
	
	public void vender (double productosVendidos) {
		this.productosVendidos=productosVendidos;
		productosActuales=productosActuales-productosVendidos;
		productosVendidos=productosVendidos+productosVendidos;
	}
	
	public void devolver(double productosDevueltos) {
		this.productosDevueltos=productosDevueltos;
		productosActuales=productosActuales+productosVendidos;
		productosVendidos=productosVendidos-productosVendidos;
		productosDevueltos=productosDevueltos+productosDevueltos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(double productosActuales) {
		this.productosActuales = productosActuales;
	}
	public double getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(double productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public double getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(double productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	
}
