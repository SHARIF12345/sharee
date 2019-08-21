package webdriver;

public class findnumberofp 
{

	public static void main(String[] args) 
	{
		String searchMe="peter piper picked a peck of picked peppers";
		int max=searchMe.length();
		int numps=0;
		for(int i=0;i<max;i++)
		{
			if(searchMe.charAt(i)!='p')
				continue;
			numps++;
			{
				System.out.println("found  "+numps+"  p's in the string.");
			}
		}

	}

}
