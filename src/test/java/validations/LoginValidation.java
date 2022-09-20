package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.HomePage;
import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;

public class LoginValidation {
	
	private WebDriver driver;
	private HomePage homePage;
	private Waits wait;
	
	public LoginValidation (WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(driver);
		wait = new Waits(driver);
	}
	
	public void validationLoginPage() {
		
		try {
			wait.loadElement(homePage.getLogoTitle());
			Assertions.assertTrue(homePage.getLogoTitle().isDisplayed());
		    Report.log(Status.PASS,"Página de login Acessada com Sucesso", Screenshot.capture(driver));
			
			
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
		
	}

}
