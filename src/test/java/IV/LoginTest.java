package IV;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginTest {

	@BeforeTest
	public void LoginToApplication() 
	{
		System.out.println("Login to Application");
		
	}
	
	@AfterTest
	public void LogoutFromApplication()
	{
		System.out.println("Logout From Application");
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void disconnectToDB()
	{
		System.out.println("DB Disconnect");
	}
	
	@Test(priority=1,description = "This is Login Test")
	public void bTest1() {
		
		System.out.println("Test1");
		
	}
	
	@Test(priority=2,description = "This is Logout Test")
	public void aTest2() {
		
		System.out.println("Test2");
	}

}
