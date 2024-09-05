package com.example.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class LoginStepDefinitions {
Loginpage pom;
WebDriver driver;
	@Given("go to swag labs")
	public void go_to_swag_labs() {
		driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");	   
	}

	@Given("enter the {string} and {string}")
	
	public void enter_the_and(String username, String password) {
		pom =new Loginpage(driver);
		pom.enterusername(username);
		pom.enterpassword(password);
	    
	}

	@Then("click on enter")
	public void click_on_enter() throws InterruptedException {
		Thread.sleep(1000);

	    pom.clicklogin();
	}



}
