package seleniumm;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumclass1 {
    static WebDriver driver;


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();


        driver.get("https://www.amazon.com");//allways creating new page
       // driver.navigate().to("www.amazon.com");// always goes on currrent page


        driver.manage().window().maximize();

        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs &amp; more",driver.getTitle());//static method.




    }
}