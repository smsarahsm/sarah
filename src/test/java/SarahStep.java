
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

public class SarahStep {
	
private SarahPagina pagina = new SarahPagina();


@Given("^que entre no site \"([^\"]*)\"$")
public void entrarNoSite throws Throwable 	
pagina.entrarNoSite();
}

@When("^Preencha o formulário Enter Vehicle Data$")
public void preencher enterVehicleData () throws Throwable {
	pagina.enterVehicleData();
}

@When("^Preencha o formulário Enter Insurant Data$")
public void preencher enterInsurantData() throws Throwable{
	pagina.enterInsurantData();
}

@When("^Preencha o formulário Enter Product Data$")
public void preencher enterProductData () throws Throwable {
	pagina.enterProductData();
}

@When("^Preencha o formulário Select Price Option$")
public void preencher selectPriceOption () throws Throwable {
	pagina.selectPriceOption();
}
   
@When("^Preencha o formulário Send Quote$")
public void preencher sendQuote() throws Throwable {
	pagina.sendQuote();
}
 
@Then("^será apresentado em tela a mensagem de validação$")
public void  validarFinalização throws Throwable {
	pagina.obterTexto();
}


}
