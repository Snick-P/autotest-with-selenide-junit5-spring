package autotest.ui.navisale.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;


@Getter
@Component

public class DefaultCategoryItemPage {

    ElementsCollection itemsCollectionButton = $$x("//div[@class='product-card__preview']");

    SelenideElement rubricLayout = $x("//div[@class='rubrics-layout__area-title']/h1");
    SelenideElement firstsPopular = $x("//div[@class='sorting-list']//li[1]");
    SelenideElement firstCheap = $x("//div[@class='sorting-list']//li[2]");
    SelenideElement firstPricey = $x("//div[@class='sorting-list']//li[3]");
    SelenideElement firstDiscount = $x("//div[@class='sorting-list']//li[4]");
    SelenideElement firstNew = $x("//div[@class='sorting-list']//li[5]");


    SelenideElement previousPageButton = $x("//a[contains(text(),'В начало')]");
    SelenideElement nextPageButton = $x("//a[contains(text(),'Далее')]");
    //громоздко, но лучше не придумал
    ElementsCollection goToPageButtons = $$x("//li[@class='pagination__item']/a[not(contains(text(),'Далее') or contains(text(),'В начало') or contains(text(),'...'))]");

    SelenideElement upPriceSlider = $x("//label[@for='min-max-range-price-from']");
    SelenideElement cutPriceSlider = $x("//label[@for='min-max-range-price-to']");
    SelenideElement minPriceFilter = $x("//input[@name='filter[minPrice]']");
    SelenideElement maxPriceFilter = $x("//input[@name='filter[maxPrice]']");

    SelenideElement filterByColorButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param1']//button[@class='form-filter-group__btn-collapse js-btn-collapse']");
    SelenideElement filterByColorShowAllButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param1']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterByColorCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-param1']//div[@class='checkbox__text']");

    SelenideElement filterBySizeButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param2']//button[@class='form-filter-group__btn-collapse js-btn-collapse']");
    SelenideElement filterBySizeShowAllButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param2']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterBySizeCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-param2']//div[@class='checkbox__text']");

    SelenideElement filterByBrandButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-brand']//button[@class='form-filter-group__btn-collapse js-btn-collapse']");
    SelenideElement filterByBrandShowAll = $x("//fieldset[@aria-labelledby='filter-fieldset-label-brand']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterByBrandCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-brand']//div[@class='checkbox__text']");

    ElementsCollection filterValueItemsCheckbox = $$x("//div[@class='checkbox__text']");
    ElementsCollection filterValueMoreButtons = $$x("//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");

    SelenideElement submitFilterButton = $x("//button[@class='btn btn_primary form-filter__btn-submit js-btn-submit']");



}
