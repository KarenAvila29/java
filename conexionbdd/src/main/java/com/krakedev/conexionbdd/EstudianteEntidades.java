package com.krakedev.conexionbdd;

import java.util.Date;

public class EstudianteEntidades {
	 private String cedula;
	    private String nombre;
	    private String apellido;
	    private String email;
	    private Date fechaNacimiento;
	    private ProfesorEntidades codigo_profesor;
	    
	    
		public EstudianteEntidades() {
			super();
		}
		
		public EstudianteEntidades(String cedula, String nombre, String apellido, String email, Date fechaNacimiento) {
			super();
			this.cedula = cedula;
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
			this.fechaNacimiento = fechaNacimiento;
		}
		
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public ProfesorEntidades getCodigo_profesor() {
			return codigo_profesor;
		}

		public void setCodigo_profesor(ProfesorEntidades codigo_profesor) {
			this.codigo_profesor = codigo_profesor;
		}

		@Override
		public String toString() {
			return "EstudianteEntidades [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
					+ ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", codigo_profesor="
					+ codigo_profesor + "]";
		}
	    
		
	    

}
