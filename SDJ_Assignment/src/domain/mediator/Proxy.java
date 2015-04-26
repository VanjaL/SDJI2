package domain.mediator;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
		super(manager); 
	}
	
	
	public void run()
	{
		Socket s;
		DataOutputStream out = null;
		
		try {
			s = new Socket(HOST, PORT);
			out = new DataOutputStream(s.getOutputStream());
			inFromServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String serverResponse = null;
		String task = manager.search();
		try {
			out.writeBytes(task + '\n');
			serverResponse = inFromServer.readLine(); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Server response: " + serverResponse);
	}


	@Override
	public void add(AbstractMessage message) {
		// TODO Auto-generated method stub
		
	}


}
