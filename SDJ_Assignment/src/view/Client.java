package view;
import java.util.Scanner;

import controller.*; 

public class Client {
	
	private ClientController clientController; 
	private Scanner in; 
	
	public Client(ClientController clientController)
	{
		this.clientController = clientController; 
		this.in = new Scanner(System.in);
	}
	
	private void showOptions()
	{
		System.out.println("Welcome to the Fairytale library system!"
				+ "\n What do you want to do next?"
				+ "\n 1) Lend an item"
				+ "\n 2) Return an item"
				+ "\n 3) Add a new item");  
		
		int choice = in.nextInt(); 
		switch(choice){
		case 1: lendItem(); 
		case 2: returnItem(); 
		case 3: addItem(); 
		}
	}
	
	private void lendItem()
	{
		Object item = searchItem();
		if (item == null)
			showOptions(); 
		else
			clientController.lendItem(item); 
	}
	
	private void returnItem()
	{
		Object item = searchItem();
		if (item == null)
			showOptions(); 
		else
			clientController.returnItem(item); 
	}
	
	private Object searchItem()
	{
		System.out.println("Which item do you want to lend out?"); 
		String query = in.nextLine();  
		Object item = clientController.searchItem(query); 
		
		System.out.println("Is this the item you want to lend out?: "
				+ "\n "  + item.toString()
				+ "\n press y for yes and n for no.");
		
		String choice = in.nextLine(); 
		switch(choice){
		case "y": return item; 
		case "n": return null;  
		}
		
		return null; 
		
	}
	
	
	
	

}
