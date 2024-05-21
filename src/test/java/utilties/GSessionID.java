package utilties;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class GSessionID {

    public static String SessionID() {
        WebDriver driver;
        Wait<WebDriver> wait;
        String Gsessionid;

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("https://qa-gm3.quaspareparts.com/");
        By LoginButton = By.className("login-button");
        driver.findElement(LoginButton).click();
        By Username=By.id("username");
        By Password=By.id("password");
        By SignIn =By.tagName("button");
        driver.findElement(Username).sendKeys("assurewise@assurewise.com");
        driver.findElement(Password).sendKeys("EJWO_PWr17ePelV");

        driver.findElement(SignIn).click();
// click on RoleModule page
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By RolesModuleLink = By.id("link9");
        wait.until(f -> {
            driver.findElement(RolesModuleLink).getText();
            return true;
        });

        driver.findElement(RolesModuleLink).click();

// get cookie
        Cookie jsessionidCookie = driver.manage().getCookieNamed("GSESSIONID");

        Gsessionid = jsessionidCookie.getValue();


        return Gsessionid;

    }

    public static void main(String[] args) {
        //just testing
        System.out.println(SessionID());

    }

}
