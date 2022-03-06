package selenium.com;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
		WebElement wb=driver.findElement(By.xpath("//downloads-manager"));
		SearchContext root1 =wb.getShadowRoot();
		
		WebElement wb1=root1.findElement(By.cssSelector("downloads-toolbar#toolbar"));
		SearchContext root2=wb1.getShadowRoot();
		
		WebElement wb2=root2.findElement(By.cssSelector("cr-toolbar#toolbar"));
		SearchContext root3=wb2.getShadowRoot();
		
		WebElement wb3=root3.findElement(By.cssSelector("cr-toolbar-search-field#search"));
		SearchContext root4=wb3.getShadowRoot();
		
		root4.findElement(By.cssSelector("input#searchInput")).sendKeys("abcd");
		
		//driver.close();
	}

}
