package domain.mediator;

import java.io.BufferedReader;

public class ClientReceiverThread extends Thread{
	
	private BufferedReader in; 
	private ClientModelManager manager; 
	
	public ClientReceiverThread(BufferedReader in, ClientModelManager manager)
	{
		this.in = in; 
		this.manager = manager; 
	}
	
	

}
