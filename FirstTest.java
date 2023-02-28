package scubaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Ajith");
	    driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Kumar");
	    driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9765432156");
	    driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("ajithkumar@gmail.com");
		thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("No: 2, abcd street main road");
		thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("chennai");
	    driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("TamilNadu");
	    driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("600087");
	    driver.findElement(By.xpath("//select[@name=\"country\"]")).click();
	    //driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//option[@value=\"AUSTRALIA\"]")).click();
	    driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("ajithkumar@gmail.com");
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("ajith@123");
	    driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("ajith@123");
	    
	    driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	    driver.close();
	    driver.quit();
	}

}
