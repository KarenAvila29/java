package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Producto;
public class TestProducto {

	public static void main(String[] args) {
		Producto producto=new Producto("Manzana",-10);
		
		producto.getPrecio();
		System.out.println("Precio: " + producto.getPrecio());
		
		producto.calcularPrecioPromo(15);
		System.out.println("Precio con descuento: " + producto.getPrecio());
		
	}

}
