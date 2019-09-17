import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrl2 {
    public static WebDriver driver;
    public static String url="https://www.amazon.com";

    public static void main (String[] args) {
        Chrome(url);
        //System.out.println(urlValidation(url));
        System.out.println("Validation : "+ url.equalsIgnoreCase(driver.getCurrentUrl()));
    }

    public static void Chrome(String url) {
        System.setProperty("webdriver.chrome.driver","/Users/hakkiyaz/Downloads/chromedriver");
        driver=new ChromeDriver();
        driver.get(url);
    }

    public static boolean urlValidation(String url) {
        System.out.println("Current url : "+driver.getCurrentUrl());
        System.out.println("Requested url : "+url);
        return url.equalsIgnoreCase(driver.getCurrentUrl());
    }
}
