package com.qa.stepdefinitions;


import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
	   initialization();
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page() {
	   loginPage = new LoginPage();
	   String title = loginPage.validateLoginPageTitle();
	   Assert.assertEquals(title, "OrangeHRM");
	}

	@Then("^user logs into app$")
	public void user_enters_username_and_password() {
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() {
		String homeTitle = homePage.verifiyHomePageTitle();
	    Assert.assertEquals(homeTitle, "OrangeHRM");
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() {
	    boolean usernameisDisplayed = homePage.verifyCorrectUserName();
	    Assert.assertTrue(usernameisDisplayed);
	}
	
	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
	    TestBase.driver.quit();
	}
	
	
}
