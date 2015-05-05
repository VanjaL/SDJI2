package utility;

import java.util.ArrayList;

import domain.model.Article;
import domain.model.Book;
import domain.model.CD;
import domain.model.DVD;
import domain.model.Item;
import domain.model.LinkedList;
import domain.model.ListADT;

public class HardCodeMethods
{
	private int size;
	public static ArrayList<Item> hardCodedList() 
		
	
	{
		Book a = new Book("title1", "author1", "isbn");
		Book b = new Book("title2", "author2", "isbn");
		CD c = new CD("title3", "artist3");
		DVD d = new DVD("title4", "artist4");
		Article e = new Article("title5", "author5", "magazine1");
		Book f = new Book("title6", "author6", "isbn");
		Book g = new Book("title7", "author7", "isbn");
		CD h = new CD("title8", "artist8");
		DVD i = new DVD("title9", "artist9");
		Article j = new Article("title10", "author10", "magazine2");
		Book k = new Book("title11", "author11", "isbn");
		Book l = new Book("title12", "author12", "isbn");
		CD m = new CD("title13", "artist13");
		DVD n = new DVD("title14", "artist14");
		Article o = new Article("title15", "author15", "magazine3");
		Book p = new Book("title16","author16", "isbn");
		Book q = new Book("title17", "author17", "isbn");
		CD r = new CD("title18", "artist18");
		DVD s = new DVD("title19", "artist19");
		Article t = new Article("title20", "author20", "magazine4");
		
		ListADT list = new LinkedList<Item>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		list.add(i);
		list.add(j);
		list.add(k);
		list.add(l);
		list.add(m);
		list.add(n);
		list.add(o);
		list.add(p);
		list.add(q);
		list.add(r);
		list.add(s);
		list.add(t);
	
		System.out.println(list.toString());
		
		ArrayList<Item> al = list.toArray();
		
		for (int i1 = 0; i1 < al.size(); i1++) {
			Item s1 = al.get(i1);
			System.out.println("" + s1.toString());
		}
		return al;
	}
	
}
