package es.iestetuan.pb.dao.vo;

public class Profesor extends Usuario {
	String departamento;

	public Profesor(String nie, String nombre, String apellido1, String apellido2, String email, String departamento) {
		super(nie, nombre, apellido1, apellido2, email);
		this.departamento = departamento;
	}
	public Profesor() {
		super();
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", nie=" + nie + ", nombre=" + nombre + ", apellido1="
				+ apellido1 + ", apellido2=" + apellido2 + ", email=" + email + "]";
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
