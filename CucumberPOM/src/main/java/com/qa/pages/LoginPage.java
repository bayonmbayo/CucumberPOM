package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "txtUsername")
	WebElement elUsername;
	
	@FindBy(id = "txtPassword")
	WebElement elPassword;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement elButtonLogin;
	
	@FindBy(xpath = "//div[@id='divLogo']//img")
	WebElement elLogo;
	
	//initializing the page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogin() {
		return elLogo.isDisplayed();	}
	
	public HomePage login(String username, String password) {
		elUsername.sendKeys(username);
		elPassword.sendKeys(password);
		elButtonLogin.click();
		
		return new HomePage();
	}
	
}
