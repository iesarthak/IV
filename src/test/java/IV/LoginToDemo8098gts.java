package IV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToDemo8098gts {
    
	@Test
	public void titleTest()
	{
		SoftAssert softassert = new SoftAssert();
		String expectedtitle = "IVCargo - Login";
		boolean expectedlogo = "IVCargo_gif" != null;
		boolean expectedsupport = "Software Support" != null;
		WebDriverManager.firefoxdriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("http://demo.ivgroup.in:8098/ivcargo/login.do");
		String actualtitle = d.getTitle();
		System.out.println("Title is verify");
		softassert.assertEquals(actualtitle, expectedtitle, "Title is not present");
		boolean actuallogo = d.findElement(By.xpath("(//img[@src='/ivcargo/images/IVCargo_gif.gif'])[1]")).isDisplayed();
	    System.out.println("Icon is presnt");
	    softassert.assertEquals(actuallogo, expectedlogo, "Logo is not Present");
	    boolean actualsupport = d.findElement(By.xpath("//li[text()=' Software Support : ']")).isDisplayed();
	    System.out.println("Support is Present");
	    softassert.assertEquals(actualsupport, expectedsupport, "Support is not displayed");
		System.out.println("driver closed");
		d.close();
		softassert.assertAll();
	}
}
