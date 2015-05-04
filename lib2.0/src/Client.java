import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import domain.controller.ClientController;
import domain.view.ClientView;


public class Client
{
	public static void main(String[] args) throws Exception 
	{		
		ClientView view = new ClientView();		
		view.start();
	}
}
