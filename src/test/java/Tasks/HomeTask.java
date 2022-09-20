package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import validations.GenericValidation;
import validations.LoginValidation;
import Tasks.HomeTask;

public class HomeTask {
	
	private WebDriver driver;
	
	private HomePage homepage;
	private LoginValidation loginValidation;
	private GenericValidation genericValidation;
	
	public void HomeTask(WebDriver driver) {
		this.driver = driver;
		homepage = new HomePage(this.driver);
		loginValidation = new LoginValidation(driver);
		genericValidation = new GenericValidation(driver);
		
	}
	
	public void CriarUsuarioNovoParametrizado(String nome, String UltimoNome) {
		
		loginValidation.validationLoginPage();
		homepage.getUserNameTextField().sendKeys(nome);
		homepage.getUltimoNomeTextField().sendKeys(UltimoNome);
		homepage.getcriarbutton().click();
		genericValidation.validationPageProducts();
		
		
	}

	
	}

	
		
	



