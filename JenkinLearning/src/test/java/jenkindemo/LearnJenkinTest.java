package jenkindemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnJenkinTest {
	
	@Test
	public void launch()
	{
		WebDriver driver= new ChromeDriver();
		Reporter.log("Emplty browser Luanch", true);
	}

}
