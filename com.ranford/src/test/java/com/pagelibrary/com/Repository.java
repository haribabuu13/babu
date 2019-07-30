package com.pagelibrary.com;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



import com.qtpselenium.base.TestBase;

public abstract class Repository extends TestBase{
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
		public void create_fol_report()
	{
		File f=new File("./ExtentReport");		
		if(!f.exists())
		{
			f.mkdir();
		}
			Date d=new Date();
			String fileName=d.toString().replace(":", "_").replace(" ", "_")+".html";
			report=new ExtentReports("./ExtentReport/"+fileName,true);
	}		
	
	@BeforeMethod
	public void Send_Method_To_report(Method method)
	{
		logger=report.startTest((this.getClass().getSimpleName()+" : :"+method.getName()));
		logger.assignCategory("Regression");
		logger.assignAuthor("Hari");
		report.addSystemInfo("Selenium Version", "2.53.0").addSystemInfo(
				"Environment", "QA");
		logger.addScreenCapture("./sc.JPG");
	}
	
	@AfterMethod
	
	
	public void save_report()
	{
		report.flush();
	}
	
	public void launch_tc() throws IOException{
		switch(getConfig("browser")){
		
		case "chrome":
			//System.setProperty("chromedrivername",getConfig("chromedriverpath"));
			driver=new ChromeDriver();
			break;
		case "mozilla":
			System.setProperty("firefoxdrivername",getConfig("firefoxdriverpath"));
			driver=new FirefoxDriver();
			break;
		}
		
		driver.get(getConfig("build1"));
		driver.manage().window().maximize();
		   String actualUrl=driver.getCurrentUrl();
		   String expurl=getConfig("build1");
		   if(actualUrl.contains(expurl))
		   {
			   logger.log(LogStatus.PASS, "my expUrl :- "+expurl+" is matching with an actualURL :- "+actualUrl);
			   logger.log(LogStatus.INFO, "Launch is done successfully");
		   }
		   else
		   {
			   logger.log(LogStatus.FAIL, "my expUrl :- "+expurl+" is not matching with an actualURL :- "+actualUrl);
			   logger.log(LogStatus.INFO, "Launch is failed");
			   
			   logger.log(LogStatus.INFO, "taken the screenshort it is screenshort folder");
		   }
		
	}

	public void login_tc() {
		try {
		HomePage.username_Editbox().sendKeys(getConfig("username"));
		HomePage.password_Editbox().sendKeys(getConfig("password"));

		HomePage.login_Btn().click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	public void branch_tc(){
		
		try {
			AdminPage.branches_Image().click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public void roles_tc(){
		
		try {
			AdminPage.roles_Image().click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public void user_tc(){
		
		try {
			AdminPage.branches_Image().click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public void Employee_Tc(){
		
		try {
			AdminPage.branches_Image().click();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
