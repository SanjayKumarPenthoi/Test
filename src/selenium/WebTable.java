package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws Exception{
		WebDriver obj = new ChromeDriver();
		obj.get("file:///F:/Automation%20folders/WebTable.html");
	// Row Count
		System.out.println("This is row count : "+obj.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size());
	// Column Count
		int col = obj.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td")).size();
		System.out.println("This is column count : "+col);
	//Row And Column
		int row_col=obj.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println("This is row And Column coumn : "+row_col);
	//Get Cell Data
		String data=obj.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[5]/td[2]")).getText();
		System.out.println("This is particular cell data : "+data);
	//Whole Table data
		System.out.println("Here is Whole Table Data : ");
		for(int i=1; i<=col; i++) {
			String all=obj.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
			System.out.println(all);
			Thread.sleep(2000);
		}
		obj.quit();
	}
}
