import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterTest {
    WebDriver driver;
    PageObject page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://1cm.vn/");
    }

    @Test
    public void typeValideInput(){
        page = new PageObject(driver);
        page.typeFullName("Full Name")
                .typePhone("123456789")
                .clickRegister();

    }
    @Test
    public void typeInvalideName(){
        page = new PageObject(driver);
        page.typeFullName(" Abc")
                .typePhone("123456789")
                .clickRegister();
        //Assert.assertTrue(page.  );
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
