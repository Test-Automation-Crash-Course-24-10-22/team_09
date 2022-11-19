package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[@id='fat-menu']")
    private WebElement catalogButton;

    @FindBy(xpath = "//ul[@class='menu-categories ng-star-inserted']//a[contains(text(), 'Смартфони, ТВ і електроніка')]")
    private WebElement categorieButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openCatalog(){
        catalogButton.click();
    }

    public void openCategorie() {categorieButton.click();}
}
