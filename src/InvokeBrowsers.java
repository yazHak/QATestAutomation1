import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InvokeBrowsers {
    public static void main(String[] args) {

        //Chrome();
        //Firefox();
        Safari();
    }

    public static void Chrome() {
        System.setProperty("webdriver.chrome.driver","/Users/hakkiyaz/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String str="iPhone";
        driver.findElement(By.id("gsr")).sendKeys(str);
        driver.findElement(By.id("gsr")).sendKeys(Keys.RETURN);
    }

    public static void Firefox() {
        System.setProperty("webdriver.gecko.driver","/Users/hakkiyaz/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.yahoo.com/");
    }

    public static void Safari() {
        WebDriver driver = new SafariDriver();
        driver.get("https://ebay.com");
    }
}
