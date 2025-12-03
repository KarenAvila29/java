package com.krakedev.conexionbdd;

public class TestConeccionProductoEliminar {

	public static void main(String[] args) {
		ProductoEntidades pr=new ProductoEntidades();
		
		pr.setCodigo(12);
		try {
			AdminProductos.eliminar(pr);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
