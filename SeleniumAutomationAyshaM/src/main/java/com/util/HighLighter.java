package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {

	public static void addcolor(WebDriver driver, WebElement element){
		
		
		JavascriptExecutor obj = (JavascriptExecutor) driver; //type casting

		obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: white; border: 2px solid red;");

	}
}
