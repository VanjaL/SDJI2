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
				+ "What do you want to do next?"
				+ "1) Lend an item"
				+ "2) Return an item"
				+ "3) Add a new item");  
		
		int choice = in.nextInt(); 
		switch(choice){
		case 1: lendItem(); 
		case 2: returnItem(); 
		case 3: addItem(); 
		}
	}
	
	private void lendItem()
	{
		System.out.println("Which item do you want to lend out?"); 
		String item = in.nextLine();  
		searchItem(item); 
	}
	
	private void returnItem()
	{
		System.out.println("Which item do you want to return?"); 
		String item = in.nextLine();
		searchItem(item);
	}
	
	private void returnItem(Object item)
	{
		clientController.returnItem(item); 
	}

}
