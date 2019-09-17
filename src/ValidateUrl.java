import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidateUrl {
    public static WebDriver driver;

    public static void main (String [] args) {
        //Step3: Print the result
        //Step4: code reviewis there a better code
        System.out.println(isCurrentUrlTrue("https://www.amazon.com/"));
    }

    //Step1: Invoke the browser
    public static void Firefox(String url) {
        System.setProperty("webdriver.gecko.driver","/Users/hakkiyaz/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.get(url);
    }

    //Step2: isCurrentUrlTrue with the requested
    public static boolean isCurrentUrlTrue(String url) {
        Firefox(url);
        System.out.println("Sent url : "+url);
        System.out.println("Current url : "+driver.getCurrentUrl());
        return driver.getCurrentUrl().equalsIgnoreCase(url);
    }
}
