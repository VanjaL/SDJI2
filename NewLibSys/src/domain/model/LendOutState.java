package domain.model;

public class LendOutState implements State{

	private Item item;
	
	public LendOutState(Item item)
	{
		this.item = item; 
	}

	@Override
	public void lendOut(String name, String email) {
		System.out.println("The item is already lent out!"); 
	}

	@Override
	public void returnItem() {
		item.setState(item.getAvailableState());
		System.out.println("The item is now available! "); 
		
	}
	

}
