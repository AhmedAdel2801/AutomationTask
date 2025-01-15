package Pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class P02_Home {
    SHAFT.GUI.WebDriver driver;
    public P02_Home(SHAFT.GUI.WebDriver driver)
    {
        this.driver=driver;
    }
    By menSection = By.xpath("//a[@href=\"#Men\"]");
    By T_ShirtSelection = By.xpath("//a[@href=\"/category_products/3\"][contains(.,Tshirts)]");

    @Step("Navigate to products page")
    public P03_Product productsNavigation(){
        driver.element().click(menSection).click(T_ShirtSelection);
    return new P03_Product(driver);
    }
}
