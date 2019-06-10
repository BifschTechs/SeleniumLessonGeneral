package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;


public class secondNavigation {

    static WebDriver secondNavigator;


    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();

        secondNavigator=new ChromeDriver();

        secondNavigator.get("https://www.ufc.com");

        secondNavigator.manage().window().maximize();
    }
}
