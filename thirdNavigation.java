package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thirdNavigation {

    static WebDriver thirdNavigatior;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        thirdNavigatior=new ChromeDriver();


        thirdNavigatior.get("https://www.yahoo.com");

        thirdNavigatior.manage().window().maximize();


    }
}
