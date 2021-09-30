package es.iestetuan.pb.dao.vo;

public class Alumno extends Usuario {
	String nia;
	public Alumno(String nie, String nombre, String apellido1, String apellido2, String email,String nia) {
		super(nie, nombre, apellido1, apellido2, email);
		this.nia=nia;
	}
	public Alumno() {
		super();
	}
	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nie=" + nie + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", email=" + email + "]";
	}
	public String getNia() {
		return nia;
	}
	public void setNia(String nia) {
		this.nia = nia;
	}
	
}
