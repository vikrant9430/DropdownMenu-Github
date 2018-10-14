package multiselect.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\"
				+ "Desktop\\Hub\\SQT\\Selenium WebDriver\\Selenium Drivers"
				+ "\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://learn.letskodeit.com/p/practice");
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'multiple-select-example\']"));
		
		Select oselect = new Select(multiselect);
		
		List<WebElement> elementcount = oselect.getOptions();
		int count = elementcount.size();
		System.out.println(count);
		
		for(int i = 0; i<count; i++) {
			String oOption = elementcount.get(i).getText();
			System.out.println(oOption);			
		}
		
		oselect.selectByIndex(0);
		oselect.selectByValue("orange");
		oselect.selectByVisibleText("Peach");
		System.out.println(oselect.isMultiple());
		
		

	}

}
