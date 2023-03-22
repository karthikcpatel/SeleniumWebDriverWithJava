package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadio {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
        //driver.findElement(By.xpath("(//legend[text()='Radio Button Example']//following-sibling::label//descendant::input)[1]")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
