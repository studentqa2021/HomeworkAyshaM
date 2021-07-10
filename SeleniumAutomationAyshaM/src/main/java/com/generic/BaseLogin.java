package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MasterPageFactory.PageFactoryMas;
import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShots;

public class BaseLogin {
	public static void getLogin() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // up casting. getting help from the class its call Up casting
		// driver.get();
		driver.navigate().to(BaseConfig.getConfigFile("URL"));
		driver.manage().window().maximize();
		PageFactoryMas obj = new PageFactoryMas(driver);

		ScreenShots.getpics(driver, "Before Signin");
		HighLighter.addcolor(driver, obj.getSignIn());
		obj.getSignIn().click();

		HighLighter.addcolor(driver, obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getConfigFile("username"));

		HighLighter.addcolor(driver, obj.getPasswd());
		obj.getPasswd().sendKeys(BaseConfig.getConfigFile("password"));

		HighLighter.addcolor(driver, obj.getSubmit());
		obj.getSubmit().click();

		ScreenShots.getpics(driver, "Before signout");
		HighLighter.addcolor(driver, obj.getSignOut());
		obj.getSignOut().click();

	}
}
