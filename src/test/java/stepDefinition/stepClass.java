package stepDefinition;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepClass {
	WebDriver driver;
	
	@Given("^open target application$")
	public void open_target_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.target.com/");
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
	   
	}

	@Then("^type iphone on search button$")
	public void type_iphone_on_search_button() throws Throwable {
	 WebElement m = driver.findElement(By.id("search"));
		
		m.sendKeys("iphone 14 pro max");
	}

	@Then("^click search icon$")
	public void click_search_icon() throws Throwable {
		
		WebElement n = driver.findElement(By.xpath("//button[text()='search']"));
	   n.click();
	   
	
	
	   Thread.sleep(5000);
	   
	}
	@Then("^Verify user can search iphone\\.$")
	public void verify_user_can_search_iphone() throws Throwable {
	    
	boolean tom    =  driver.findElement(By.xpath("//span[text()='Pickup']")).isDisplayed();
		
		Assert.assertTrue(tom);
		
		Thread.sleep(2000);
		driver.close();
		
	}

	@Then("^click catagories$")
	public void click_catagories() throws Throwable {
		
	  WebElement h = driver.findElement(By.linkText("Categories"));
	 h.click();
	  Thread.sleep(1000);
	}

	@Then("^click ready for school$")
	public void click_ready_for_school() throws Throwable {
	  WebElement m = driver.findElement(By.xpath("//span[text()='Ready for School']")) ;
	  m.click();
	  Thread.sleep(2000);
	}

	@Then("^click back to school deal$")
	public void click_back_to_school_deal() throws Throwable {
	  WebElement k  = driver.findElement(By.xpath("//span[text()='Back to School Deals']"));
	  k.click();
	  Thread.sleep(2000);
	  
	  
	}
	
	@Then("^Verify user in back to school deals page$")
	public void verify_user_in_back_to_school_deals_page() throws Throwable {
	    
	boolean tom = driver.findElement(By.xpath("//span[text()='Backpacks']")).isDisplayed();
		Assert.assertTrue(tom);
		Thread.sleep(2000);
		driver.close();
		
	}


	
}
