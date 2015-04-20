package domain.mediator;
import java.io.BufferedReader;
import java.net.Socket;

public class Proxy extends ClientReceiverThread implements ModelInterface {
	
	private final int PORT = 901; 
	private String HOST = "localhost"; 
	private Socket clientSocket; 
	private static BufferedReader inFromServer; 
	private int id; 
	
	public Proxy(ClientModelManager model)
	{
		super(inFromServer, model); 
		

	}
	
	public void logIn()
	{
		
	}
	
	public void logOut()
	{
		
	}

	@Override
	public void add(AbstractMessage message) {
		// TODO Auto-generated method stub
		
	}
	
	public void run()
	{
		

	}

}
