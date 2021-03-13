package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class PracticeAutomation {
	
	
	public static void main(String []args) throws InterruptedException {

	
   System.setProperty("webdriver.chrome.driver",
		"/Users/anarganbarov/Documents/SeleniumFiles/BrowserDriver/chromedriver-2");

     WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 

     driver.get("https://www.americanexpress.com/us/business/business-funding/business-loans/?linknav=US-Acq-GCS-NonCard-PaymentHub-SubNav-FinancingSolutions-BusinessLoans");
     JavascriptExecutor js= (JavascriptExecutor) driver;

    js.executeScript("window.scrollBy(0,2200)");
    Thread.sleep(3000);
	 WebElement el = driver.findElement(By.id("labelId"));
	// js.executeScript("arguments[0].click();", el);
	el.click();
	el.sendKeys("5000" + Keys.ENTER);
	 Thread.sleep(3000);

	 
	// js.executeScript("arguments[0].click();", driver.findElement(By.id("")));
	  WebElement findElement = driver.findElement(By.xpath("//select[@data-qe-id='dropdown-select']"));
	 

	 Select select = new Select(findElement);

	 select.selectByValue("751-800 (Very Good)");
	 Thread.sleep(5000);
	  WebElement findElement2 = driver.findElement(By.xpath("//span[@s='sanitize']"));
	  findElement2.getText();
	//String actual = findElements.get(0).getText();
	System.out.println(findElement2);
   }

}