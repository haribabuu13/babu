package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkChecker {

public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.gcrit.com/build3/admin/login.php");
String displaystatus=driver.findElement(By.name("username")).getAttribute("type");
System.out.println(displaystatus);
driver.findElement(By.name("username")).sendKeys("Hari");
driver.findElement(By.name("username")).clear();
}
}

