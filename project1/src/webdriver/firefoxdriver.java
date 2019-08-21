package webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxdriver 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		

	}

}
