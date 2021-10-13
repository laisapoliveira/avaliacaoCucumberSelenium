package formValidationJunit;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.JavascriptExecutor;

public class Validation {
	private WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.edge.driver", "drivers/edgedriver/msedgedriver.exe");
		driver = new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
//		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
//		driver.quit();
	}

	@Test
	public void formTest() throws InterruptedException {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	    driver.manage().window().setSize(new Dimension(1294, 1040));
	    driver.findElement(By.id("nav_automobile")).click();
	    driver.findElement(By.id("make")).click();
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
	    driver.findElement(By.id("nextenterinsurantdata")).click();
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
	    driver.findElement(By.id("nextenterproductdata")).click();
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
	    driver.findElement(By.id("nextselectpriceoption")).click();
	    driver.findElement(By.cssSelector(".choosePrice:nth-child(4) > .ideal-radio")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("nextsendquote")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("email@email.com");
	    driver.findElement(By.id("username")).sendKeys("lalah1");
	    driver.findElement(By.id("password")).sendKeys("HSm123");
	    driver.findElement(By.id("confirmpassword")).sendKeys("HSm123");
	    driver.findElement(By.id("sendemail")).click();
	    new WebDriverWait(driver, 60).until(ExpectedConditions.textToBe(By.cssSelector("h2"), "Sending e-mail success!"));
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".confirm")).click();
	}
}
