package domain.mediator;

public class ClientModelManager implements ModelInterface{
	
	private Proxy proxy; 
	private String itemName; 
	
	public ClientModelManager()
	{
		proxy = new Proxy(this); 
	}

	@Override
	public void add(AbstractMessage message) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void getItemName(String item)
	{
		itemName = item; 
	}
	
	public String search()
	{
		return "search: " + itemName; 
	}
	
	public void lendItem(Object item)
	{
		
	}
	
	
	
	

}
