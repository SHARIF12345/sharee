package webdriver;

import java.util.ArrayList;

public class arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("qaplanet1");
		al.add("qaplanet1");
		al.add("qaplanet2");
		al.add("qaplanet3");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		for (String a:al)
		{
			System.out.println(a);
		}

	}

}
