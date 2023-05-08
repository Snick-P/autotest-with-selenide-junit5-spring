package autotest.ui.navisale.steps;


import autotest.ui.navisale.page.DefaultItemPage;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultItemSteps {

    @Autowired
    private DefaultItemPage defaultItemPage;
@DisplayName("Добавить товар в корзину")
    public void addItemToBasket(){
        defaultItemPage.getAddProductButton().click();
        defaultItemPage.getNotification().shouldBe(Condition.visible);
    }

    public void goToProductBrandPage(){
        defaultItemPage.getProductBrandButton().click();
    }



}
