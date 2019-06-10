package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ninthNavigation {

   static WebDriver ninthNavigatior;


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ninthNavigatior=new ChromeDriver();

        ninthNavigatior.navigate().to("https://www.cars.com");

        ninthNavigatior.manage().window().maximize();

        ninthNavigatior.quit();
    }
}
