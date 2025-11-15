package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo=0.0;
	
	public MaquinaDulces() {
        
        celda1 = new Celda();
        celda2 = new Celda();
        celda3 = new Celda();
        celda4 = new Celda();
    }
	
	
	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
///////////////////////////////////////////////////////
///
	public void configurarMaquina(String celda1,String  celda2,String  celda3,String  celda4) {
		this.celda1.setCodigo(celda1);
	    this.celda2.setCodigo(celda2);
	    this.celda3.setCodigo(celda3);
	    this.celda4.setCodigo(celda4);
	}

	public void mostrarConfiguracion() {
		
		System.out.println("Celda 1:" + celda1.getCodigo());
		System.out.println("Celda 2:" + celda2.getCodigo());
		System.out.println("Celda 3:" + celda3.getCodigo());
		System.out.println("Celda 4:" + celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo()==codigo) {
			return celda1;
		}if(celda2.getCodigo()==codigo) {
			return celda2;
		}if(celda3.getCodigo()==codigo) {
			return celda3;
		}if(celda4.getCodigo()==codigo) {
			return celda4;
		}
			return null;
	}
	
	public void cargarProducto(Producto producto, String codigo, int stock) {
		
		 Celda celdaRecuperada = buscarCelda(codigo);
		 
		        celdaRecuperada.ingresarProducto(producto, stock);
		
		    
		
	}
	
	public void mostrarProductos() {
		
		System.out.println("*********CELDA "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		if(celda1.getProducto() == null) {
			System.out.println("la celda no tiene producto");
		}else {
			System.out.println("Nombre Producto " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto"+celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto"+celda1.getProducto().getCodigo());
			System.out.println("Saldo"+saldo);
		}
		
		
		System.out.println("*********CELDA "+ celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if(celda2.getProducto() == null) {
			System.out.println("la celda no tiene producto");
		}else {
			System.out.println("Nombre Producto " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto"+celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto"+celda2.getProducto().getCodigo());;
			System.out.println("Saldo"+saldo);
		}
	
		
		System.out.println("*********CELDA "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if(celda3.getProducto() == null) {
			System.out.println("la celda no tiene producto");
		}else {
			System.out.println("Nombre Producto " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto"+celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto"+celda3.getProducto().getCodigo());
			System.out.println("Saldo"+saldo);
		}
		
		
		System.out.println("*********CELDA "+celda4.getCodigo());
		System.out.println("Stock: " +celda4.getStock());
		if(celda4.getProducto() == null) {
			System.out.println("la celda no tiene producto");
		}else {
			System.out.println("Nombre Producto " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto"+celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto"+celda4.getProducto().getCodigo());
		}
		
		System.out.println("Saldo"+saldo);
		
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo()==codigo) {
			return celda1.getProducto();
		}if(celda2.getCodigo()==codigo) {
			return celda2.getProducto();
		}if(celda3.getCodigo()==codigo) {
			return celda3.getProducto();
		}if(celda4.getCodigo()==codigo) {
			return celda4.getProducto();
		}
			return null;
	}
	
		public double consultarPrecio(String codigo) {
			if (celda1.getCodigo()==codigo) {
				return celda1.getProducto().getPrecio();
			}if(celda2.getCodigo()==codigo) {
				return celda2.getProducto().getPrecio();
			}if(celda3.getCodigo()==codigo) {
				return celda3.getProducto().getPrecio();
			}if(celda4.getCodigo()==codigo) {
				return celda4.getProducto().getPrecio();
			}
			
				System.out.println("PRODUCTO NO EXISTE");
				return -1;
		}
	public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo()==codigo) {
			return celda1;
		}if(celda2.getProducto() != null && celda2.getProducto().getCodigo()==codigo) {
			return celda2;
		}if(celda3.getProducto() != null && celda3.getProducto().getCodigo()==codigo) {
			return celda3;
		}if(celda4.getProducto() != null && celda4.getProducto().getCodigo()==codigo) {
			return celda4;
		}else  {
			System.out.println("PRODUCTO NO EXISTE");
		}
			return null;
	}
	
	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada=buscarCeldaProducto(codigo); 
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
			
	}
	
	public void vender(String codigo) {
		Celda r=buscarCelda(codigo);
		 r.setStock(r.getStock() - 1);
		 double precio = r.getProducto().getPrecio();
		 saldo=saldo+precio;
		 //mostrarProductos();
	}
	
	public double venderConCambio(String codigo, double valor) {
		Celda v=buscarCelda(codigo);
		 v.setStock(v.getStock() - 1);
		 double precio = v.getProducto().getPrecio();
		 saldo=saldo+precio;
		double vuelto=valor-precio;
		return vuelto;
	}
}
