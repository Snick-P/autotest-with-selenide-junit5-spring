package autotest.ui.navisale.page.main;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
@Component
public class Header {

    ElementsCollection headerCategoryColletion = $$x("//li[@class='header-menu__item js-main-menu-item']");
    SelenideElement
    headerSiteLogoButton = $x("//a[@title='На главную страницу']"),
    headerSearchInput = $x("//input[@id='search-input']"),
    headerSearchButton = $x("//button[@aria-label='Найти']"),
    headerLoginUserButton = $x("//a[@aria-label='Войти в аккаунт']"),
    headerShowSignInButton = $x("//a[@data-behaviour='show-signing']"),
    headerInputPhone = $x("//input[@class='form-control form-control-lg']"),
    headerGetCodeButton = $x("//div/button[@type='submit']"),
    headerLoginWithPassword = $x("//div[@class='mb-3 text-muted']/a"),
    headerInputEmail = $x("//input[@id='auth_register_email']"),
    headerInputPassword = $x("//input[@id='auth_register_password']"),
    headerBasketButton = $x("//a[@class='btn btn_size_s btn_default notifications__link']");
//    headerBasketButton = $x("//a[@aria-label='Перейти в корзину']");

    SelenideElement
    headerForMen = $x("//div[@class=header__area-menu']//a[@title='Мужчинам']"),
    headerForWoman = $x("//div[@class='header__area-menu']//a[@title='Женщинам']"),
    headerShoes = $x("//div[@class='header__area-menu']//a[@title='Обувь']"),
    headerBagsAndSuitcase = $x("//div[@'class=header__area-menu']//a[@title='Сумки и чемоданы']"),
    headerAccessories = $x("//div[@class='header__area-menu']//a[@title='Аксессуары']"),
    headerBrands = $x("//ul[@class='header-top-menu']//a[@title='Бренды']"),
    headerFeedback = $x("//ul[@class='header-top-menu']//a[@title='Отзывы']"),
    headerPayment = $x("//ul[@class='header-top-menu']//a[@title='Оплата']"),
    headerDelivery = $x("//ul[@class='header-top-menu']//a[@title='Доставка']"),
    headerRefund = $x("//ul[@class='header-top-menu']//a[@title='Гарантии и возврат']"),
    headerHelp = $x("//ul[@class='header-top-menu']//a[@title='Помощь']");
}
