package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPage extends BasePage{
    @FindBy(css = "#comp-lc61aui31 h2 span span span")
    private WebElement pageTitleLocator;
    private String titlePage = "HE LITTLE TESTER COMICS SERIES";

    public ComicsPage (WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception{
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }

}
