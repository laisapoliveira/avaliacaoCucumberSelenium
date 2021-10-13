package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormSteps {
	private static WebDriver driver;
	JavascriptExecutor js;

	public void setUp() {
		System.setProperty("webdriver.edge.driver", "drivers/edgedriver/msedgedriver.exe");
		driver = new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
//		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@Given("^que eu queira realizar uma simulacao de um seguro veicular$")
	public void que_eu_queira_realizar_uma_simulacao_de_um_seguro_veicular() throws Throwable {
		setUp();
	}

	@When("^eu entrar no site$")
	public void eu_entrar_no_site() throws Throwable {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().setSize(new Dimension(1294, 1040));
	}

	@When("^clicar na aba automobile$")
	public void clicar_na_aba_automobile() throws Throwable {
		driver.findElement(By.id("nav_automobile")).click();
	}

	@Then("^o site deve ser direcionado para o formulario de seguro de automovel$")
	public void o_site_deve_ser_direcionado_para_o_formulario_de_seguro_de_automovel() throws Throwable {
		new WebDriverWait(driver, 60)
				.until(ExpectedConditions.textToBe(By.id("selectedinsurance"), "Automobile Insurance"));
	}

	@Given("^que eu queira preencher a aba Enter Vehicle Data$")
	public void que_eu_queira_preencher_a_aba_Enter_Vehicle_Data() throws Throwable {
		Thread.sleep(300);
	}

	@When("^preencher os campos$")
	public void preencher_os_campos() throws Throwable {
		{
			WebElement dropdown = driver.findElement(By.id("make"));
			dropdown.findElement(By.xpath("//option[. = 'BMW']")).click();
		}
		driver.findElement(By.id("engineperformance")).click();
		driver.findElement(By.id("engineperformance")).sendKeys("300");
		driver.findElement(By.id("opendateofmanufacturecalender")).click();
		{
			WebElement element = driver.findElement(By.id("opendateofmanufacturecalender"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.linkText("12")).click();
		driver.findElement(By.id("numberofseats")).click();
		{
			WebElement dropdown = driver.findElement(By.id("numberofseats"));
			dropdown.findElement(By.xpath("//option[. = '2']")).click();
		}
		driver.findElement(By.id("fuel")).click();
		{
			WebElement dropdown = driver.findElement(By.id("fuel"));
			dropdown.findElement(By.xpath("//option[. = 'Gas']")).click();
		}
		driver.findElement(By.id("listprice")).click();
		driver.findElement(By.id("listprice")).sendKeys("32000");
		driver.findElement(By.id("licenseplatenumber")).click();
		driver.findElement(By.id("licenseplatenumber")).sendKeys("123");
		driver.findElement(By.id("annualmileage")).click();
		driver.findElement(By.id("annualmileage")).sendKeys("300");
	}

	@Then("^o site deve validar todos os campos como checked e deve clicar em next para direcionar para a proxima aba$")
	public void o_site_deve_validar_todos_os_campos_como_checked_e_deve_clicar_em_next_para_direcionar_para_a_proxima_aba()
			throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"entervehicledata\"]/span"), "0"));
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
	
	@Given("^que eu queira preencher a aba Enter Insurant Data$")
	public void que_eu_queira_preencher_a_aba_Enter_Insurant_Data() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"enterinsurantdata\"]/span"), "7"));
	}

	@When("^preencher os campos na aba Enter Insurant Data$")
	public void preencher_os_campos_na_aba_Enter_Insurant_Data() throws Throwable {
		driver.findElement(By.id("firstname")).click();
	    driver.findElement(By.id("firstname")).sendKeys("Lais");
	    driver.findElement(By.id("lastname")).sendKeys("Oliveira");
	    driver.findElement(By.id("birthdate")).click();
	    driver.findElement(By.id("birthdate")).sendKeys("03/01/1996");
	    driver.findElement(By.cssSelector(".idealsteps-step:nth-child(2)")).click();
	    driver.findElement(By.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(2) > .ideal-radio")).click();
	    driver.findElement(By.id("streetaddress")).click();
	    driver.findElement(By.id("country")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("country"));
	      dropdown.findElement(By.xpath("//option[. = 'Brazil']")).click();
	    }
	    driver.findElement(By.id("zipcode")).click();
	    driver.findElement(By.id("zipcode")).sendKeys("3023000");
	    driver.findElement(By.id("occupation")).click();
	    {
	      WebElement element = driver.findElement(By.id("occupation"));
	      Actions builder = new Actions(driver);
	      builder.doubleClick(element).perform();
	    }
	    {
	      WebElement dropdown = driver.findElement(By.id("occupation"));
	      dropdown.findElement(By.xpath("//option[. = 'Employee']")).click();
	    }
	    driver.findElement(By.cssSelector(".field:nth-child(10) .ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
	    driver.findElement(By.cssSelector(".valid .ideal-radiocheck-label:nth-child(2) > .ideal-check")).click();
	    driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check")).click();
	}

	@Then("^o site deve validar todos os campos da aba Enter Insurant Data como checked e deve clicar em next para direcionar para a proxima aba$")
	public void o_site_deve_validar_todos_os_campos_da_aba_Enter_Insurant_Data_como_checked_e_deve_clicar_em_next_para_direcionar_para_a_proxima_aba() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"enterinsurantdata\"]/span"), "0"));
		driver.findElement(By.id("nextenterproductdata")).click();
	}
	
	@Given("^que eu queira preencher a aba Enter Product Data$")
	public void que_eu_queira_preencher_a_aba_Enter_Product_Data() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"enterproductdata\"]/span"), "6"));
	}

	@When("^preencher os campos na aba Enter Product Data$")
	public void preencher_os_campos_na_aba_Enter_Product_Data() throws Throwable {
		driver.findElement(By.id("startdate")).click();
	    driver.findElement(By.id("startdate")).sendKeys("12/12/2021");
	    driver.findElement(By.id("insurancesum")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("insurancesum"));
	      Thread.sleep(300);
	      dropdown.findElement(By.xpath("//*[@id=\"insurancesum\"]/option[3]")).click();
	    }
	    driver.findElement(By.id("meritrating")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("meritrating"));
	      dropdown.findElement(By.xpath("//option[. = 'Bonus 7']")).click();
	    }
	    driver.findElement(By.id("damageinsurance")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("damageinsurance"));
	      dropdown.findElement(By.xpath("//option[. = 'Full Coverage']")).click();
	    }
	    driver.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
	    driver.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(2) > .ideal-check")).click();
	    driver.findElement(By.id("courtesycar")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("courtesycar"));
	      Thread.sleep(300);
	      dropdown.findElement(By.xpath("//*[@id=\"courtesycar\"]/option[3]")).click();
	    }
	}

	@Then("^o site deve validar todos os campos da aba Enter Product Data como checked e deve clicar em next para direcionar para a proxima aba$")
	public void o_site_deve_validar_todos_os_campos_da_aba_Enter_Product_Data_como_checked_e_deve_clicar_em_next_para_direcionar_para_a_proxima_aba() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"enterproductdata\"]/span"), "0"));
		driver.findElement(By.id("nextselectpriceoption")).click();
	}
	
	@Given("^que eu queira preencher a aba Select Price Option$")
	public void que_eu_queira_preencher_a_aba_Select_Price_Option() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"selectpriceoption\"]/span"), "1"));
	}

	@When("^selecionar a opcao ultimate$")
	public void selecionar_a_opcao_ultimate() throws Throwable {
		driver.findElement(By.cssSelector(".choosePrice:nth-child(4) > .ideal-radio")).click();
	}

	@Then("^o site deve validar a aba Select Price Option e deve clicar em next para direcionar para a proxima aba$")
	public void o_site_deve_validar_a_aba_Select_Price_Option_e_deve_clicar_em_next_para_direcionar_para_a_proxima_aba() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"selectpriceoption\"]/span"), "0"));
		Thread.sleep(1000);
		driver.findElement(By.id("nextsendquote")).click();
	}
	
	@Given("^que eu queira preencher a aba Send Quote$")
	public void que_eu_queira_preencher_a_aba_Send_Quote() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"sendquote\"]/span"), "4"));
	}

	@When("^preencher os campos na aba Send Quote$")
	public void preencher_os_campos_na_aba_Send_Quote() throws Throwable {
		driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("email@email.com");
	    driver.findElement(By.id("username")).sendKeys("lalah1");
	    driver.findElement(By.id("password")).sendKeys("HSm123");
	    driver.findElement(By.id("confirmpassword")).sendKeys("HSm123");
	}

	@Then("^o site deve validar a aba Send Quote e deve exibir uma mensagem de sucesso ao finalizar a operacao$")
	public void o_site_deve_validar_a_aba_Send_Quote_e_deve_exibir_uma_mensagem_de_sucesso_ao_finalizar_a_operacao() throws Throwable {
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"sendquote\"]/span"), "0"));
		driver.findElement(By.id("sendemail")).click();
		new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.cssSelector("h2"), "Sending e-mail success!"));
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".confirm")).click();
	}
}
