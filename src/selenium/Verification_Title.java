package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_Title {
	public static void main(String args[]) {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		if(obj.getTitle().equals("vegre")) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title not matched");
			System.out.println(obj.getTitle());
		}
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		obj.findElement(By.name("Submit")).click();
		if(obj.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title not matched");
			System.out.println(obj.getTitle());
		}
		obj.findElement(By.linkText("Logout")).click();
		obj.close();
	}
}
