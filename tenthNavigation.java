package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tenthNavigation {

    static WebDriver tenthNavigatior;


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        tenthNavigatior=new ChromeDriver();

        tenthNavigatior.get("https://www.facebook.com");

        tenthNavigatior.manage().window().maximize();

        tenthNavigatior.quit();


    }
}
