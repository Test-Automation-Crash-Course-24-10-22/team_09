package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriePage extends BasePage{
    @FindBy(xpath = "//ul[@class='portal-grid portal-grid_type_1_4']/a[@title='Мобільні телефони']")
    private WebElement mobilePhoneCategorie;
    public CategoriePage(WebDriver driver) {
        super(driver);
    }


    public void openPhones() { mobilePhoneCategorie.click();}

}
