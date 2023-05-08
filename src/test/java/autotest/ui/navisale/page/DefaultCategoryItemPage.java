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

    SelenideElement filterByPrice = filterCollection.get(0);
    SelenideElement minPriceFilter = $x("//input[@name='filter[minPrice]']");
    SelenideElement maxPriceFilter = $x("//input[@name='filter[maxPrice]']");

    SelenideElement filterByBrandButton = filterCollection.get(1);
    SelenideElement filterByBrandShowAll = $x("//fieldset[@aria-labelledby='filter-fieldset-label-brand']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterByBrandCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-brand']//div[@class='checkbox__text']");

    ElementsCollection filterValueItemsCheckbox = $$x("//div[@class='checkbox__text']");
    ElementsCollection filterValueMoreButtons = $$x("//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");

    SelenideElement filterBySupplierCountry = filterCollection.get(2);
    SelenideElement filterByGermanySupplier = $x("//div[contains(text(), 'Германия')]");
    SelenideElement filterByUSASupplier = $x("//div[contains(text(), 'США')]");
    SelenideElement filterByTurkeySupplier = $x("//div[contains(text(), 'Турция')]");

    SelenideElement filterByAvailability = filterCollection.get(3);

    SelenideElement filterBySizeButton = filterCollection.get(4);
    SelenideElement filterBySizeShowAllButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param2']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterBySizeCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-param2']//div[@class='checkbox__text']");

    SelenideElement filterByColorButton = filterCollection.get(5);
    SelenideElement filterByColorShowAllButton = $x("//fieldset[@aria-labelledby='filter-fieldset-label-param1']//button[@class='link link_default link_size_m link_dashed js-btn-show-all-desktop']");
    ElementsCollection filterByColorCheckbox = $$x("//fieldset[@aria-labelledby='filter-fieldset-label-param1']//div[@class='checkbox__text']");

    SelenideElement submitFilterButton = $x("//button[@class='btn btn_primary form-filter__btn-submit js-btn-submit']");


    // Изменили верстку сайта, сломался механизм отображения выбранных фильтров
    // SelenideElement checkFilterLabel =$x("//ul[@class='filter-tags-list rubrics-layout__filter-tags']//div[@class='tag-with-button__label']");

}
