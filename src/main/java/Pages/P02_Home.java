package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_Home {
    SHAFT.GUI.WebDriver driver;
    public P02_Home(SHAFT.GUI.WebDriver driver)
    {
        this.driver=driver;
    }
    By menSection = By.xpath("//a[@href=\"#Women\"]");
    By T_ShirtSelection = By.xpath("//a[@href=\"/category_products/3\"][contains(.,Tshirts)]");


    public void productsNavigation(){
        driver.element().click(menSection).click(T_ShirtSelection);
    }
}
