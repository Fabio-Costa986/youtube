package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class primeiroTest {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	driver = new ChromeDriver();
	
	driver.get("https:www.youtube.com");
	
	// maximizar o navegador
	driver.manage().window().maximize();

		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testYoutubek() {
		
		driver.findElement(By.name("search_query")).sendKeys("exaltasamba");
		driver.findElement(By.name("search_query")).submit();
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		
	}
	
}
	
