package com.krakedev.conexionbdd;

import java.math.BigDecimal;




public class TestConeccionProductoIngresar {

	public static void main(String[] args) {
		ProductoEntidades pr=new ProductoEntidades();
		try {	
		pr.setCodigo(12);
		pr.setNombre("TE");
		pr.setDescripcion("SABOR HIERBABUENA");
		pr.setPrecio(new BigDecimal(2.50));
		pr.setStock(500);
		
		
		AdminProductos.insertar(pr);
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("error en el sistema "+e.getMessage());
		}

	}

}
