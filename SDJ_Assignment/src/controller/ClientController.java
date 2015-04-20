package controller;

import view.Client;
import domain.mediator.ClientModelManager;

public class ClientController {
	
	private ClientModelManager manager; 
	private Client clientView; 

	public ClientController(ClientModelManager manager, Client clientView)
	{
		this.manager = manager;
		this.clientView = clientView; 
	}
	
	public Object searchItem(String item)
	{
		return manager.searchItem(item);  
	}
	
	public void lendItem(Object item)
	{
		manager.lendItem(item);
	}
	
	public void returnItem(Object item)
	{
		
	}
	
	public void addBook(String title, String author, String isbn)
	{
		
	}
	
	public void addArticle(String title, String author, String isbn)
	{
		
	}
	
	public void addCd(String title, String author)
	{
		
	}
	
	public void addDvd(String title, String author)
	{
		
	}
}
