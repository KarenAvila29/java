package com.krakedev.conexionbdd;

import java.math.BigDecimal;

public class TestConeccionProductoActualizar {

	public static void main(String[] args) {
		ProductoEntidades pr=new ProductoEntidades();
		try {	
		pr.setNombre("SSSS");
		pr.setDescripcion("A lavar");
		pr.setPrecio(new BigDecimal(3.60));
		pr.setStock(5);
		pr.setCodigo(1);
		
		AdminProductos.actualizar(pr);
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("error en el sistema "+e.getMessage());
		}

	
	}
}


	

	


