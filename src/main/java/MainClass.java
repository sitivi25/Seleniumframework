import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\Testselenium\\src\\test\\java\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage() .window() .maximize() ;
        driver.get("http://google.com");
        driver.navigate().to("https://www.selenium.dev/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh() ;

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
