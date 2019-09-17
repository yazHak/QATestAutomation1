import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPassword {
    static WebDriver driver;
    public static void main (String[] args) throws InterruptedException {
        String url = "http://www.gmail.com";
        invokeFirefox();
        driver.get(url);
        driver.findElement(By.id("identifierId")).sendKeys("dursuntemel22");
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Temeldursun22");
        driver.findElement(By.id("passwordNext")).click();

    }
    public static void invokeFirefox() {
        System.setProperty("webdriver.gecko.driver","/Users/hakkiyaz/Downloads/geckodriver");
        driver = new FirefoxDriver();
    }
}
