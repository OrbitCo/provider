package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.project.basetest.BaseTest;
import com.testng.framework.Browser;
import com.testng.pages.Pages;

import java.util.List;

public class HomePage extends Pages{

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	@FindBy(linkText = "Sign in with One Healthcare ID")
	private WebElement logInBtn;

	@FindBy(id="userNameId_input")
	private WebElement userName;

	@FindBy(id = "passwdId_input")
	private WebElement passwordFiled;

	@FindBy(id = "SignIn")
	private WebElement logInFormBtn;

	@FindBy(xpath = "//*[@data-test-id='topnav-logo']")
	private WebElement logInNav;

	



	public HomePage fillSignForm(String a, String  b){

		waitForElementToLoad(userName);


		enterValue(userName,a,"UserName");
		enterValue(passwordFiled,b,"Password");
		return this;
	}

	public HomePage clickOnLogInButton(){
		waitForElementToLoad(logInBtn);
		//captureScreen("Home page");
		clickOnElement(logInBtn,"Log In");
		return this; }


	public HomePage clickOnSignLink(){
		clickOnElement(logInFormBtn,"log in");
	waitForElementToLoad(logInNav);
		return this;

	}


}
