package ejerciciosUnoDosYTres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad3 {

	public static void main(String[] args) {
		BufferedReader objReader = null;
		  try {
		   String strCurrentLine;

		   objReader = new BufferedReader(new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt"));
		   strCurrentLine = objReader.readLine(); 
		   while ((strCurrentLine = objReader.readLine()) != null) {
			   
			   String array[]=strCurrentLine.split(",");
			   Actividad2.AñadirInfo("C:\\xampp\\htdocs\\aadd\\recursos\\Info-fichero.txt", array[1]+",");
			   for(int i=2;i<array.length;i++) {
				   Actividad2.AñadirInfo("C:\\xampp\\htdocs\\aadd\\recursos\\Info-fichero.txt", array[i]);
			   }
			   Actividad2.AñadirInfo("C:\\xampp\\htdocs\\aadd\\recursos\\Info-fichero.txt", ", DAM2 \n");
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
		 }
		}