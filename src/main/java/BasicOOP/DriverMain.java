package BasicOOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.BasicConfigurator;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMain {

    public static void main(String[] args) {


        BasicConfigurator.configure();
        WebDriverManager webDriverManager = new ChromeDriverManager();
        webDriverManager.chromedriver().setup();


        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/index.php");
        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        IDriver driver;

        if (args[0].equals("1")) {
            driver = new Child1(webDriver);
        }
            else
        {driver = new Child2(webDriver);
        }

            driver.clickOnButton();
            driver.getTextOfElement();
            System.out.println(driver.getTextOfElement());
    }

}

