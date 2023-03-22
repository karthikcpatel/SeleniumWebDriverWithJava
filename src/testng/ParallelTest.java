package testng;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ParallelTest {
    WebDriver driver;
    @Test
    @Parameters("browser")
    public void pageTitle(String browserName){
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.marionette", "C:/Users/kartik.patel/git/Selenium WebDriver With Java/drivers/geckodriver_0.24.exe");
            driver = new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}