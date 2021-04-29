package FirstPhase;

public class WelcomeDetails {

	public void userDetails() {
		System.out.println("---------Welcome to LockedMe---------");
		System.out.println("	Developed By : Meghana RS		");
		System.out.println("  Email: meghana.yashu1993@gmail.com	");
		System.out.println("----------------------------------------");
	}

	public static void main(String args[]) {
		WelcomeDetails details = new WelcomeDetails();
		details.userDetails();

		DisplayMenu menu = new DisplayMenu();
		menu.displayMenuDetails();
	}
}
