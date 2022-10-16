package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkVerification {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Dashboard page
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		System.out.println("Title " +driver.getTitle());
		if(driver.getTitle().contains("Dash")) {
			System.out.println("Verified");}
			else
				System.out.println("Not Verified");
		
		//Current URL
		System.out.println(driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).getAttribute("href"));
		WebElement Copy = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']"));
		String store= Copy.getAttribute("href");
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		//Am i Broken Link
		driver.findElement(By.linkText("Broken?")).click();
		System.out.println("Title" +driver.getTitle());
		if(driver.getTitle().contains("Error")) {
			System.out.println("Yes Its Broken");
		}
		else
			System.out.println("Not Broken");
		//Duplicate Link
		System.out.println("Duplicate Link" +store);
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		}	
	}

