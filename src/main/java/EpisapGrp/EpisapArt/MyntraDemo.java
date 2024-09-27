package EpisapGrp.EpisapArt;

import java.security.PublicKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Return;


public class MyntraDemo {
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
	        
	        
	        
	        try {
	        	driver.get("https://www.myntra.com/");
	    		driver.manage().window().maximize();
	    		 Thread.sleep(3000);
	    		 
	    		 WebElement hoverElement = driver.findElement(By.cssSelector(".desktop-main[href='/shop/men']"));
	    	        // Create an instance of Actions
	    	        Actions actions = new Actions(driver);
	    	        // Perform the hover action
	    	        actions.moveToElement(hoverElement).perform();
	    	        
	    	        driver.findElement(By.xpath("//*[text()='Track Pants & Joggers']")).click();
	    	        Thread.sleep(3000);	        
	    	        
	    	        WebElement searchBar = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
	    	        searchBar.sendKeys("HRX By Hrithik Roshan Men Side Striped Rapid-Dry Trackpants");
	    	        searchBar.sendKeys(Keys.ENTER);

	                // Wait for the search results to load
	    	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".results-base"))); // Adjust based on actual class name

	                // Locate the list of products
	                List<WebElement> productList = driver.findElements(By.cssSelector(".results-base")); // Adjust based on actual class name

	                WebElement product = driver.findElement(By.cssSelector("li[id='28985188']"));
	                product.click();
	                
	                Thread.sleep(2000);
	                String oldTab = driver.getWindowHandle();
	              
	                ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	                newTab.remove(oldTab);
	                // change focus to new tab
	                driver.switchTo().window(newTab.get(0));
	             
	                WebElement SelectSize =  driver.findElement(By.xpath("//*[text()='S']"));
	                SelectSize.click();
	                
	                WebElement AddToBag = driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center"));
	                AddToBag.click();
	                
	                System.out.println("Product added to the bag successfully...");
	                
//	                WebElement Success = driver.findElement(By.xpath("//*[text()='Added to bag']"));
//	                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Added to bag']"))));
//	                System.out.println(driver.findElement(By.xpath("//*[text()='Added to bag']")));
	                
	                Thread.sleep(2000);
	                
	               WebElement OpenBag = driver.findElement(By.cssSelector("a[class='desktop-cart'] span[class='desktop-userTitle']"));
	               OpenBag.click();
	             /*  
	               WebElement element = driver.findElement(By.xpath("//*[text()='BUY NOW WITH EARLY ACCESS']"));

	               // Scroll to the element using JavaScript
	               JavascriptExecutor js = (JavascriptExecutor) driver;
	               js.executeScript("arguments[0].scrollIntoView(true);", element);

	               // Optional: wait for a moment to see the scroll effect
	               Thread.sleep(2000);

	               // Now you can interact with the element (if needed)
	               element.click();
	               
	               WebElement BuyOption = driver.findElement(By.cssSelector(".modal-base-modal.priorityCheckoutModal-base-modal"));
	               
	               wait.until(ExpectedConditions.visibilityOf(BuyOption));
	               
	               WebElement SelectBuyOption = driver.findElement(By.xpath("//*[@id=\"earlyCheckout\"]"));
	               
	               SelectBuyOption.click(); 
	               
	               WebElement CheckBox = driver.findElement(By.cssSelector(".priorityCheckoutModal-base-icon"));
	               CheckBox.click();
	               
	             //  wait.until(ExpectedConditions.elementToBeSelected(CheckBox));
	               Thread.sleep(2000);
	               
	               HitConfirmButton.click();
	               
	               */
	               
	                //WebElement Success = driver.findElement(By.xpath("//*[@class=\"itemBlock-base-leftBlock\"]"));
	                
	               
	               WebElement PlaceOrderButton = driver.findElement(By.xpath("//*[text()='PLACE ORDER']"));
	               wait.until(ExpectedConditions.visibilityOf(PlaceOrderButton));
	                              
	               PlaceOrderButton.click();
	                
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	          
	       //driver.quit();
	        }   
	  }
	    //chetya
		//deole

}
