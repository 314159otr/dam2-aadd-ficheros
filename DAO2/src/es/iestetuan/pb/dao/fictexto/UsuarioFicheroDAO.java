package es.iestetuan.pb.dao.fictexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import es.iestetuan.pb.dao.IUsuario;
import es.iestetuan.pb.dao.vo.Alumno;

public class UsuarioFicheroDAO implements IUsuario {

	@Override
	public Alumno getAlumno(String nia) {
		BufferedReader objReader=null;
		Alumno niño= new Alumno();
		try {
			   String strCurrentLine;
			   objReader = new BufferedReader(new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt"));
			   strCurrentLine = objReader.readLine(); 
			   while ((strCurrentLine = objReader.readLine()) != null) {
				   String array[]=strCurrentLine.split(",");
				   if(array[0].equals(nia)) {
					   niño.setNia(nia);
					   niño.setNombre(array[1]);
					   niño.setApellido1(array[2]);
					   niño.setApellido2(array[3]);
					   break;
				   }
			   }
		} catch (IOException e) {
			e.printStackTrace();

		  } finally {

		   try {
		    if (objReader != null)
		     objReader.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   	}
		  	}
		return niño;
	 }

	@Override
	public List<Alumno> getAlumnos() {
		List<Alumno> alumnado= new ArrayList();
		BufferedReader objReader=null;
		
		try {
			   String strCurrentLine;
			   objReader = new BufferedReader(new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt"));
			   strCurrentLine = objReader.readLine(); 
			   while ((strCurrentLine = objReader.readLine()) != null) {
				   Alumno niño= new Alumno();
				   String array[]=strCurrentLine.split(",");
				   niño.setNia(array[0]);
				   niño.setNombre(array[1]);
				   niño.setApellido1(array[2]);
				   if(array.length>3) {
					   niño.setApellido2(array[3]);
				   }
				   
				   alumnado.add(niño);
			   }
		} catch (IOException e) {
			e.printStackTrace();

		  } finally {

		   try {
		    if (objReader != null)
		     objReader.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   	}
		  	}
		return alumnado;
	}

}
