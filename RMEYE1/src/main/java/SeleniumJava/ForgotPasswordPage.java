
package SeleniumJava;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.140.121/login");
		
		
		driver.findElement(By.className("inputField")).sendKeys("M Saikumar");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("test");
		driver.findElement(By.className("FromBtn")).click();
		
		System.out.println(driver.findElement(By.className("alertMsg")).getText());
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("snarala@ruggedmonitoring.com");
		
		String captchaImg=driver.findElement(By.className("captchaImage")).getText();
		driver.findElement(By.xpath("//input[@formcontrolname='code']")).sendKeys(captchaImg);
		
		driver.findElement(By.className("FromBtn")).click();
		
		driver.findElement(By.className("FromBtn")).click();

	
//		 driver.quit();
	}

}
