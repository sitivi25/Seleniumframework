import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MainClassText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\Testselenium\\src\\test\\java\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Selenium");

        driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("sitivi25@gmail.com");
        driver.findElement(By.xpath("//div[@id='email-container']//div[2]//button")).click();

        driver.get("https://www.facebook.com/home.php");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sitivi25@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("textpass");
        driver.findElement(By.xpath("//form[@id='login_form']//button")).submit();


//       driver.quit();
    }
}
