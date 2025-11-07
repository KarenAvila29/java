package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// crea tres variables tipo Producto
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		//Instancia 3 objetos producto y referenciar cada uno con las variables del paso anterior
		productoA=new Producto("Ibuprofeno","Para dolores musculares 300gr",3.50,50);
		productoB=new Producto("Gasas","Algodon 30 gr",2.50,25);
		productoC=new Producto("Alcohol","al 65% 600 ml",5.50,10);
		
		//
/*
		//Modificar los atributos de cada producto con prosuctos que hay en una farmacia
		productoA.setNombre("Apronax");
		productoA.setDescripcion("Para dolores musculares 300gr");
		productoA.setPrecio(3.50);
		productoA.setStockActual(50);
		
		productoB.setNombre("Gasas");
		productoB.setDescripcion("Algodon 30 gr");
		productoB.setPrecio(2.50);
		productoB.setStockActual(25);
		
		productoC.setNombre("Alcohol");
		productoC.setDescripcion("al 65% 600 ml");
		productoC.setPrecio(5.50);
		productoC.setStockActual(10);
		*/
		//mostrar los valores de los atributos de los 3 objetos
		System.out.println("-----------PRODUCTO A------------ " );
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: " + productoA.getStockActual());
		
		System.out.println("-----------PRODUCTO B------------ " );
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock: " + productoB.getStockActual());
		
		System.out.println("-----------PRODUCTO C------------ " );
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: " + productoC.getStockActual());

	}
}
