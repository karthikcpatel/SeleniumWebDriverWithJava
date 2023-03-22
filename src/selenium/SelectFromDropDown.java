package selenium;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropDown {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement dropdownclick = driver.findElement(By.id("carselect"));
        Select dropdown = new Select(dropdownclick);
        dropdown.selectByVisibleText("Honda");
        Thread.sleep(2000);
        dropdown.selectByIndex(0);
        Thread.sleep(2000);
        dropdown.selectByValue("benz");
        Thread.sleep(2000);
        driver.close();
    }
}
