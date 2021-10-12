package ejer2;

import java.io.File;
import java.io.IOException;

public class parte2 {

	public static void main(String[] args) {
		File fichero= new File("C:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-tmp\\Texto-INM\\info-temporal.txt");
		File fichero2= new File("C:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-tmp\\XML-INM\\info-temporal.txt");
		try {
			fichero.createNewFile();
			fichero2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
