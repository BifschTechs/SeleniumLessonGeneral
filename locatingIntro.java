package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingIntro {
    static WebDriver driver;


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.amazon.com");//allways creating new page
        // driver.navigate().to("www.amazon.com");// always goes on currrent page


        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement((By.id("twotabsearchtextbox")));




    }
}