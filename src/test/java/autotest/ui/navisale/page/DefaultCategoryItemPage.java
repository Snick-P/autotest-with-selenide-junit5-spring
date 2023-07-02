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
    ElementsCollection filterCollection = $$x("//button[@class='form-filter-group__btn-collapse js-btn-collapse']");

    SelenideElement
    rubricLayout = $x("//div[@class='rubrics-layout__area-title']/h1"),
    firstsPopular = $x("//div[@class='sorting-list']//li[1]"),
    firstCheap = $x("//div[@class='sorting-list']//li[2]"),
    firstPricey = $x("//div[@class='sorting-list']//li[3]"),
    firstDiscount = $x("//div[@class='sorting-list']//li[4]"),
    firstNew = $x("//div[@class='sorting-list']//li[5]");


    SelenideElement previousPageButton = $x("//a[contains(text(),'В начало')]");
    SelenideElement nextPageButton = $x("//a[contains(text(),'Далее')]");
    ElementsCollection goToPageButtons = $$x("//li[@class='pagination__item']/a[not(contains(text(),'Далее') or contains(text(),'В начало') or contains(text(),'...'))]");

    SelenideElement filterByPrice = filterCollection.get(0);
    SelenideElement minPriceFilter = $x("//input[@name='filter[minPrice]']");
    SelenideElement maxPriceFilter = $x("//input[@name='filter[maxPrice]']");

    SelenideElement filterByBrandButton = filterCollection.get(1);
    SelenideElement filterByBrandShowAll = $x("//fieldset[@class='form-filter-group js-fieldset form-filter-group_open']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterByBrandCheckbox = $$x("//label//div[@class='checkbox__text']");
    SelenideElement filterSearchInput = $x("//div[@class='form-filter-group__search-row js-search-wrapper']/input");



    ElementsCollection filterValueItemsCheckbox = $$x("//div[@class='checkbox__text']");
    ElementsCollection filterValueMoreButtons = $$x("//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");

    SelenideElement
    filterBySupplierCountry = filterCollection.get(2),
    filterByGermanySupplier = $x("//div[contains(text(), 'Германия')]"),
    filterByUSASupplier = $x("//div[contains(text(), 'США')]"),
    filterByTurkeySupplier = $x("//div[contains(text(), 'Турция')]"),

    filterByAvailability = filterCollection.get(3),

    filterBySizeButton = filterCollection.get(4),
    filterBySizeShowAllButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param2']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterBySizeCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-param2']//div[@class='checkbox__text']");

    SelenideElement filterByColorButton = filterCollection.get(5);
    SelenideElement filterByColorShowAllButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param1']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterByColorCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-param1']//div[@class='checkbox__text']");

    SelenideElement submitFilterButton = $x("//button[@class='btn btn_primary form-filter__btn-submit js-btn-submit']");


}
