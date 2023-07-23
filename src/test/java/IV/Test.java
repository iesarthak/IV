package IV;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	   public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.firefoxdriver().setup();
       FirefoxDriver driver = new FirefoxDriver();
       driver.get("http://demo.ivgroup.in:8098/ivcargo/Login.do");
       
       driver.findElement(By.xpath("//*[@id=\"accountGroupCode\"]")).sendKeys("gts");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("dem0@iv(arg0");
	    Thread.sleep(20000);
	 
	    driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	    Thread.sleep(2000);
	    
	    Actions a = new Actions(driver);
	    WebElement operation= driver.findElement(By.xpath("//*[@id=\"create\"]"));
	    a.moveToElement(operation).perform();
	    Thread.sleep(2000);
	    
	    WebElement Booking= driver.findElement(By.linkText("Booking"));
	    a.moveToElement(Booking).perform();
	    Booking.click();
	    Thread.sleep(2000);
	    
	    WebElement BookingType= driver.findElement(By.xpath("//*[@id=\"bookingType\"]"));
	    Select S1 = new Select(BookingType);
	    S1.selectByVisibleText("Sundry");
	    
	    driver.findElement(By.xpath("//*[@id=\"destination\"]")).click();
	    WebElement Destination = driver.findElement(By.xpath("//input[@placeholder='Delivery Destination']"));
	    Destination.sendKeys("KALYAN");
	    Thread.sleep(2000);
//	    Destination.sendKeys(Keys.ARROW_DOWN);
//	    Thread.sleep(2000);
	    Destination.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"consignorName\"]")).click();
	    WebElement Consignor_From = driver.findElement(By.xpath("//input[@placeholder='Consignor (From) Name']"));
	    Consignor_From.sendKeys("KUNAL BOX");
	    Thread.sleep(2000);
	    Consignor_From.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"consigneeName\"]")).click();
	    WebElement Consignee_To = driver.findElement(By.xpath("//input[@placeholder='Consignee (To) Name']"));
	    Consignee_To.sendKeys("KRISHNA");
	    Thread.sleep(2000);
	    Consignee_To.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("20");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"packingTypeAutoCompleter\"]")).click();
	    WebElement ArtType = driver.findElement(By.xpath("//input[@placeholder='Art Type']"));
	    ArtType.sendKeys("BAGS");
	    Thread.sleep(2000);
	    ArtType.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"saidToContain\"]")).click();
	    WebElement Content = driver.findElement(By.xpath("//input[@placeholder='Said To Contains']"));
	    Content.sendKeys("CLOCK");
	    Thread.sleep(2000);
	    Content.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"add\"]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"actualWeight\"]")).sendKeys("20");
	    Thread.sleep(2000);
	  
	    driver.findElement(By.xpath("//*[@id=\"fixAmount\"]")).sendKeys("120");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"invoiceNo\"]")).sendKeys("1234");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"declaredValue\"]")).sendKeys("134");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"charge24\"]")).sendKeys("30");
	    Thread.sleep(2000);
	    
//	    driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
//	    Thread.sleep(2000);
	    
	}

}
