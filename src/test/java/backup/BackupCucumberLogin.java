/*package backup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackupCucumberLogin {
	
			ChromeDriver driver;
			@Given("^|I want to login into the login page using my credentials$")
			public void I_want_to_login_into_the_login_page_using_my_credentials() {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			
		@And("^|use the account for shopping$")
		public void use_the_account_for_shopping() {
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		}
		@When("^|I click on Login$")
		public void I_click_on_Login() {
			driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		}
		@And("^|Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
		public void Enter_username_as_and_password_as(String username,String password) { 
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		}
		@And("^|Click login button$")
		public void Click_login_button() {
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		}
		@Then("^|Login should be successful with login ststus as \"([^\"]*)\"$")
		public void Login_should_be_successful() {
			System.out.println("Login should be successful");
		}
		@And("^|I exit the page$")
		public void I_exit_the_page() {
		System.out.print("exit");
		}

	}

*/