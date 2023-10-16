package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;
    @Before
    public void setUp(){
        numberOfCase+=1;
        System.out.println("Number of Case: " + (numberOfCase));
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);

        driver = driverManager.getDriver();

        driver.get("https://www.imalittletester.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("Number of Case: " + (numberOfCase));
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
