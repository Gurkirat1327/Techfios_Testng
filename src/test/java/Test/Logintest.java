package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Logintest {
      @Test
	public void logintestfortestng() {
    	 
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	

}
}