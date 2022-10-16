package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Basic Checkbox
		WebElement basic = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));	
		basic.click();
		//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//Choose Favourite Language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//label[text()='Others']")).click();
		//Tri State Checkbox
		WebElement TriState = driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
		TriState.click();
		//Verify Chkbox is disabled
		System.out.println("Label is diabled " +driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]")).isEnabled());
			}

}
