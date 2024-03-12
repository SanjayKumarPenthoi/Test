package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploading {
	public static void main(String[] args) throws Exception {
		WebDriver obj=new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		obj.findElement(By.name("Submit")).click();
		Actions test=new Actions(obj);
		test.moveToElement(obj.findElement(By.linkText("PIM"))).perform();
		obj.findElement(By.linkText("Add Employee")).click();
		obj.switchTo().frame(0);
		obj.findElement(By.name("txtEmpLastName")).sendKeys("PENTHOI");
		obj.findElement(By.name("txtEmpFirstName")).sendKeys("SANJAY");
		obj.findElement(By.name("txtEmpMiddleName")).sendKeys("KUMAR");
		WebElement file=obj.findElement(By.name("photofile"));
		file.sendKeys("C:\\Users\\DELL\\Pictures\\IMG_20210825_103145.jpg");
		obj.findElement(By.id("btnEdit")).click();
		Thread.sleep(5000);
		obj.switchTo().defaultContent();
		obj.findElement(By.linkText("Logout")).click();
		obj.quit();
	}
}
