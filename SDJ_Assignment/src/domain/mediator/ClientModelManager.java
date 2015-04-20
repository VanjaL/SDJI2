package domain.mediator;

public class ClientModelManager implements ModelInterface{
	
	private Proxy proxy; 
	
	public ClientModelManager()
	{
		proxy = new Proxy(this); 
	}

	@Override
	public void add(AbstractMessage message) {
		// TODO Auto-generated method stub
		
	}
	
	public Object searchItem(String item)
	{
		return null;
	}
	
	public void lendItem(Object item)
	{
		
	}
	
	
	
	

}
