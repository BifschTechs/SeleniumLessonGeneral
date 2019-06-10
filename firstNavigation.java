package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstNavigation {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver firstNavigator= new ChromeDriver();

        firstNavigator.get("https://www.youtube.com/");

        firstNavigator.manage().window().maximize();
    }
}
