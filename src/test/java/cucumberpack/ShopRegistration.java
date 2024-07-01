package cucumberpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopRegistration {

		ChromeDriver driver;
		@Given("^|I want to create an account for a new customer$")
		public void I_want_to_create_an_account_for_a_new_customer() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	@And("^|use the account for shopping$")
	public void use_the_account_for_shopping() {
	driver.get("https://magento.softwaretestingboard.com/");
	}
	
	@When("^|I click on Sign In$")
	public void I_click_on_Sign_In() {
		driver.findElement(By.linkText("Sign In")).click();
	}
	
	@And("^|I click on Create Account$")
	public void I_click_on_Create_Account(){ 
	driver.findElement(By.xpath("//span[text()=\"Create an Account\"]")).click();
	}
	
	@And("^|I want to enter firstname and lastname$")
	public void I_want_to_enter_firstname_and_lastname() {
	driver.findElement(By.id("firstname")).sendKeys("Urvas");
	driver.findElement(By.id("lastname")).sendKeys("Ss");
	}
	
	@And("^|I want to give my email and password$")
	public void I_want_to_give_my_email_and_password() {
	driver.findElement(By.id("email_address")).sendKeys("Uvrays123@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Seleniums@12345");
	driver.findElement(By.name("password_confirmation")).sendKeys("Seleniums@12345");
	}
	
	
	@And("^|I click on Create an Account$")
	public void I_click_on_Create_an_Account() {
	driver.findElement(By.xpath("//span[text()=\"Create an Account\"]")).click();
	}
	
	@Then("^|I should have a new account created$")
	public void I_should_have_a_new_account_created() {
	System.out.println("Account created successfully");
	}
	
	@And("^|it should show My Account Page on the screen$")
	public void it_should_show_My_Account_Page_on_the_screen() {
	String var=driver.findElement(By.xpath("//div[text()=\"Thank you for registering with Main Website Store.\"]")).getText();
	System.out.println(var);
	String str=driver.findElement(By.xpath("//span[@class=\"base\"]")).getText();
	System.out.println(str);
	String str1=driver.findElement(By.linkText("Account Information")).getText();
	System.out.println(str1);
	String str2=driver.findElement(By.xpath("//span[text()=\"Contact Information\"]")).getText();
	System.out.println(str2);
	String str3=driver.findElement(By.xpath("(//div[@class=\"box-content\"])[1]")).getText();
	System.out.println(str3);
	
	//(//div[@class="block block-dashboard-info"])[1]
	}
	
}

