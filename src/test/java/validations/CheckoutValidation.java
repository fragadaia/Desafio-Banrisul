package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.CheckoutPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class CheckoutValidation {
	
	private WebDriver driver;
	private CheckoutPage checkoutPage;
	
	public CheckoutValidation (WebDriver driver) {
		
		this.driver = driver;
		checkoutPage = new CheckoutPage(driver);
	}
	
	public void validaForm() {
		
		try {
			
			String primeiroNome = checkoutPage.getUserNameTextField().getText();
			Assertions.assertFalse(checkoutPage.getUserNameTextField().getAttribute("value").equalsIgnoreCase(" "));
		    Report.log(Status.PASS, "Formulario Preenchido corretamente", Screenshot.captureBase64(driver));
		    Report.log(Status.INFO, primeiroNome);
		    
		}catch (Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
			
		}
		
		
	}

}
