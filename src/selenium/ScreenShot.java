package selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot {
	public static void main(String[] args) throws Exception {
		WebDriver obj = new ChromeDriver();
		try {
			obj.navigate().to("http://183.82.103.245/nareshit/login.php");
			obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
			obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
			obj.findElement(By.name("Submit")).click();
			obj.switchTo().frame("rightMenu");
			System.out.println("Login Successful");
			Select test1 = new Select(obj.findElement(By.name("loc_code")));
			test1.selectByVisibleText("Emp. ID");
			obj.findElement(By.name("loc_name")).sendKeys("3352");
			obj.findElement(By.xpath("//input[@value='Search']")).click();
			obj.findElement(By.name("chkLocID[]")).click();
			obj.findElement(By.xpath("//input[@value='Delete']")).click();
			obj.switchTo().defaultContent();
			obj.findElement(By.linkText("Logout")).click();
			obj.close();
		} catch (Exception e) {
			File t=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(t,new File("F:\\Screenshot using Selenium\\pic7.png"));
			obj.quit();
		}
	}
}
