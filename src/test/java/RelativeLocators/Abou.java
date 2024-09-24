package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abou {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");

		WebElement automate=driver.findElement(By.xpath("(//*[@aria-label=\"Automate\"])[3]"));
		String text = automate.getText();
		System.out.print(text);
	
		
	}

}
