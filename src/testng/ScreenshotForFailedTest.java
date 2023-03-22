package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotForFailedTest {
    WebDriver driver;

    @Test
    public void captureScreenshot() throws Exception
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='k']")).sendKeys("Kartik Chetan Patel");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown(ITestResult result)
    {
        if(ITestResult.FAILURE==result.getStatus())
        {
            UtilityClassForScreenshot.captureScreenshot(driver, result.getName());
        }
        driver.close();
    }
}