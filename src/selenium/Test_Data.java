package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Data {
	static String url = "http://183.82.103.245/nareshit/login.php";
	String un = "nareshit";
	String pwd = "nareshit";

	public static void main(String args[]) throws Exception {
		Test_Data test = new Test_Data();
		WebDriver obj = new ChromeDriver();
		obj.navigate().to(url);
		Thread.sleep(3000);
		if (obj.getTitle().equals("wvggw")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title Matched");
			System.out.println(obj.getTitle());
		}
		obj.findElement(By.name("txtUserName")).sendKeys(test.un);
		Thread.sleep(2000);
		obj.findElement(By.name("txtPassword")).sendKeys(test.pwd);
		Thread.sleep(2000);
		obj.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		obj.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		obj.close();
	}
}
