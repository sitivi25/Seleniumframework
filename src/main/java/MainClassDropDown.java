import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MainClassDropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\Testselenium\\src\\test\\java\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
        driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[3]/a[2]/span[1]")).click();

        driver.get("https://shop.silpo.ua/");
        driver.findElement(By.xpath("//span[contains(text(),'Всі товари')]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]")).click();



//       driver.quit();
    }
}

