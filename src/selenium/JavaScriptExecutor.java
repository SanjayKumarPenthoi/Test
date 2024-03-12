package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		JavascriptExecutor jse=(JavascriptExecutor)obj;
		jse.executeScript("arguments[0].click()", obj.findElement(By.name("Submit")));
		WebElement test=obj.findElement(By.linkText("Logout"));
		JavascriptExecutor je=(JavascriptExecutor)obj;
		je.executeScript("arguments[0].click()",test);
		obj.quit();
	}
}
