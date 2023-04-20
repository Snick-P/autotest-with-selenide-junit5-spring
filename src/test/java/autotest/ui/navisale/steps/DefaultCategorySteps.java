package autotest.ui.navisale.steps;


import autotest.ui.navisale.page.DefaultCategoryItemPage;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultCategorySteps {

    @Autowired
    private DefaultCategoryItemPage defaultCategoryItemPage;

    public void goToNextPage() {
        defaultCategoryItemPage.getNextPageButton().shouldBe(Condition.visible).click();
    }

    public void goToPreviousPage() {
        defaultCategoryItemPage.getPreviousPageButton().shouldBe(Condition.visible).click();
    }

    @DisplayName("Сортировка товаров сначала популярные - категория товаров")
    public void chooseFirstPopular() {
        defaultCategoryItemPage.getFirstsPopular().click();
        //defaultCategoryItemPage.getRubricLayout().shouldHave(Condition.text("Мужская одежда"));
    }

    @DisplayName("Сортировка товаров сначала дешевые - категория товаров")
    public void chooseFirstCheap() {
        defaultCategoryItemPage.getFirstCheap().click();
        defaultCategoryItemPage.getRubricLayout().shouldHave(Condition.text("Недорогие"));
    }

    @DisplayName("Сортировка товаров сначала дорогие - категория товаров")
    public void chooseFirstPricey() {
        defaultCategoryItemPage.getFirstPricey().click();
        defaultCategoryItemPage.getRubricLayout().shouldHave(Condition.text("Премиум"));
    }

    @DisplayName("Сортировка товаров сначала со скидкой - категория товаров")
    public void chooseFirstDiscount() {
        defaultCategoryItemPage.getFirstDiscount().click();
        defaultCategoryItemPage.getRubricLayout().shouldHave(Condition.text("со скидкой"));
    }

    @DisplayName("Сортировка товаров сначала новые - категория товаров")
    public void chooseFirstNew() {
        defaultCategoryItemPage.getFirstNew().click();
        defaultCategoryItemPage.getRubricLayout().shouldHave(Condition.text("Новые"));
    }



}
