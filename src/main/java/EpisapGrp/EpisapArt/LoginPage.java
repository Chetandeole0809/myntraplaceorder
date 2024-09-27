package EpisapGrp.EpisapArt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  {

		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
			WebElement Loginpage = driver.findElement(By.xpath("//*[@class=\"welcome-header\"]"));
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(Loginpage));
            
            driver.findElement(By.xpath("//*[@type=\"tel\"]")).sendKeys("9158810311");
            
            driver.findElement(By.xpath("//*[@class=\"submitBottomOption\"]")).click();
            
            WebElement Otpscreen = driver.findElement(By.xpath("//*[text()=\"Verify with OTP\"]"));
            
            wait.until(ExpectedConditions.visibilityOf(Otpscreen));
            
            
            
//            driver.findElement(By.xpath("//*[text()=\" Password \"]")).click();
//            WebElement EneterPassword = driver.findElement(By.xpath("//*[@type=\"password\"]"));
//            
//            wait.until(ExpectedConditions.visibilityOf(EneterPassword));
//            EneterPassword.sendKeys("")
            
			
		}
			
		
		

	}

}
