package com.MasterPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryMas {

	public  PageFactoryMas(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//*[contains(text(), 'Sign in')]")
	 private WebElement SignIn;
	
	@FindBy(xpath="(//*[contains(@id,'email')])[2]")
	private WebElement Email;
	
	@FindBy(xpath="//*[contains(@name,'passwd')]")
	private WebElement Passwd;
	
	@FindBy(xpath="//*[contains(@name,'SubmitLogin')]")
	private WebElement Submit;	
	
	@FindBy(xpath="//*[contains(@class,'logout')]")
	private WebElement signOut;
	
	
	public WebElement getSignIn() {
		return SignIn;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPasswd() {
		return Passwd;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getSignOut() {
		return signOut;
	}
	 
}
