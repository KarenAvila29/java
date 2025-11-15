package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "A", 4);
		Producto producto2 = new Producto("PRTO", "Gatorade", 0.20);
		maquina.cargarProducto(producto2, "B", 5);
		Producto producto3 = new Producto("KE34", "Salticas", 0.15);
		maquina.cargarProducto(producto3, "C", 4);
		Producto producto4 = new Producto("PRTO", "Tango", 0.50);
		maquina.cargarProducto(producto4, "D", 5);

		ArrayList<Celda> menores=maquina.buscarMenores(0.85);
		System.out.println("Productos menores: " + menores.size());
		for(int i=0;i<menores.size();i++) {
			System.out.println("Nombre: " + menores.get(i).getProducto().getNombre() + " Precio: " + menores.get(i).getProducto().getPrecio());
		}
	}
}
