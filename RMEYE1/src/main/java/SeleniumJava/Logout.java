package SeleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Logout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.140.121/login");
		
		driver.findElement(By.className("inputField")).sendKeys("smangali@ruggedmonitoring.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("test");
		driver.findElement(By.className("FromBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("user-icon")).click();
//		driver.findElement(By.className("closeBtn")).click();
		System.out.println(driver.findElement(By.className("userRole")).getText());
		Assert.assertEquals(driver.findElement(By.className("userRole")).getText(),"Administrator" );
		
		driver.findElement(By.xpath("//button[@color='primary']/span[1]")).click();
		driver.quit();
	}

}
