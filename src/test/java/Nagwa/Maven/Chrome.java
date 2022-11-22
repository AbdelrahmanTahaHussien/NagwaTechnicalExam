package Nagwa.Maven;





import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome {
	

		
	ChromeDriver driver ;
	
	
	@BeforeTest
	public void openURl ()
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\resources\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.nagwa.com/en/");
		
	
	}
	@Test(priority = 1)
	public void chooseLang() {
		
		WebElement droplist = driver.findElement(By.className("dropdown"));
		droplist.click();
		WebElement chooselang = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/ul/li[2]/ul/li[1]/a"));
		chooselang.click();
		
	}
	@Test(priority = 2)
	public void searchNagwalessons() {
	
		WebElement searchtextbox = driver.findElement(By.className("search"));
		searchtextbox.click();
		WebElement writingbox = driver.findElement(By.id("txt_search_query"));
		writingbox.clear();
		writingbox.sendKeys("Nagwa Lessons");
		WebElement searchbuttom = driver.findElement(By.id("btn_global_search"));
		searchbuttom.click();
		System.out.println(driver.getCurrentUrl());
	}
	@Test(priority = 3)
	public void searchAdditionessons() {
		
		WebElement searchtextbox = driver.findElement(By.className("search"));
		searchtextbox.click();
		WebElement writingbox = driver.findElement(By.id("txt_search_query"));
		writingbox.clear();
		writingbox.sendKeys("Addition");
		WebElement searchbuttom = driver.findElement(By.id("btn_global_search"));
		searchbuttom.click();
		System.out.println(driver.getCurrentUrl());
	}
	
	

	@Test(priority = 4)
	public void chooseSecondNagwalesson() {
	
		WebElement secondlessonbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/div[3]/ul/li[2]/div/a"));
		secondlessonbox.click();
		System.out.println(driver.getCurrentUrl());
	}
	@Test(priority = 5)
	public void chooseworksheet() {
	
		WebElement workSheetbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/aside/div[1]/ul/li[4]/div/a"));
		workSheetbox.click();
		
	
		System.out.println(driver.getCurrentUrl());
	}
	@Test(priority = 6)
	public void countworksheet() {
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'instance ']"));
		List<WebElement> elements1 = driver.findElements(By.xpath("//div[@class = 'instance has-info']"));
		int elementsCount = elements.size() + elements1.size();
		System.out.println(elementsCount);
		
	}
	
	@AfterTest
	public void endtask () {
		driver.quit();
	}
	
}
