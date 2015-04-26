package domain.mediator;

import java.io.BufferedReader;

public class ClientReceiverThread extends Thread{
	
	protected ClientModelManager manager; 
	
	public ClientReceiverThread(ClientModelManager manager)
	{
		this.manager = manager; 
	}
	
	public String search()
	{
		return manager.search(); 
	}
	

}
