package krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	
	private ArrayList<Estudiante> estudiantes;
	
	
	
	public Curso() {
        estudiantes = new ArrayList<>();
    }
	/*1*/

	public ArrayList<Estudiante> getEstudiante() {
		return estudiantes;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public void add(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}
	
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante){
			Estudiante est;
		for (int i = 0; i < estudiantes.size(); i++) {
				est=estudiantes.get(i);
			if (est.getCedula().equals(estudiante.getCedula())) {
	                return est;
	            }
	        }
	        return null; 
	    }
	
	 public void matricularEstudiante(Estudiante estudiante) {

	        Estudiante encontrado = buscarEstudiantePorCedula(estudiante);
	        if (encontrado == null) {
	            estudiantes.add(estudiante);
	            System.out.println("Estudiante matriculado con éxito.");
	        } else {
	            System.out.println("El estudiante ya está matriculado.");
	        }
	    }
	 
	public double  calcularPromedioCurso(){
		Estudiante est;
		 double sumaPromedios = 0;
		for(int i=0; i<estudiantes.size();i++) {
			est = estudiantes.get(i);
			sumaPromedios=+est.calcularPromedioNotasEstudiante();	
		}
		return sumaPromedios / estudiantes.size(); 
	 }
	
	public void mostrar() {
		
		    for (int i = 0; i < estudiantes.size(); i++) {
		        Estudiante est = estudiantes.get(i);
		        System.out.println("Estudiante: " + est.getNombre() + " " + est.getApellido() + " - Cédula: " + est.getCedula());
		    }
	}
}
