package TestCases;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.HomePage;
import Tasks.CheckoutTask;
import Tasks.HomeTask;
import framework.TestBase;
import framework.Report.Report;
import framework.Report.ReportType;
import framework.Report.Screenshot;

public class CriarNovoUsuáriocomsucesso extends TestBase{
	
	private WebDriver driver = this.getDriver();
	
	HomeTask homeTask = new HomeTask();
	CriarNovoUsuáriocomsucesso criarNovoUsuario = new CriarNovoUsuáriocomsucesso();
	
	CheckoutTask checkoutTask = new CheckoutTask(driver);
	
	
	
	

	@Test
	@Tag("regressao")
        

			
	public void CriarNovoUsuario(String Nome, String UltimoNome) {
		
		try {
				
				Report.createTest("Criar Novo Usuario Novo", ReportType.GROUP);
				Report.createStep("Login");
				homeTask.CriarUsuarioNovoParametrizado(Nome, UltimoNome);
				Report.createStep("Comprar Produto");
				checkoutTask.preencherForm();
				Report.createStep("Finalizar Compra");
				
			}catch (Exception e) {
				
				Report.log(Status.FAIL,e.getMessage(), Screenshot.capture(driver));
		    
		   }

			
		}
				
		
	}
	

	
	


