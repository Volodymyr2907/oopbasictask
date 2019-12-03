package BasicOOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public abstract class Driver implements IDriver {

    protected WebDriver webDriver;

    protected WebElement buttonWomen;
    protected WebElement womenText;


    private boolean clicked;

    public void clickOnButton(){
        clickOnElement();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clicked = true;
    }
    public String getTextOfElement(){
        womenText = webDriver.findElement(By.className("cat_desc"));
        return findElement().getText();
    }

    protected abstract void clickOnElement();
    abstract WebElement findElement();

    protected void init() {
        buttonWomen = webDriver.findElement(By.className("sf-with-ul"));

    }

    protected Driver(WebDriver webDriver) {
        this.webDriver = webDriver;
        init();
    }

}
