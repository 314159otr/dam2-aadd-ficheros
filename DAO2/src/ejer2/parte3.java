package ejer2;

import java.io.File;
import java.nio.file.Files;

public class parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("C:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-tmp");
		deleteDir(path);

	}
	static void deleteDir(File file) {
	    File[] contents = file.listFiles();
	    if (contents != null) {
	        for (File f : contents) {
	            if (! Files.isSymbolicLink(f.toPath())) {
	                deleteDir(f);
	            }
	        }
	    }
	    file.delete();
	}

}
