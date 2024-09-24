package EpisapGrp.EpisapArt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToBag {

	
		public WebDriver driver;
	
		public WebDriver initializeDriver() throws IOException {
			
			Properties prop=new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//Resources//GlobalData.properties");
			prop.load(fis);
			
			String browserName = prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")) 
			{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		
			}
			else if (browserName.equalsIgnoreCase("firefox")) 
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
			else if (browserName.equalsIgnoreCase("edge")) 
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			return driver;
		}
		
		public void SelectSize() {
			
			 List <WebElement> SelectSize =  driver.findElements(By.xpath("//*[@class=\"size-buttons-size-button size-buttons-size-button-default\"]"));
             
             for (WebElement option : SelectSize) {
                  if (option.getText().equals("XXL")) {
                      option.click(); // Click on the XXL option
                      //System.out.println("Size Slected");
                      break; // Exit the loop after clicking
                  }
              }
         
		}
}
