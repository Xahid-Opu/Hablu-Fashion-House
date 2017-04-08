import java.util.Hashtable;
public class Store {
	private String name;
	private int totalSales=0;
	
	public Store() {
		}
	
	
	Hashtable<String,Integer> items= new Hashtable<String,Integer>();
	Hashtable<String,Integer> stock= new Hashtable<String,Integer>();
	
	public Store(String name) {
		this.name= name;
	}
	
	public String getStoreName() {
		return name;
	}
	
	
	public void isItemAvailable(String name) {
		
		if (items.containsKey(name)) {
			System.out.println("Yes, we have "+name);
		}
		else {
			System.out.println("Sorry, we do not have"+name);
		}
	}
	
	public void getPrice(String name) {
		if (items.containsKey(name)) {
			System.out.println("Price of "+name+" is: "+items.get(name)+"tk.");
		}
		else {
			System.out.println("Sorry we do not have "+name);
		}
	}
	
	
	public void sellItem(String name,int quantity) {
		if (stock.get(name)<quantity) {
			System.out.println("Sorry we have only "+stock.get(name)+" piece "+"of "+name);
		}
		
		else {
			int itemPrice= items.get(name);
			int currentSale= itemPrice*quantity;
			totalSales= totalSales+currentSale;
			stock.put(name, stock.get(name)-quantity);
			System.out.println("Thanks for your sell, Total price:" +currentSale);
			
			
			if (stock.get(name)==0) {
				stock.remove(name);
			}
		}
	}
	
	
	public void addItem(String name, int quantity, int price) {
		if (stock.containsKey(name)) {
			stock.put(name, stock.get(name)+quantity);
			
		}
		
		else {
			items.put(name, price);
			stock.put(name,quantity);
		}
		
	}
	
}
