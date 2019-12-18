import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }
    @Test
    public void doLogin(){
        driver.get("http://gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abc@abc.com");
        String title = driver.getTitle();
        System.out.println("title of this page is : " + title);
        System.out.println("just checking");

        /*
        adding new comments to see if jenkins triggers build to check CI
        again trigerring build in jenkins
         */
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
