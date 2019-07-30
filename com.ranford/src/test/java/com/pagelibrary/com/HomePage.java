package com.pagelibrary.com;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.qtpselenium.base.TestBase;

public class HomePage extends TestBase {
	public static WebElement username_Editbox() throws IOException{
		return driver.findElement(getElement("username"));
		
	}
	public static WebElement password_Editbox() throws IOException{
		return driver.findElement(getElement("password"));
		
	}
	public static WebElement login_Btn() throws IOException{
		return driver.findElement(getElement("login"));
		
	}
}
