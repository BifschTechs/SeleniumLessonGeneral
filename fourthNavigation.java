package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourthNavigation {

    static WebDriver fourthNavigatior;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        fourthNavigatior=new ChromeDriver();

        fourthNavigatior.get("https://www.cnn.com");

        fourthNavigatior.manage().window().maximize();

    }
}
