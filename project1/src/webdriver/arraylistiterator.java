package webdriver;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistiterator
{

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("qap1");
		al.add("qap1");
		al.add("qap2");
		al.add("add3");
		Iterator<String> it=al.iterator();
		while(it.hasNext())
		{
			String data=it.next();
			System.out.println(data);
		}

	}

}
