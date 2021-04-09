
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SarahPagina extends SarahElement{

    public SarahPagina(WebDriver driver) {
	}

	private WebDriver driver;
    

	public void entrarNoSite() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
			
	public void enterVehicleData() {
		selecionarCombo("make", "Audi");
		selecionarCombo("model","Scooter");
		escrever("cylindercapacity","4");
		escrever("engineperformance","44");
		escrever("dateofmanufacture","01/02/2020"); 
		selecionarCombo("numberofseats", "3");
		selecionarCombo("numberofseatsmotorcycle","3");
		escrever("payload","4"); 
		escrever("totalweight","400");
		selecionarCombo("fuel", "Petrol"); 
		escrever("listprice","3000"); 
		escrever("annualmileage","500");
		clicarBotao("nextenterinsurantdata");
		
	}
	
	public void enterInsurantData() {
		escrever("firstname", "Sarah");
		escrever("lastname", "Silva");
		escrever("birthdate", "04/07/1999");
		selecionarCombo("country", "Andorra"); 
		escrever("zipcode", "9865");
		selecionarCombo("occupation","Farmer"); 
		clicarRadio("speeding");
		clicarBotao("nextenterproductdata");
		
	}
	
	public void enterProductData() {
		escrever("startdate", "26/05/2021");
		selecionarCombo("insurancesum", "3.000.000,00"); 
		selecionarCombo("meritrating", "Bonus 1");
		selecionarCombo("damageinsurance", "No Coverage"); 
		clicarRadio("EuroProtection");
		selecionarCombo("courtesycar", "No"); 
		clicarBotao("nextselectpriceoption");
		
	}

	public void selectPriceOption() {
		clicarBotao("selectsilver");
		clicarBotao("nextselectpriceoption");
		
	}
	   
	public void sendQuote() {
		escrever("email", "email@testes.com.br");
		escrever("Username", "Testes");
		escrever ("Password", "12345@Lm");
		escrever("startdate", "12345@Lm");
		clicarBotao("Confirm Password");
		clicarBotao("sendemail");
		
		
		
	}
	 
	public void obterTexto() {
		Assert.assertTrue(driver.findElement(By.cssSelector("sweet-alert showSweetAlert visible")).getText().startsWith("Sending e-mail success!"));
		
	}
		


	
	
	
	
	
	
	
	public void escrever(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	public String ObterValorCampo(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public void clicarRadio(String id_campo) {
		driver.findElement(By.id(id_campo)).isSelected();
	}
	
	public boolean isRadioMarcado(String id_campo) {
		return driver.findElement(By.id(id_campo)).isSelected();
	}
	
	public void selecionarCombo(String id_campo, String valor) {
		WebElement element = driver.findElement(By.id(id_campo));
		driver.findElement(By.id(id_campo)).isSelected();
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void clicarBotao(String id_campo) {
		driver.findElement(By.id(id_campo)).click();
	}	
		
	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}	
	
	
}

