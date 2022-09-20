package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class CheckoutPage {
	
	private WebDriver driver;
	private Waits wait;
	
	public CheckoutPage (WebDriver driver) {
		
		this.driver = driver;
		wait = new Waits(driver);
	}
	
    public WebElement getLogoTitle() {
		
		return wait.visibilityofElement(By.className("title"));
    }
	
	public WebElement getUserNameTextField() {
		
		return wait.visibilityofElement(By.id("user-name"));
	}
	
	public WebElement getUltimoNomeTextField() {
		
		return driver.findElement(By.id("user-lastname"));
	}
	
	public WebElement getUnivesidadeTextField() {
		
		return driver.findElement(By.id("user-university"));
	}
	
    public WebElement getProfissaoTextField() {
		
		return driver.findElement(By.id("user-profile"));
    }
    
    public WebElement getgeneroTextField() {
		
		return driver.findElement(By.id("user-gender"));
    }
    
     public WebElement getIdadeTextField() {
		
		return driver.findElement(By.id("user-age"));
    
     }
    
   
     public WebElement getcriarbutton() {
 		
 		return driver.findElement(By.className("criar"));
     
      } 
     
     
     public WebElement getvoltarbutton() {
 		
 		return driver.findElement(By.className("href"));
     
      }
     

}
