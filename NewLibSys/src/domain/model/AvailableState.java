package domain.model;

public class AvailableState implements State{
	
	private Item item; 
	
	public AvailableState(Item item)
	{
		this.item = item; 
	}

	@Override
	public void lendOut(String name, String email) {
		item.setState(item.getLendoutState(name, email));
		
	}

	@Override
	public void returnItem() {
		System.out.println("The item is available.");
		
	}
}
