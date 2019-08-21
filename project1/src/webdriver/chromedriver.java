package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Table_01']tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("lab1");
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
		

	}

}
