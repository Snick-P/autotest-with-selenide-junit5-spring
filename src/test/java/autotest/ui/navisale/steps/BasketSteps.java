package autotest.ui.navisale.steps;


import autotest.ui.navisale.page.BasketPage;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketSteps {

    @Autowired
    BasketPage basketPage;

    @DisplayName("Удалить все элементы - корзина")
    public void deleteAllItems(){
        basketPage.getDeleteAllItem().forEach(SelenideElement::click);
    }

}   
