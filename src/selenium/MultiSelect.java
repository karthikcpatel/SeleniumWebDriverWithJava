package selenium;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
    public static void main(String args[]) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select dropdown = new Select(driver.findElement(By.name("multiple-select-example")));
        dropdown.selectByVisibleText("Apple");
        Thread.sleep(2000);
        dropdown.selectByIndex(2);
        Thread.sleep(2000);
        dropdown.selectByValue("orange");
        Thread.sleep(2000);
        driver.close();
    }
}
