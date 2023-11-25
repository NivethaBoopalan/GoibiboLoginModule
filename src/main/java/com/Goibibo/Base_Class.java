package com.Goibibo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Base_Class {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	static Actions ac;
	public static void browserLaunch(String value) {

		if(value.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);//up casting
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			}
		else if (value.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();//up casting
			driver.manage().window().maximize();

		}
	}
	public static void launchUrl(String url) {

		driver.get(url);
	}
	public static void fullscreenshot(String name) 
    {
    	Screenshot take= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    	try {
			ImageIO.write(take.getImage(),"PNG",new File("C:\\Users\\Admin\\eclipse-workspace\\tutorialsninja\\Screenshot\\"+name+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static void screenShot(String name) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\tutorialsninja\\Screenshot\\"+name+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;	
	}
	public void explicityWait(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();		
	}
	public void frame(int index) {

		driver.switchTo().frame(index);	
	}
    public static void  MouseActions(WebElement element)
	{
		ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
    public void clickMouse(WebElement element) {
    	ac=new Actions(driver);
    	ac.click(element).perform();		
	}
	public static void inputValues(WebElement getwebelement, String value) {
		getwebelement.sendKeys(value);
	}
	public static  void javaScript(String value) {
		if(value.equalsIgnoreCase("down")) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300);");
		}else if (value.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(0,-3000);");
		}
	}
	public static void isdisplayed(String input,WebElement element)
	{
		if(input.equalsIgnoreCase("classname"))
		{
			boolean display=element.isDisplayed();
			System.out.println("Boolean value : "+display);
		}
		else if(input.equalsIgnoreCase("id"))
		{
			boolean display=element.isDisplayed();
			System.out.println("Boolean value : "+display);
		}
		else if(input.equalsIgnoreCase("css selector"))
		{
			boolean display=element.isDisplayed();
			System.out.println("Boolean value : "+display);
		}
		else if(input.equalsIgnoreCase("xpath"))
		{
			boolean display=element.isDisplayed();
			System.out.println("Boolean value : "+display);
		}
		else if(input.equalsIgnoreCase("tag name"))
		{
			boolean display=element.isDisplayed();
			System.out.println("Boolean value : "+display);
		}
		else if(input.equalsIgnoreCase("name"))
		{
			boolean display=element.isDisplayed();
			System.out.println("Boolean value : "+display);
		}
	}
	public static void clear(WebElement element)
	{
	element.clear();
	}
	public static void Exit()
	{
		driver.quit();
	}

	public static void javascript(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
}
