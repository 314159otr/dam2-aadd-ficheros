package es.iestetuan.pb.dao.vo;

public class Usuario {
	String nie;
	String nombre;
	String apellido1;
	String apellido2;
	String email;
	public Usuario(String nie, String nombre, String apellido1, String apellido2, String email) {
		super();
		this.nie = nie;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
	}
	public Usuario() {
		
	}
	@Override
	public String toString() {
		return "Usuario [nie=" + nie + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", email=" + email + "]";
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
