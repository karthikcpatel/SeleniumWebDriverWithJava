package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class DynamicScreenshot {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        screenShot(driver);
        System.out.println("Screenshot taken successfully");
        driver.close();
    }

    public static void screenShot(WebDriver driver) throws IOException, InterruptedException {
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\kartik.patel\\git\\Selenium WebDriver With Java\\src\\selenium\\screenshots\\"+timestamp()+".png");
        FileUtils.copyFile(source, destination);
        Thread.sleep(2000);
    }

    public static String timestamp() {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
