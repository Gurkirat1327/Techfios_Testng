package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectTestCase {
	WebDriver driver;
    @Test
	public void logintestfortestng() {
    	 
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
	 driver = new ChromeDriver();
	driver.get("http://objectspy.space/");
 }
    @Test
    public void selecttest() throws InterruptedException {
    	//SElect south america
    	Thread.sleep(3000);
    	Select select = new Select(driver.findElement(By.id("continents")));
    	select.selectByVisibleText("South America");
    }

    
    
    
    
    
}
