package EpisapGrp.EpisapArt;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyntraDemo {

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

	                WebElement product = driver.findElement(By.cssSelector("li[id='26902294']"));
	                product.click();
	                
	                Thread.sleep(2000);
	              //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pdp-pdp-container")));
	                
	                //Select Size
	                
	                //List<WebElement> SelectSize = driver.findElements(By.cssSelector(".size-buttons-size-buttons-error.size-buttons-size-buttons"));
	                
	               
//	                for (WebElement option : SelectSize) {
//	                    if (option.getText().equals("XXL")) {
//	                        option.click(); // Click on the XXL option
//	                        //System.out.println("Size Slected");
//	                        break; // Exit the loop after clicking
//	                    }
//	                }
	                
	                
	                
	               List <WebElement> SelectSize =  driver.findElements(By.xpath("//*[@class=\"size-buttons-size-button size-buttons-size-button-default\"]"));
	                
	               for (WebElement option : SelectSize) {
	                    if (option.getText().equals("XXL")) {
	                        option.click(); // Click on the XXL option
	                        //System.out.println("Size Slected");
	                        break; // Exit the loop after clicking
	                    }
	                }
	                
//	                WebElement SelectSize = driver.findElement(By.cssSelector(".size-buttons-size-button.size-buttons-size-button-default"));
//	                SelectSize.click();
//	                WebElement AddToCart = driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center"));
//	                AddToCart.click();
	                
//	                if (SelectSize.contains("XXL")) {
//	                    // Click on the second product
//	                    driver.findElement(By.xpath("//p[normalize-space()='XXL']")).click();
//	                } else {
//	                    System.out.println("Sixe is not Available");
//	                }
	                
	                // Click on Add To Bag button
//	                WebElement AddToCart = driver.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center"));
//	                AddToCart.click();
	                
	                // 
	                
	                
	                // Check if there are at least two products
//	                if (productList.contains(product)) {
//	                    // Click on the second product
//	                    productList.get(1).click(); // Index 1 for the second product
//	                } else {
//	                    System.out.println("Not enough products found.");
//	                }
	                
	               

	                // Wait for the product page to load (optional)
	              //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pdp-action-container.pdp-fixed"))); // Adjust based on actual identifier

					
	            // Wait until suggestions are visible
//	        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".desktop-autoSuggest.desktop-showContent")));

	            // Locate the suggestions
	            //List<WebElement> suggestionItems = driver.findElements(By.cssSelector(".desktop-autoSuggest.desktop-showContent"));

	            // Select the first suggestion (adjust the index as needed)
//	            if (!suggestionItems.isEmpty()) 
//	            {
//	                suggestionItems.get(0).click();
//	                
//	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".search-searchProductsContainer.row-base")));
//	                List<WebElement> getListOfProducts = driver.findElements(By.cssSelector(".search-searchProductsContainer.row-base"));
//	                if (!getListOfProducts.isEmpty()) 
//	                {
//	                	getListOfProducts.get().click();
//	                
//	                }
//	                System.out.println("List Of Products");
//	                System.out.println(getListOfProducts);
//					}
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	          
	       //driver.quit();
		
	            
	            
	}

}
}
