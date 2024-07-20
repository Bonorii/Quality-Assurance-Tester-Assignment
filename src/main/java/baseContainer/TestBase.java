package baseContainer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Support/eclipse-workspace/DashboardAutomation/browserDriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://msdat2-staging.e4eweb.space/dashboard/Health_Outcomes_and_Service_Coverage");
		
		// Wait for the page to load completely
        try {
            Thread.sleep(5000); // Adjust the sleep time as necessary
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Close the browser
        driver.quit();
    }

}
