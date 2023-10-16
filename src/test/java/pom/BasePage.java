package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) throws Exception{
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("No se pudo clickear sobre el elemento " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception{
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo localizar el elemento " + element);
        }
    }

    public String getText(By element) throws Exception{
        try {
            String textElement = driver.findElement(element).getText();
            return textElement;
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento " + element);
        }
    }

    public String getTitle() throws Exception{
        try {
            String titlePage = driver.getTitle();
            return titlePage;
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo de la página ");
        }
    }

}
