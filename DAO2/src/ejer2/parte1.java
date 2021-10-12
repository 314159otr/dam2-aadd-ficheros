package ejer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class parte1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
	    Properties prop = null;
	    try {
	    	fis = new FileInputStream("C:\\Users\\piotr\\eclipse-workspace\\Actividad2\\src\\info-configuracion.properties");
	        prop = new Properties();
	        prop.load(fis);
	    } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	    
	    try {

	        Path path = Paths.get(prop.getProperty("Primera"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Segunda"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.1.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.1.2"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2.2"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2.2.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2.3"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2.2"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2.2.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.2.3"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.3"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.3.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.3.2"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.3.2.1"));
	        Files.createDirectories(path);
	        path = Paths.get(prop.getProperty("Carpeta1.1.3.3"));
	        Files.createDirectories(path);
	        
	        System.out.println("Directory is created!");
	      } catch (IOException e) {
	        System.err.println("Failed to create directory!" + e.getMessage());

	      }
	    

	}

}
