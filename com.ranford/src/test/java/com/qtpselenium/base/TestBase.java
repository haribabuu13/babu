package com.qtpselenium.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBase{
public static WebDriver driver;
public static Properties property;
public static void loadProperty() throws IOException{
	
	File f =new File("./src/test/java/com/qtpselenium/config/OR.properties");
	FileReader fr=new FileReader(f);
	property =new Properties();
	property.load(fr);

}
public static By getElement(String key) throws IOException{
	loadProperty();
	By loc=null;
	String value=property.getProperty(key);
	String locType=value.split(":")[0];
	String locValue=value.split(":")[1];
switch(locType){
case "id":
	loc=By.id(locValue);
	break;
case "name":
	loc=By.name(locValue);
	break;
case "xpath":
	loc=By.xpath(locValue);
	break;
	}
	return loc;
}

public static void loadPropertyConfig() throws IOException{
	
	File f =new File("./src/test/java/com/qtpselenium/config/config.properties");
	FileReader fr=new FileReader(f);
	property =new Properties();
	property.load(fr);

}

public static String getConfig(String key) throws IOException{
	loadPropertyConfig();
	String value=property.getProperty(key);
	return value;
}


}