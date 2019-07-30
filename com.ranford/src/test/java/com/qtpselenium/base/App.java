package com.qtpselenium.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class App extends TestBase {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
driver.findElement(getElement("username"));
driver.findElement(getElement("password"));
driver.findElement(getElement("login"));

	}

}
