package selenium;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.time.Duration;

public class Waits {
    public static void main(String args[]) throws IOException, InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //The below code exemplifies implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        //The below code exemplifies explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleIs("Google")); //65
        driver.get("https://www.msn.com/en-in");
        //The below code exemplifies fluent wait
        FluentWait fwait = new FluentWait(driver);
        fwait.withTimeout(Duration.ofSeconds(30));
        fwait.pollingEvery(Duration.ofSeconds(5));
        fwait.ignoring(NoSuchElementException.class);
        fwait.until(ExpectedConditions.titleContains("MSN"));

        driver.close();
    }
}
