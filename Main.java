import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		Store habluStore = new Store("Hablu Fashion House.");
		storeTest checkInput= new storeTest();
		System.out.println(habluStore.getStoreName());
		
		Scanner input= new Scanner(System.in);
		int choose;
		
		System.out.printf("Enter 1, To Stock Item.\n"
				+ "Enter 2, To check availability of the Item.\n"
				+ "Enter 3, to get the price of Item.\n"
				+ "Enter 4, to sell Items.\n\n");
		
		do {
		System.out.print("Enter your choose here (0 to exit) : ");
		choose= input.nextInt();
		checkInput.method(choose);
		System.out.println();
		}while (choose!=0);
		
	
	}
}
