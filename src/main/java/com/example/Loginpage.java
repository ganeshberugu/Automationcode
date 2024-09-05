package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By txt_username=By.xpath("//input[@type='text']");
	By txt_password=By.id("password");
	By btn_login=By.id("login-button");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterusername (String username) {
		driver.findElement(txt_username).sendKeys(username);;
		
		
	}
	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);;
	}
	public void clicklogin() {
		driver.findElement(btn_login).click();;
	}
	}

