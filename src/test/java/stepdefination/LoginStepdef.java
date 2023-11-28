package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdef {
ChromeDriver driver;
	
	@Given("openbrowser and enter url")
	public void openbrowser_and_enter_url() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("user enter username")
	public void user_enter_username() {
		driver.findElement(By.id("username")).sendKeys("student");
	}
	@And("Enter password")
	public void Enter_password() {
		driver.findElement(By.id("password")).sendKeys("Password123");
	}
	  @When("userClick on LoginBtn")
	  public void userClick_on_LoginBtn() {
		  driver.findElement(By.id("submit")).click();
	  }
	  
	  @Then("UserShould Naviagate to Dashboard page")
	  public void UserShould_Naviagate_to_Dashboard_page() {
		 String actualvalue= driver.findElement(By.tagName("h1")).getText();
		  Assert.assertEquals("not matched", "Logged In Successfully",actualvalue );
	  }
	  
	  
	  
	  @When("user enter invalid username")
	  public void user_enter_invalid_username() {
		  driver.findElement(By.id("username")).sendKeys("sfdbfgbtudent");
	  }

	  @When("User Enter invalid password")
	  public void user_enter_invalid_password() {
		  driver.findElement(By.id("password")).sendKeys("Pdsvfregassword123");
	  }

	  @When("Click on LoginBtn")
	  public void click_on_login_btn() {
		  driver.findElement(By.id("submit")).click();
	        }

	  @Then("it should through error as usernameand password is invalid")
	  public void it_should_through_error_as_usernameand_password_is_invalid() throws InterruptedException {
	 Thread.sleep(2000);
		  String actualerror= driver.findElement(By.id("error")).getText();
		  String expectederror="Your username and password is invalid!";
		  Assert.assertEquals("data is mismatched", expectederror, actualerror);
		  
		  
	    }

	  @Then("close browser")
	  public void close_browser() {
		  driver.close();
	        }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
