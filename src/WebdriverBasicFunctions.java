import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasicFunctions {
    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/hakkiyaz/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com/");
        System.out.println("The title of the webpage is "+driver.getTitle());
        driver.navigate().to("http://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("*************************************************************");
        System.out.println(driver.getPageSource());
        driver.close();
    }
}
