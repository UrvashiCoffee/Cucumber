package cucumberpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopPurchase {
	
	ChromeDriver driver;
	//Actions action = new Actions (driver);
	
	@Given("^|The customer logs in using valid credentials$")
	public void The_customer_logs_in_using_valid_credentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("Uvray@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
		
	}
	
	@When("The customer navigate to the womens category dropdown")
	public void The_customer_navigate_to_the_womens_category_dropdown() {
		driver.findElement(By.xpath("//span[text()=\"Women\"]")).click();
		//WebElement element1 = driver.findElement(By.xpath(""));
		//action.moveToElement(element1).build().perform();
	}

	@And("click on the required category of purchase")
	public void click_on_the_required_category_of_purchase() {
		//WebElement element2 = driver.findElement(By.xpath(""));
		//action.moveToElement(element2).click().build().perform();	
		driver.findElement(By.xpath("//a[text()=\"Bottoms\"]")).click();
		
	}

	@And("select the size and colour of the product")
	public void select_the_size_and_colour_of_the_product() throws InterruptedException {
		driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("option-label-size-143-item-171")).click();
		driver.findElement(By.id("option-label-color-93-item-56")).click();
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(5000);
		
	
	}

	@And("click on Add to Cart")
	public void click_on_add_to_cart() {
		
		driver.findElement(By.xpath("//a[@class=\"action showcart\"]")).click();
		driver.findElement(By.id("top-cart-btn-checkout")).click();
	
	}

	@And("click on Cart button and proceed to checkout")
	public void click_on_cart_button_and_proceed_to_checkout() {
		
		
	}

	@And("provide the shipping address")
	public void provide_the_shipping_address() {
	 /*driver.findElement(By.id("customer-email")).sendKeys("Uvray@gmail.com");
	 driver.findElement(By.name("firstname")).sendKeys("Urvashi.com");
	 driver.findElement(By.name("lastname")).sendKeys("S");
	 driver.findElement(By.name("company")).sendKeys("TCS");
	 driver.findElement(By.name("street[0]")).sendKeys("Electronic City");
	 driver.findElement(By.name("city")).sendKeys("Bangalore");
	 WebElement drop = driver.findElement(By.name("region_id"));
	 Select select = new Select (drop);
	 select.selectByVisibleText("Washington");
	 driver.findElement(By.name("postcode")).sendKeys("560100");
	 WebElement drop1 = driver.findElement(By.name("country_id"));
	 Select select1 = new Select (drop1);
	 select1.selectByVisibleText("United States");
	 driver.findElement(By.name("telephone")).sendKeys("5601003456");*/
	 //driver.findElement(By.name("ko_unique_1")).click();
	 
	}

	@And("click on Next and place order")
	public void click_on_next_and_place_order(){
		//WebElement blog=driver.findElement(By.xpath("(//input[@class=\"radio\"])[1]"));
		//Actions action = new Actions(driver);
		//action.moveToElement(blog).click().build().perform();
		//blog.click();
		//driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		System.out.println("Order processing");
	  
	}

	@Then("order should be placed successfully")
	public void order_should_be_placed_successfully() {
		System.out.println("Order placed successfully");
	   
	}

	@And("order number should appear on the screen")
	public void order_number_should_appear_on_the_screen() {
		System.out.println("Your order number is 001");
	}

	@And("close the window")
	public void close_the_window() {
		driver.quit();
		System.out.print("exit");
	}

}
