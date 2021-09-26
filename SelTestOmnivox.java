package InviulTest;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("www.montrealcollege.omnivox.ca");
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = " Omnivox - Montreal College of Information Technology";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");

      	String t = " Montreal College of Information Technology";
     		 // getPageSource() to get page source
     		 if ( driver.getPageSource().contains("Montreal College of Information Technology"))
{
         		System.out.println("Text: " + t + " is present. ");
      	} else {
         		System.out.println("Text: " + t + " is not present. ");
      	}
		
driver.close();
		driver.quit();
	}
}
