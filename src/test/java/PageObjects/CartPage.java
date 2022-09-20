package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	private WebDriver driver;
	
	public CartPage (WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getCriarButton() {
		
		return this.driver.findElement(By.id("criou"));
	}

}
