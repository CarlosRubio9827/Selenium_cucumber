package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createDriver() {
        System.setProperty("webdriver.chrome.drive","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
