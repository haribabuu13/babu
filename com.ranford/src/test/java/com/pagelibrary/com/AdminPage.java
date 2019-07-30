package com.pagelibrary.com;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.qtpselenium.base.TestBase;
//Hrllo HI
public class AdminPage extends TestBase {
	public static WebElement branches_Image() throws IOException{
		return driver.findElement(getElement("branches"));
	}
	public static WebElement roles_Image() throws IOException{
		return driver.findElement(getElement("roles"));
	}
	public static WebElement users_Image() throws IOException{
		return driver.findElement(getElement("users"));
	}
	public static WebElement employee_Image() throws IOException{
		return driver.findElement(getElement("employee"));
	}
}
