package seleniumm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seventhNavigation {

    static WebDriver seventhNavigatior;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();



        seventhNavigatior=new ChromeDriver();


        seventhNavigatior.get("https://www.linkedin.com");
        seventhNavigatior.manage().window().maximize();
        seventhNavigatior.quit();

    }
}
