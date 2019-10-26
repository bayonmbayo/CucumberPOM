package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = " //a[@id='welcome']")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//b[contains(text(),'PIM')]")
	WebElement pimLink;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	WebElement addEmployeeLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifiyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public AddEmployeePage clickonAddEmployee() {
		Actions action = new Actions(driver);
		action.moveToElement(pimLink).moveToElement(addEmployeeLink);
		
		return new AddEmployeePage();
	}
	
	
	
	
}
