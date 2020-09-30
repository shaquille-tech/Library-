package Library;

import java.util.ArrayList;
import java.util.List;


public abstract class Items {

	//Variables 
	static int ID;
	String Name;
	
	private List<Item> Items = new ArrayList<>();
	
	//Constructor
	public Items (String Name, int ID) {
		super();
		this.Name = Name;
		Items.ID = ID;	
		boolean taken = true;
	}
	
	//Methods
	public void Checkout(int ID) {
		if (taken) {
			RemoveItem (ID);
			System.out.println("Item has been checked out");
			
		} 
		else {
			System.out.println("Item is still in the Library");
		}
		
	}
	
	public boolean CheckIn() {
		
	}
	
	public boolean AddItem() {
		return this.Items.add(Item);
		
	}
	
	public void RemoveItem(int ID) {
		List<Item> toRemove = new ArrayList<>();
		
	}
	
	public void UpdateItem() {
		
	}
	
	public void RegisterPerson() {
		
	}
	
	public void DeletePerson() {
		
	}
	
	public void UpdatePerson() {
		
	}
	
}
