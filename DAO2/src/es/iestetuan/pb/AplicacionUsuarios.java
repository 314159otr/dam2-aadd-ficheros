package es.iestetuan.pb;

import es.iestetuan.pb.dao.fictexto.UsuarioFicheroDAO;

public class AplicacionUsuarios {

	public static void main(String[] args) {
		UsuarioFicheroDAO test= new UsuarioFicheroDAO();
		
		System.out.println(test.getAlumnos());
		String nia ="318";
		System.out.println(test.getAlumno(nia));
		

	}

}
