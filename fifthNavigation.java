package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifthNavigation {

     static WebDriver fifthNavigatior;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        fifthNavigatior=new ChromeDriver();//we ask out object to work with Chromedriver

        fifthNavigatior.manage().window().maximize();

        fifthNavigatior.get("https://trulia.com");





    }
}
