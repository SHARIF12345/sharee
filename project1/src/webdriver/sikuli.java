package webdriver;

import org.sikuli.script.App;
import org.sikuli.script.Screen;

public class sikuli {

	public static void main(String[] args)throws Exception 
	{
		App.open("Calc.exe");
		Screen x=new Screen();
		if(x.exists("D:\\phanindra.sikuli\\cal.png")!=null)
		{
			System.out.println("calculator window displayed");
			
		}
		x.click("D:\\phanindra.sikuli\\1566369521168.png");
		x.click("D:\\phanindra.sikuli\\1566369533776.png");
		x.click("D:\\phanindra.sikuli\\1566369543121.png");
		x.click("D:\\phanindra.sikuli\\1566369551713.png");
		Thread.sleep(2000);
		App.close("Calc.exe");
		
		
	}

}
