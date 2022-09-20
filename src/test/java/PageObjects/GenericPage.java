package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class GenericPage {

	private WebDriver driver;
	private Waits wait;
	
	public GenericPage(WebDriver driver) {
		
		this.driver = driver;
		wait = new Waits(this.driver);
	}
	
	public WebElement getHomeLabelTitle() {
		
		return driver.findElement(By.xpath("//div[@id='header_container']/div[@class='header_secondary_container']/span[@class='title']"));
	}
	
	
}
