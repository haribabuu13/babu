package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","‪C:/Users/Hari/Downloads/chromedriver_win32/hromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/");
		String actUrl=driver.getCurrentUrl();
		System.out.println(actUrl);
		String title=driver.getTitle();
		System.out.println(title);	
	
	}
}
