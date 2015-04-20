import java.util.ArrayList;

import domain.model.*;
public class testing 
{
	public static void main(String[] args) 
	{
		Book a = new Book("title1", 1, "author1", "isbn");
		Book b = new Book("title2", 1, "author2", "isbn");
		CD c = new CD("title3", 1, "artist1");
		DVD d = new DVD("title4", 1, "artist2");
		Article e = new Article("title5", 1, "author2", "magazine1");
		
		ListADT list = new LinkedList<Item>();
		list.add(0, a);
		list.add(1,b);
		list.add(2,c);
		list.add(3,d);
		list.add(4,e);
	
		//System.out.println(list.toString());
		
		ArrayList<Item> al = list.toArray();
		
		for (int i = 0; i < al.size(); i++) {
			Item s = al.get(i);
			System.out.println("" + s.toString());
		}
	}

}