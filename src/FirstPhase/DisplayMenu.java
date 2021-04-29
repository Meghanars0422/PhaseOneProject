package FirstPhase;

import java.util.Scanner;

public class DisplayMenu {

	private static final Scanner scnr = new Scanner(System.in);

	private static int mainMenu() {
		System.out.println("Please choose from the following from Main-Menu");
		System.out.println("1. Sort the files in a directory in ascending order");
		System.out.println("2. Display Create,Delete and Search options");
		System.out.println("3. Exit");
		System.out.println("Enter your choice::");
		int userChoice = scnr.nextInt();
		scnr.nextLine();
		return userChoice;
	}

	private static int subMenu() {
		System.out.println("Please choose the following Sub-Menu");
		System.out.println("1. Creation of File");
		System.out.println("2. Delete a file");
		System.out.println("3. Search a file");
		System.out.println("Enter your choice::");
		int userChoice = scnr.nextInt();
		scnr.nextLine();
		return userChoice;
	}

	public void displayMenuDetails() {
		String path = "C:\\Users\\Raghu\\eclipse-workspace\\PhaseOneProject";
		while (true) {
			int userChoice = mainMenu();
			switch (userChoice) {
			case 1:
				SortFilesInAscendingOrder sorting = new SortFilesInAscendingOrder();
				sorting.sortFiles(path);
				break;

			case 2:
				int newChoice = subMenu();
				switch (newChoice) {
				case 1:
					CreateFile creation = new CreateFile();
					creation.creationofFile();
					break;

				case 2:
					DeleteFile deletion = new DeleteFile();
					deletion.deletionOfFile(path);
					break;

				case 3:
					SearchFile searching = new SearchFile();
					searching.searchingFile(path);
					break;

				default:
					System.out.println("Error! Invalid selection");
				}
				break;

			case 3:
				System.out.println("Thank you for using this application");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid selection");
			}

		}
	}
}
