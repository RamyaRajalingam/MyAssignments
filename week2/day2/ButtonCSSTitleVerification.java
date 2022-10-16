package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonCSSTitleVerification {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Click and Confirm Title
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println("Title is "+driver.getTitle());
		if(driver.getTitle().contains("Dash")) {
			System.out.println("Title Verified");}
			else
				System.out.println("Not Verified");
		//Verify and Confirm button disabled
		driver.navigate().to("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		WebElement verifybutton = driver.findElement(By.xpath("//span[text()='Disabled']"));
		System.out.println("Button Diabled" +verifybutton.isEnabled());
		//Position of Submit Button
		driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		//Save button color
		System.out.println("CSS Color" +driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save']")).getCssValue("background-color"));
		//Height and Width
		System.out.println("Height and Width" +driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize());
		//Hidden button
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']")).isDisplayed());
		driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']")).click();
		
	}

}
