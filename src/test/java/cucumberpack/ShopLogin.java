package cucumberpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopLogin {
	
			ChromeDriver driver;
			@Given("^|I want to login into the login page using my credentials$")
			public void I_want_to_login_into_the_login_page_using_my_credentials() {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			
		@And("^|use the account for shoppings$")
		public void use_the_account_for_shoppings() {
		driver.get("https://magento.softwaretestingboard.com/");
		}
		
		@When("^|I click on SignIn$")
		public void I_click_on_SignIn() {
			driver.findElement(By.linkText("Sign In")).click();
		}
			
		@And("^|Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
		public void Enter_username_as_and_password_as(String username,String password) { 
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		}
		@And("^|Click on Sign In button$")
		public void Click_on_Sign_In_button() {
		driver.findElement(By.xpath("//span[text()=\"Sign In\"]")).click();
		}
		@Then("^|Login should be successful with login ststus as \"([^\"]*)\"$")
		public void Login_should_be_successful(String login_status) {
			System.out.println(login_status);
			//String str4 = driver.findElement(By.xpath("//span[@class=\"logged-in\"]")).getText();
			//System.out.println(str4);
		}
		
		@And("^|I exit the pages$")
		public void I_exit_the_pages() {
		driver.quit();
		System.out.print("exit");
		}

}
