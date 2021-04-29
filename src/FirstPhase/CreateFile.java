package FirstPhase;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFile {
	public void creationofFile() {
		String strName = "";

		// Try-catch Block
		try {

			// Creating BufferedReadered object
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file name:");

			// Reading File name
			strName = br.readLine();

			// Creating File Object
			File file1 = new File("" + strName + ".txt");

			// Method createNewFile() method creates blank
			// file.
			if (file1.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		}

		// Try-Catch Block
		catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
