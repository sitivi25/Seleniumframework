import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MainClassLinks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\Testselenium\\src\\test\\java\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org");

        WebElement link = driver.findElement(By.xpath("//div[@id='mp-other-content']//ul//li//b//a "));
        System.out.println(link.getText());
        link.click();

        driver.get("https://www.facebook.com/home.php");
        WebElement link1 = driver.findElement(By.xpath("//div[@id='pageFooterChildren']//ul//li[6]/a"));
        System.out.println(link1.getText());
        link1.click();


//       driver.quit();
    }
}

