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
				break;
		case 2: returnItem();
				break;
		case 3: addItem();
				break; 
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
	
	private void addItem()
	{
		System.out.println("Enter 1 if the item is a book, "
				+ "\n 2 if the item is an article, "
				+ "\n 3 if the item is a cd,"
				+ "\n 4 if the item is a dvd."); 
		
		int choice = in.nextInt(); 
		
		switch(choice){
		case 1: addBook(); 
				break; 
		case 2: addArticle();
				break; 
		case 3: addCd();
				break; 
		case 4: addDvd();
				break;}
		
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
	
	private void addBook()
	{
		System.out.println("Enter the title: "); 
		String title = in.nextLine(); 
		System.out.println("Enter the author: "); 
		String author = in.nextLine(); 
		System.out.println("Enter the ISBN: ");
		String isbn = in.nextLine();
		
		clientController.addBook(title, author, isbn); 
	}
	
	private void addArticle()
	{
		System.out.println("Enter the title: "); 
		String title = in.nextLine(); 
		System.out.println("Enter the author: "); 
		String author = in.nextLine(); 
		System.out.println("Enter the ISBN: ");
		String isbn = in.nextLine();
		
		clientController.addArticle(title, author, isbn); 
	}
	
	private void addDvd()
	{
		System.out.println("Enter the title: "); 
		String title = in.nextLine(); 
		System.out.println("Enter the author: "); 
		String author = in.nextLine();
		
		clientController.addDvd(title, author); 
	}
	
	private void addCd()
	{
		System.out.println("Enter the title: "); 
		String title = in.nextLine(); 
		System.out.println("Enter the author: "); 
		String author = in.nextLine();
		
		clientController.addCd(title, author); 
	}

}
