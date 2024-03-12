package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_retive {
	public static void main(String args[])throws Exception {
		WebDriver obj=new ChromeDriver();
		obj.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		int count=obj.findElements(By.tagName("a")).size();
		System.out.println(count);
	List<WebElement>list=obj.findElements(By.tagName("a"));
		for(WebElement li:list) {
			String lname=li.getText();
			System.out.println(lname);
		}
		obj.quit();
	}
}
