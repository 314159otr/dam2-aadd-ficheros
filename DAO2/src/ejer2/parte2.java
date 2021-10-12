package ejer2;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class parte2 {

	public static void main(String[] args) {
//		File fichero= new File("C:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-tmp\\Texto-INM\\info-temporal.txt");
//		File fichero2= new File("C:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-tmp\\XML-INM\\info-temporal.txt");
//		
//		try {
//			fichero.createNewFile();
//			fichero2.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//otra forma:
		File carpeta = new File("C:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-tmp");
		File[] carpetas= carpeta.listFiles();
		File ficheroVacio =null;
		for (int i = 0; i < carpetas.length; i++) {
			if (carpetas[i].isDirectory()) {
				ficheroVacio= new File(carpetas[i].toString()+"\\info-temporal.txt");
				try {
					ficheroVacio.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	}

}
