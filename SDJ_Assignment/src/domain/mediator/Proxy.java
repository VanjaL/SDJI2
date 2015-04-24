package domain.mediator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Proxy extends ClientReceiverThread implements ModelInterface {
	
	private final int PORT = 901; 
	private String HOST = "localhost"; 
	private Socket clientSocket; 
	private static BufferedReader inFromServer; 
	private int id; 
	
	public Proxy(ClientModelManager manager)
	{
		super(inFromServer, manager); 
	}
	
	
	public void run()
	{
		Socket s;
		PrintWriter out = null;
		try {
			s = new Socket(HOST, PORT);
			out = new PrintWriter(s.getOutputStream());
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		while(true)
		{
			out.println(super.search()); 
		}
		
	}


	@Override
	public void add(AbstractMessage message) {
		// TODO Auto-generated method stub
		
	}


}
