package FirstPhase;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteFile {

	public void deletionOfFile(String path) {
		String strName = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name:");

		// Reading File name
		try {
			strName = br.readLine();
			File myFile = new File(path + "\\" + strName + ".txt");
			System.out.println(myFile);
			if (myFile.delete()) {
				System.out.println("Deleted the file: " + myFile.getName());
			} else {
				System.out.println("Failed to delete the file. \n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
