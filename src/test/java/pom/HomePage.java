package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private String titleHomePage = "Testing | imalittletester";
    @FindBy(css = "#comp-iiyocj9v5label")
    private WebElement latesComicLocator;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(latesComicLocator);
    }

}
