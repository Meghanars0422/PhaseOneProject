package FirstPhase;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFile {

	public void searchingFile(String path) {
		File directory = new File(path);
		String strName = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file to be searched.. ");
			strName = br.readLine();
			String[] filelist = directory.list();
			int flag = 0;
			if (filelist == null) {
				System.out.println("Empty directory.");
			} else {

				// Linear search in the array
				for (int i = 0; i < filelist.length; i++) {
					String filename = filelist[i];
					if (filename.equals(strName + ".txt")) {
						System.out.println(filename + " found \n");
						flag = 1;
					}
				}
			}

			if (flag == 0) {
				System.out.println("File Not Found \n");
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
