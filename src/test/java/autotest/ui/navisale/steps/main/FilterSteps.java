package autotest.ui.navisale.steps.main;

import autotest.ui.navisale.page.DefaultCategoryItemPage;
import autotest.ui.navisale.page.DefaultItemPage;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.fail;

@Component
public class FilterSteps {

    @Autowired
    DefaultCategoryItemPage defaultCategoryItemPage;

    @Autowired
    DefaultItemPage defaultItemPage;

    @DisplayName("Фильтр - сортировка по цвету")
    public void chooseColor(String color) {
        defaultCategoryItemPage.getFilterByColorButton().click();
        defaultCategoryItemPage.getFilterByColorShowAllButton().click();
        if (color.equalsIgnoreCase("grey") || color.equalsIgnoreCase("серый"))
            defaultCategoryItemPage.getFilterByColorCheckbox().findBy(Condition.text("серый")).click();
        else if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("красный")) {
            defaultCategoryItemPage.getFilterByColorCheckbox().findBy(Condition.text("красный")).click();
        } else if (color.equalsIgnoreCase("black") || color.equalsIgnoreCase("черный")) {
            defaultCategoryItemPage.getFilterByColorCheckbox().findBy(Condition.text("Черный")).click();
        } else if (color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("голубой")) {
            defaultCategoryItemPage.getFilterByColorCheckbox().findBy(Condition.text("Голубой")).click();
        } else if (color.equalsIgnoreCase("pink") || color.equalsIgnoreCase("розовый")) {
            defaultCategoryItemPage.getFilterByColorCheckbox().findBy(Condition.text("Розовый")).click();
        } else if (color.equalsIgnoreCase("white") || color.equalsIgnoreCase("белый")) {
            defaultCategoryItemPage.getFilterByColorCheckbox().findBy(Condition.text("Белый")).click();
        } else {
            fail("Use grey, red, black, blue, white or pink color");
        }


    }

    @DisplayName("Фильтр - сортировка по размеру")
    public void chooseSize(String size) {
        defaultCategoryItemPage.getFilterBySizeButton().click();
        defaultCategoryItemPage.getFilterBySizeShowAllButton().click();
        if (size.equals("S")) {
            defaultCategoryItemPage.getFilterBySizeCheckbox().findBy(Condition.text("S")).click();
        } else if (size.equalsIgnoreCase("M")) {
            defaultCategoryItemPage.getFilterBySizeCheckbox().findBy(Condition.text("M")).click();
        } else if (size.equalsIgnoreCase("L")) {
            defaultCategoryItemPage.getFilterBySizeCheckbox().findBy(Condition.text("L")).click();
        } else if (size.equalsIgnoreCase("XL")) {
            defaultCategoryItemPage.getFilterBySizeCheckbox().findBy(Condition.text("XL")).click();
        } else {
            fail("Use S, M, L or XL size");
        }
    }

    @DisplayName("Фильтр -  сортировка по бренду")
    public void chooseBrand(String brand) {
        defaultCategoryItemPage.getFilterByBrandButton().click();
        defaultCategoryItemPage.getFilterByBrandShowAll().click();
        if (brand.equalsIgnoreCase("Adidas")) {
            defaultCategoryItemPage.getFilterByBrandCheckbox().findBy(Condition.text("Adidas")).click();
        } else if (brand.equalsIgnoreCase("Nike")) {
            defaultCategoryItemPage.getFilterByBrandCheckbox().findBy(Condition.text("Nike")).click();
        } else if (brand.equalsIgnoreCase("Puma")) {
            defaultCategoryItemPage.getFilterByBrandCheckbox().findBy(Condition.text("Puma")).click();
        } else if (brand.equalsIgnoreCase("Lacoste")) {
            defaultCategoryItemPage.getFilterByBrandCheckbox().findBy(Condition.text("Lacoste")).click();
        } else if (brand.equalsIgnoreCase("Reebok")) {
            defaultCategoryItemPage.getFilterByBrandCheckbox().findBy(Condition.text("Reebok")).click();
        } else if (brand.equalsIgnoreCase("Zara")) {
            defaultCategoryItemPage.getFilterByBrandCheckbox().findBy(Condition.text("Zara")).click();
        } else {
            fail("Use Adidas, Nike, Puma, Lacoste, Reebok, Zara brand");
        }
    }

    public void chooseSupplierCountry(String country) {
        defaultCategoryItemPage.getFilterBySupplierCountry().click();
        if (country.equalsIgnoreCase("Германия")) {
            defaultCategoryItemPage.getFilterByGermanySupplier().click();
        } else if (country.equalsIgnoreCase("США")) {
            defaultCategoryItemPage.getFilterByUSASupplier().click();
        } else if (country.equalsIgnoreCase("Турция")) {
            defaultCategoryItemPage.getFilterByTurkeySupplier().click();
        } else {
            fail("Use Германия, США или Турция supplier country");
        }
    }


    public void submitFilters() {
        defaultCategoryItemPage.getSubmitFilterButton().click();
    }

}