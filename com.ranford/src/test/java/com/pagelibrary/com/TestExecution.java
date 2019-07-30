package com.pagelibrary.com;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestExecution extends Repository{
			
	@Test(priority=0)
	public void verify_launch() throws IOException
	{
		launch_tc();
	}
	
	@Test(priority=1)
	public void verify_login()
	{
		login_tc();
	}
	@Test(priority=2)
	public void verify_Branches()
	{
		branch_tc();
	}
	
	}


