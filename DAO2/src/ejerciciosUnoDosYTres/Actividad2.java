package ejerciciosUnoDosYTres;

import java.io.FileWriter;
public class Actividad2 {
	public static void main(String[] args) { 
		try{
			FileWriter fichero= new FileWriter("C:\\xampp\\htdocs\\aadd\\recursos\\Info-fichero.txt");
			fichero.write("Nombre,Apellidos,Curso \n");
			
			fichero.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		AñadirInfo("C:\\xampp\\htdocs\\aadd\\recursos\\Info-fichero.txt", "Piotr,Blaszczyk,DAM2");
		
		
	}
	public static void AñadirInfo(String fichero,String info) {
		try {
			FileWriter file=new FileWriter(fichero,true);
			file.write(info);
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

