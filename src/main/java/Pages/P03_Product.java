package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P03_Product {
    SHAFT.GUI.WebDriver driver;
    public P03_Product(SHAFT.GUI.WebDriver driver)
    {
        this.driver=driver;
    }
    By userNameInput = By.xpath("//input[@data-qa=\"login-email\"]");
    By passInput = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginButton = By.xpath("//button[@data-qa=\"login-button\"]");

    public void login(String userName, String password){
        driver.element().type(userNameInput,userName)
                .type(passInput,password)
                .click(loginButton);
    }
}
