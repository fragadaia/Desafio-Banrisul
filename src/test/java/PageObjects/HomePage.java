package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class HomePage {

	private static final String automacaocomBatista = null;
	private WebDriver driver;
	private Waits wait;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		wait = new Waits(this.driver);
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
     
     
	public void NovoUsuário() {
		
		getUserNameTextField().sendKeys("Nome");
		getUltimoNomeTextField().sendKeys("UltimoNome");
		getUnivesidadeTextField().sendKeys("Universidade");
		getProfissaoTextField().sendKeys("Profissao");
		getgeneroTextField().sendKeys("Genero");
		getIdadeTextField().sendKeys("Idade");
		getcriarbutton().click();
		getvoltarbutton().click();
		
	}
}
