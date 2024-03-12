package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatement {
	public static void main(String[] args) {
		WebDriver obj=new ChromeDriver();
		obj.get("http://183.82.103.245/nareshit/login.php");
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		WebDriverWait test=new WebDriverWait(obj, Duration.ofSeconds(15));
		test.until(ExpectedConditions.elementToBeClickable(obj.findElement(By.name("Submit"))));
		obj.findElement(By.name("Submit")).click();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.findElement(By.linkText("Logout")).click();
		obj.quit();
	}

}
