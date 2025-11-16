package krakedev.entidades;

import java.util.ArrayList;



public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	
	public Estudiante(String nombre, String apellido, String cedula, ArrayList<Nota> notas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		 this.notas = new ArrayList<>();
	}
	public Estudiante(String nombre, String apellido, String cedula) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public Estudiante() {
	    this.notas = new ArrayList<>();
	}
	
	public void agregarNota(Nota nuevaNota){
		 ArrayList<Nota> notas = new ArrayList<>();
		int errores=0;
		
		  if (nuevaNota.getCalificacion() <= 0 || nuevaNota.getCalificacion() > 10) {
		        System.out.println("ERROR: La nota debe estar entre 1 y 10");
		        errores+=1;
		    }
		  for (int i = 0; i < notas.size(); i++) {
		        Nota notaExistente = notas.get(i);
		        if (notaExistente.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
		            System.out.println("ERROR: Ya existe una nota para la materia con código " 
		                               + nuevaNota.getCalificacion());
		            errores+=1;
		        }
		    }
		  if(errores == 0) {
			  notas.add(nuevaNota);
			    System.out.println("Nota agregada para  " +nuevaNota.getMateria().getNombre() +"    Nota asignada: "+ nuevaNota.getCalificacion());
		  } 
	}
	
	public void modificarNota(String codigo, double nuevaNota) {
		ArrayList<Nota> notas = new ArrayList<>();
		int errores=0;
		 if ( nuevaNota<= 0 || nuevaNota > 10) {
		        System.out.println("ERROR: La nota debe estar entre 1 y 10");
		     
		    }
		 for (int i = 0; i < notas.size(); i++) {
		        Nota nota = notas.get(i);
		        if (nota.getMateria().getCodigo().equals(codigo)) {
		            nota.setCalificacion(nuevaNota);    
		            System.out.println("Nota actualizada para la materia: " + codigo);
		           errores=1;
		        }
		    }
		 if(errores==0) {
			 System.out.println("ERROR: No existe una nota con código: " + codigo);	
		 }
		  
	}
	
	public double calcularPromedioNotasEstudiante() {
		double suma = 0;
		notas = new ArrayList<Nota>();
	    // Si no hay notas, evitar división por cero
	    if (notas.size() == 0) {
	        return 0;
	    }

	    for (int i = 0; i < notas.size(); i++) {
	        suma += notas.get(i).getCalificacion();
	    }

	    double promedio = suma / notas.size();
	    return promedio;
	}
	
	public void  mostrar() {
		notas = new ArrayList<>();
		 System.out.println("Cedula: "+ cedula + " Nombre: " + nombre+ " Apellido: " + apellido );
		 /*
		    for (int i = 0; i < notas.size(); i++) {
		        Nota nota = notas.get(i);
		        String nombreMateria = nota.getMateria().getNombre(); 
		        System.out.println("Materia: " + nombreMateria + " - Nota: " + nota.getCalificacion());
		    }*/
	}

}
