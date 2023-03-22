package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;  //downcasting in java
        js.executeScript("window.scrollBy(0,100)"); //first way
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
        js.executeScript("arguments[0].scrollIntoView();", element); //second way
        Thread.sleep(4000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //third way
        Thread.sleep(4000);
        driver.close();
    }
}