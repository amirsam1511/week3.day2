package week3.day2.assignment4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		//Chrome Driver setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Get the url and maximize the screen include wait also
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// Click Search and type bags and press enter
		WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'AJIO')]"));
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(300);
		//Select the Gender as Men at top left and Category as Fashion Bags 
		driver.findElement(By.xpath("//input[@id = 'Men']/following::label[@for = 'Men']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@id = 'Men - Fashion Bags']/following::label[1]")).click();
		Thread.sleep(300);
		//Count the number of items found
		WebElement count = driver.findElement(By.className("length"));
		System.out.println(count.getText());
		//Print the number of brands in a page
		List<WebElement> brand = driver.findElements(By.className("brand"));
		System.out.println("No of Brands Present in a Page " + brand.size());
		for (WebElement brandNames : brand) {
			System.out.println("Brand Names are "+ brandNames.getText());
		}
		Thread.sleep(300);
		//Print the number of bags in a page
		List<WebElement> bag = driver.findElements(By.xpath("//div[@class = 'nameCls']"));
		System.out.println("No of Bags Present in a Page " + bag.size());
		for (WebElement bagName : bag) {
			System.out.println("Bag Names are " + bagName.getText());
		}
		//Close the browser
		driver.close();
	}

}
