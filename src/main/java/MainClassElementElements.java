import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClassElementElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZenBook\\IdeaProjects\\Testselenium\\src\\test\\java\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage() .window() .maximize() ;

        driver.get("https://epicentrk.ua/");
        driver.findElement(By.xpath("//a[text()='Кліматична техніка']")).click();
        driver.findElement(By.xpath("//a[@class='shop-category__title link link--big link--inverted nc']")).click();
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='filter-wrapper']//form//div[6]//div[1]//label[@class='checkbox']//input[@name='brand']"));

//        checkboxes.get(3).click();

        for (WebElement checkbox : checkboxes){
            checkbox.click();
        }




    //      driver.quit();

        }
    }


