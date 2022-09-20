package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.GenericPage;
import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;

public class GenericValidation {
	
	private WebDriver driver;
	private GenericPage genericPage;
	private Waits wait;
	
	public GenericValidation(WebDriver driver) {
		
		this.driver = driver;
		genericPage = new GenericPage(driver);
		wait = new Waits(driver);
	}
	
	public void validationPageProducts() {
		
		try {
			
			wait.loadElement(genericPage.getHomeLabelTitle());
			String label = genericPage.getHomeLabelTitle().getText();
			Assertions.assertEquals("PRODUCTS", label);
			Report.log(Status.PASS, "Acessou a Pagina de Produtos", Screenshot.captureBase64(driver));
		
		
		}catch( Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		
		}
		
		
	}
	
	
	public void validationPageCheckout() {
		
		try {
			
			wait.loadElement(genericPage.getHomeLabelTitle());
			String label = genericPage.getHomeLabelTitle().getText();
			Assertions.assertEquals("CHECKOUT: YOUR INFORMATION", label);
			Report.log(Status.PASS, "Acessou a Pagina de Informações", Screenshot.captureBase64(driver));
			
		
		}catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	
	public void validationPageCheckoutOverview() {
		
		try {
			
			wait.loadElement(genericPage.getHomeLabelTitle());
			String label = genericPage.getHomeLabelTitle().getText();
			Assertions.assertEquals("CHECKOUT: OVERVIEW", label);
			Report.log(Status.PASS, "Acessou a Pagina de Listas", Screenshot.captureBase64(driver));
			
		}catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
		
		
	}
	
    public void validationPageFinish() {
    	
    	try {
    		
    		wait.loadElement(genericPage.getHomeLabelTitle());
    		String label = genericPage.getHomeLabelTitle().getText();
    		Assertions.assertEquals("CHECKOUT: COMPLETE", label);
    		Report.log(Status.PASS, "Acessou a Pagina Completa", Screenshot.captureBase64(driver));
    		
    	}catch (Exception e) {
    		Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
    	}
		
		
	}
	
	

}
