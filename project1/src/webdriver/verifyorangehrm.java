package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class verifyorangehrm 
{

	public static void main(String[] args)throws Exception
	{
	 System.setProperty("webdriver.chrome.driver","D:\\phanindra\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://apps.qaplanet.in/qahrm/login.php");
	 Thread.sleep(2000);
	 if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	 {
		 System.out.println("home page displayed");
		 
	 }
	 else
	 {
		 System.out.println("failed to displayed homepage");
		 return;
		 
	 }
	 WebElement objusername=driver.findElement(By.name("txtUserName"));
	 
	 WebElement objpassword=driver.findElement(By.name("txtPassword"));
	 WebElement objlogin=driver.findElement(By.name("Submit"));
	 WebElement objclear=driver.findElement(By.name("clear"));
	 if(objusername.isDisplayed())
	 {
		 System.out.println("user name displayed");
	 }
	 if(objpassword.isDisplayed())
	 {
		 System.out.println("password displayed");
	 }
	 if(objlogin.isDisplayed()&&objclear.isDisplayed())
	 {
		 System.out.println("login and clear fields are displayed");
	 }
	 String susername="qaplanet1";
	 String spassword="lab1";
	 objusername.clear();
	 objusername.sendKeys(susername);
	 objpassword.clear();
	 objpassword.sendKeys(spassword);
	 objlogin.click();
	 Thread.sleep(2000);
	 if(driver.getTitle().equals("OrangeHRM"))
	 {
		 System.out.println("orange hrm page displayed");
	 }
	 else
	 {
		 System.out.println("failed to login orange hrm page");
		 return;
	 }
	 String sweltext=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
   if(sweltext.equals("Welcome "+susername))
   {
	   
	   System.out.println("Welcome "+susername+" displayed");
   }
   else
   {
	   System.out.println("failed to load homepage");
   }
   WebElement objcp=driver.findElement(By.linkText("Change Password"));
   WebElement objlogout=driver.findElement(By.linkText("Logout"));
   if(objcp.isDisplayed()&&objlogout.isDisplayed())
   {
	   System.out.println("change password and logout is displayed");
   }
   objlogout.click();
   Thread.sleep(2000);
   if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
   {
	   System.out.println("signoff successful&homepage displayed");
   }
   else
   {
	   System.out.println("faild to signoff");
	   return;
   }
   driver.close();
   driver.quit();
	 
	 
			 
		 
	 }
	 
	 
	 
	

	}


