import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class MainClassCheckbox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\Testselenium\\src\\test\\java\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage() .window() .maximize() ;

        driver.get("https://epicentrk.ua/");
        driver.findElement(By.xpath("//div[@id='crosscategory']//div[1]//a")).click();
        driver.findElement(By.xpath("//a[contains(text(),'4F')]")).click();

//      driver.quit();

    }
}
