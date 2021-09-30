package es.iestetuan.pb.dao;

import java.util.List;

import es.iestetuan.pb.dao.vo.Alumno;

public interface IUsuario {
	public Alumno getAlumno(String nia);
	public List<Alumno> getAlumnos();
}
