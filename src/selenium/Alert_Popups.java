package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert_Popups{
	public static void main(String args[]) {
		WebDriver obj=new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		obj.findElement(By.name("Submit")).click();
		Alert test=obj.switchTo().alert();
		String al=test.getText();
		System.out.println(al);
		test.accept();
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("Submit")).click();
		System.out.println(test.getText());
		test.accept();
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		obj.findElement(By.name("Submit")).click();
		obj.findElement(By.linkText("Logout")).click();
		obj.quit();
//		String al=obj.switchTo().alert().getText();
//		System.out.println(al);
//		obj.switchTo().alert().accept();
//		obj.quit();
	}
}
