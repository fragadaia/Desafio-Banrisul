package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;
import validations.CheckoutValidation;
import validations.GenericValidation;
import framework.Utils.FakersGeneration;

public class CheckoutTask {
	
	private WebDriver driver;
	private CheckoutPage checkoutPage;
	private FakersGeneration fakers;
	private GenericValidation genericValidation;
	private CheckoutValidation checkoutValidation;
	
	public CheckoutTask(WebDriver driver) {
		
		this.driver = driver;
		checkoutPage = new CheckoutPage(driver);
		fakers = new FakersGeneration(driver);
		genericValidation = new GenericValidation(driver);
		checkoutValidation = new CheckoutValidation(driver);
	}
	
	public void preencherForm() {
		
		checkoutPage.getUserNameTextField().sendKeys(fakers.getFirstName());
		checkoutPage.getUltimoNomeTextField().sendKeys(fakers.getLastName());
		checkoutValidation.validaForm();
		checkoutPage.getcriarbutton().click();
		genericValidation.validationPageCheckoutOverview();
		checkoutPage.getvoltarbutton().click();
	}

}
