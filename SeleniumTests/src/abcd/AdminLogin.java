package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {

public static void main(String[] args) {
	
// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver","‪C:\\Users\\Hari\\Downloads\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://www.gcrit.com/build3/admin/");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();
String url=driver.getCurrentUrl();
System.out.print(url);
if(url.equals("http://www.gcrit.com/build3/admin/index.php")==true) {
	System.out.print("Admin login Succesful-passed");
}
else {
	System.out.print("Admin login unSuccesful-failed");
}

	driver.close();



	}

}
