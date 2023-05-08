package autotest.ui.navisale.page;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
@Component
public class DefaultItemPage {

    ElementsCollection sizeSelector = $$x("//ul[@class='options-group__list options-group__list_type_size']/li");
    SelenideElement addProductButton = $x("//button[@data-selector='add-to-cart-btn']");
    SelenideElement showAllParameter = $x("//button[contains(text(), 'Развернуть характеристики')]");
    SelenideElement showAllDescription = $x("//button[contains(text(), 'Развернуть описание')]");
    SelenideElement allBrandsOfTheCategory = $x("//div[@class='mt-20 mb-20']");
    SelenideElement aboutDelivery = $x("//button/span[@class='info-with-icon__content link link_default']");
    SelenideElement productBrandButton = $x("//a[@class='link card-product-brand__link link link_default']");
    SelenideElement itemCollection = $x("//div[@class='suggest-carousel__carousel-wrapper carousel__wrapper js-wrapper']/div");
    SelenideElement notification =$x("//div[@class='notifications']");
    ElementsCollection parameters = $$x("//strong");



}
