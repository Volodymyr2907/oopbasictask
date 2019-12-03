package BasicOOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Child1 extends Driver {

    @Override
    public void clickOnButton(){
        System.out.println("Override");
        clickOnElement();
    }

    public String getTextOfElement(String text){
        return findElement().getText() + text;
    }

    protected void clickOnElement() {
        buttonWomen.click();
    }

    WebElement findElement() {
        return womenText;
    }




    protected Child1(WebDriver webDriver) {
        super(webDriver);
    }

}
