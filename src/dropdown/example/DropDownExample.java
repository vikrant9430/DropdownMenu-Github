package dropdown.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(".gecko.driver", "C:\\Users\\Vikrant Nandan\\"
				+ "Desktop\\Hub\\SQT\\Selenium WebDriver\\Selenium Drivers"
				+ "\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
			WebElement day = driver.findElement(By.xpath("//*[@id=\'day\']"));
			WebElement month = driver.findElement(By.xpath("//*[@id=\'month\']"));
			WebElement year = driver.findElement(By.xpath("//*[@id=\'year\']"));
			
			Select oday = new Select(day);
			
			// count Element in Day Options
			List<WebElement> daycount = oday.getOptions();
			int daysize = daycount.size();
			System.out.println(daysize);
			
			//print all the option in console
			for(int i = 0; i<daysize; i++) {
				String oOption = daycount.get(i).getText();
				System.out.println(oOption);			
			}
			
			oday.selectByIndex(4);
			oday.selectByValue("5");
			oday.selectByVisibleText("6");
			System.out.println(oday.isMultiple());
			
			List<WebElement> Selectcount = driver.findElements(By.tagName("Select"));
			int size= Selectcount.size();
			System.out.println(size);
			
	}

}
