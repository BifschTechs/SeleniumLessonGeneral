package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sixthNavigation {
    static WebDriver sixthNavigatior;


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        sixthNavigatior=new ChromeDriver();

        sixthNavigatior.get("https:www.seleniumhq.org");


        sixthNavigatior.manage().window().fullscreen();

        Thread.sleep(2000);

        sixthNavigatior.quit();
    }
}
