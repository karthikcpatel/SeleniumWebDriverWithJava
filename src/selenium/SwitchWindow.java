package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        String originalWindow = driver.getWindowHandle();
        System.out.println(originalWindow);
        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();

        for(String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                System.out.println(driver.getTitle());
                driver.close();
                Thread.sleep(2000);
            }
        }
        driver.switchTo().window(originalWindow);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
