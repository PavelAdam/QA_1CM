import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    private By inputFullName = By.name("full_name");
    private By inputPhone = By.name("mobile");
    private By registerButton = By.id("newLoanButton");
    private By errorLabel = By.cssSelector("#FormCalculator > div.calculator__submit > div > div.invalid-input-hint");


    public PageObject typeFullName(String name) {
        driver.findElement(inputFullName).sendKeys(name);
        return this;
    }

    public PageObject typePhone(String phone) {
        driver.findElement(inputPhone).sendKeys(phone);
        return this;
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public List<WebElement> getErrors () {
        return driver.findElements(errorLabel);
    }



}
