import java.util.Scanner;
public class storeTest extends Store {
	 String name;
	 int price;
	 int quantity;
	
	
	public storeTest() {
		super();
	}
	
	public void method(int choose) {
		Scanner input= new Scanner(System.in);
		switch (choose)
		{
		case 0:
			break;
			
		case 1:
			System.out.print("Enter Item name: ");
			name= input.nextLine();
			
			System.out.printf("Enter the price of %s: ",name);
			price= input.nextInt();
			
			System.out.printf("How many %s you want to add?: ",name);
			quantity= input.nextInt();
			addItem(name, quantity,price);
			break;
			
		case 2:
			System.out.print("Enter the item name what you want: ");
			name= input.nextLine();
			isItemAvailable(name);
			break;
			
		case 3:
			System.out.print("Enter Item name: ");
			name= input.nextLine();
			getPrice(name);
			break;
			
		case 4:
			System.out.print("Enter the name Which Item you want to sell: ");
			name= input.nextLine();
			System.out.print("Enter the Quantity: ");
			quantity= input.nextInt();
			sellItem(name, quantity);
			break;
		}
	}

}
