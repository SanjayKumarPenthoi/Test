package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		obj.findElement(By.name("Submit")).click();
		Actions test=new Actions(obj);
		test.moveToElement(obj.findElement(By.linkText("PIM"))).perform();
		obj.findElement(By.linkText("Add Employee")).click();
		obj.findElement(By.linkText("Logout")).click();
		obj.quit();
	}
}
