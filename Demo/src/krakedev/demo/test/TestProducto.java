package krakedev.demo.test;

import kravedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto pro1=new Producto(01,"Arroz");
		pro1.setDescripcion("Saco de 100 libras");
		pro1.setPeso(100);
		
		System.out.println("Codigo:" + pro1.getCodigo());
		System.out.println("Nombre:" + pro1.getNombre());
		System.out.println("Descripcion:" + pro1.getDescripcion());
		System.out.println("Peso:" + pro1.getPeso());
		
		pro1.Imprimir();
	}

}
