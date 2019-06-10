package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eigthNavigation {

static WebDriver eigthNavigatior;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        eigthNavigatior = new ChromeDriver();

        eigthNavigatior.get("https://www.facebook.com");

        eigthNavigatior.manage().window().maximize();

        eigthNavigatior.quit();


    }
}
