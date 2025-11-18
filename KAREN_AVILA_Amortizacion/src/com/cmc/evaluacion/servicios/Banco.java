package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	
  
	private ArrayList<Prestamo> prestamos= new ArrayList<>();
	private ArrayList<Cliente> clientes= new ArrayList<>();
	
	 public Cliente buscarCliente(String cedula) {
	        for (Cliente c : clientes) {
	            if (c.getCedula().equals(cedula)) {
	                return c;
	            }
	        }
	        return null;
	    }
	
	  public void registrarCliente(Cliente cliente) {
	        if (buscarCliente(cliente.getCedula()) == null) {
	            clientes.add(cliente);
	            System.out.println("Cliente registrado correctamente");
	        } else {
	            System.out.println("El cliente ya existe en el banco");
	        }
	    }
	
	
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes1) {
		this.clientes = clientes1;
	}
	

	 public void asignarPrestamo(String cedula, Prestamo prestamo) {
	        Cliente cliente = buscarCliente(cedula);

	        if (cliente != null) {
	            cliente.getPrestamos().add(prestamo);
	            prestamos.add(prestamo);

	            //System.out.println("Préstamo asignado correctamente");

	            CalculadoraAmortizacion calc = new CalculadoraAmortizacion();
	           // calc.generarTabla(prestamo);
	            //calc.mostrarTabla(prestamo);

	        } else {
	            System.out.println("Cliente no existe en el banco");
	        }
	    }
	 
	 public ArrayList<Prestamo> buscarPrestamos(String cedula) {
	        Cliente cliente = buscarCliente(cedula);

	        if (cliente != null) {
	            return cliente.getPrestamos();
	        }

	        return null;
	    }


	
	
	
}
