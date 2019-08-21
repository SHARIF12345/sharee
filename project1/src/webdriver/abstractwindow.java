package webdriver;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class abstractwindow {

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver Driver=new ChromeDriver();
    Actions act=new Actions(Driver);
    WebDriverWait wait=new WebDriverWait(Driver, 60);
  
  //-------------------------------------------------
  //Maximize browser
  Driver.manage().window().maximize();
  //----------------------------------------	
  //open application
  Driver.get("http://apps.qaplanet.in/hrm/login.php");
  //wait for home page
  wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));  //Verify title of current web page
  if(Driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
  {
  System.out.println("Home Page displayed");
  }
  else
  {
  System.out.println("Failed to open home page");
  return;
  }
  //create webelement for UN,PWD,Login and clear
  WebElement objUN=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
  WebElement objPWD=Driver.findElement(By.name("txtPassword"));
  WebElement objLogin=Driver.findElement(By.name("Submit"));
  WebElement objClear=Driver.findElement(By.name("clear"));
  //----------------------------------------------------------
  //Verify user name
  if(objUN.isDisplayed())
  {
  System.out.println("User name displayed");
  }
  //Verify password
  if(objPWD.isDisplayed())
  {
  System.out.println("Password displayed");
  }
  //Verify Login and clear
  if(objLogin.isDisplayed() && objClear.isDisplayed())
  {
  System.out.println("Login and clear buttons are displayed");
  }
  //------------------Login To OrangeHRM----------------------------------
  String sUserName="qaplanet1";
  String sPassword="lab1";
  //----------------------------------------------------------------------
  //Enter user name
  objUN.clear();
  objUN.sendKeys(sUserName);
  //Enter password
  objPWD.clear();
  objPWD.sendKeys(sPassword);
  //Click on Login
  objLogin.click();
  //wait for orangeHRM
  wait.until(ExpectedConditions.titleIs("OrangeHRM"));
  //Verify OrangeHRM web page
  if(Driver.getTitle().equals("OrangeHRM"))
  {
  System.out.println("OrangeHRM Page displayed");
  }
  else
  {
  System.out.println("Failed to login OrangeHRM page");
  return;
  }	
  //-----------------------------------------------------
  //Get welcome text
  String sWelText=Driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]")).getText();
  //verify welcome text
  if(sWelText.equals("Welcome "+sUserName))
  {
  System.out.println("Welcome "+sUserName+" displayed");
  }
  //Way 2: Verify only user name
  String[]  Arr=sWelText.split(" ");
  if(Arr[1].equals(sUserName))
  {
  System.out.println(sUserName+" displayed");
  }
  //way 3
  if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//ul[@id='option-menu']/li[1]"), "Welcome "+sUserName)))
  {
  System.out.println("Welcome "+sUserName+" displayed");
  }
  //----------------------------------------------------------------------------
  //create webelement for change password and logout
  WebElement objCP=Driver.findElement(By.linkText("Change Password"));
  WebElement objLogout=Driver.findElement(By.linkText("Logout"));
  //Verify change password and logout
  if(objCP.isDisplayed() && objLogout.isDisplayed())
  {
  System.out.println("change password and logout are displayed");
  }
  //------------------------------------------------------------
  //create webelement for pim
  WebElement objPIM=Driver.findElement(By.id("pim"));
  //Mouse over on PIM
  act.moveToElement(objPIM).perform();
  //Click on Add employee
  Driver.findElement(By.linkText("Add Employee")).click();
  //wait 2 sec
  Thread.sleep(2000);
  //-------------------------------------------------------------
  //switch to frame
  Driver.switchTo().frame("rightMenu");
  //Verify PIM : Add Employee
  if(Driver.findElement(By.xpath("//div[@class='mainHeading']/h2")).getText().equals("PIM : Add Employee")) 
  {
  System.out.println("PIM : Add Employee displayed");
  }
  //---------------------------------------------------------------
  //Get employee code
  String sEmpCode=Driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
  //create webelement for save button
  WebElement objSave=Driver.findElement(By.id("btnEdit"));
  //---------------------------------------------------------------
  String sFN="JOHN";
  String sLN="SMITH";
  //----------------------------------------------------------------
  //Click on save
  objSave.click();
  //wait for alert
  
  Alert A=wait.until(ExpectedConditions.alertIsPresent());
  //verify alert message
  if(A.getText().equals("Last Name Empty!"))
  {
  System.out.println("Last Name Empty! displayed");
  A.accept();
  }
  //Enter last name
  Driver.findElement(By.name("txtEmpLastName")).sendKeys(sLN);
  //---------------------------------------------------------------
  //Click on save
  objSave.click();
  //wait for alert
  Alert A1=wait.until(ExpectedConditions.alertIsPresent());
  //verify alert message
  if(A1.getText().equals("First Name Empty!"))
  {
  System.out.println("First Name Empty! displayed");
  A1.accept();
  }
  //Enter first name
  Driver.findElement(By.name("txtEmpFirstName")).sendKeys(sFN);
  //-------------------------------------------------------------------
  act.click(Driver.findElement(By.id("photofile"))).perform();
  Robot rt=new Robot();
  StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg");
  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
  rt.delay(1000);
  rt.keyPress(KeyEvent.VK_CONTROL);
  rt.keyPress(KeyEvent.VK_V);
  rt.keyRelease(KeyEvent.VK_V);
  rt.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(2000);
  rt.delay(2000);
  rt.keyPress(KeyEvent.VK_ENTER);
  rt.delay(1000);
  rt.keyRelease(KeyEvent.VK_ENTER);
  rt.delay(1000);
  //Click on save
  
  //objSave.click();
  
  
  //C:\Users\Public\Pictures\Sample Pictures\
    
 
	}

}
