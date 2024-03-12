package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_try {
	public static void main(String args[]) throws Exception {
		WebDriver obj = new ChromeDriver();
		obj.get("http://183.82.103.245/nareshit/login.php");
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("Submit")).click();
		String test = obj.switchTo().alert().getText();
		obj.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(test);
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		obj.findElement(By.name("Submit")).click();
		int count = obj.findElements(By.tagName("a")).size();
		System.out.println(count);
		List<WebElement> list=obj.findElements(By.tagName("a"));
		for(WebElement li:list) {
			System.out.println(li.getText());
		}
		obj.quit();
	}
}
