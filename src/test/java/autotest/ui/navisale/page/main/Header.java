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
    SelenideElement headerSiteLogoButton = $x("//a[@title='На главную страницу']");
    SelenideElement headerSearchInput = $x("//input[@id='search-input']");
    SelenideElement headerSearchButton = $x("//button[@aria-label='Найти']");
    SelenideElement headerLoginUserButton = $x("//a[@aria-label='Войти в аккаунт']");
    SelenideElement headerShowSignInButton = $x("//a[@data-behaviour='show-signing']");
    SelenideElement headerInputPhone = $x("//input[@class='form-control form-control-lg']");
    SelenideElement headerGetCodeButton = $x("//div/button[@type='submit']");
    SelenideElement headerLoginWithPassword = $x("//div[@class='mb-3 text-muted']/a");
    SelenideElement headerInputEmail = $x("//input[@id='auth_register_email']");
    SelenideElement headerInputPassword = $x("//input[@id='auth_register_password']");
    SelenideElement headerBasketButton = $x("//a[@aria-label='Перейти в корзину']");
    SelenideElement headerForMen = $x("//div[@class=header__area-menu']//a[@title='Мужчинам']");
    SelenideElement headerForWoman = $x("//div[@class='header__area-menu']//a[@title='Женщинам']");
    SelenideElement headerShoes = $x("//div[@class='header__area-menu']//a[@title='Обувь']");
    SelenideElement headerBagsAndSuitcase = $x("//div[@'class=header__area-menu']//a[@title='Сумки и чемоданы']");
    SelenideElement headerAccessories = $x("//div[@class='header__area-menu']//a[@title='Аксессуары']");
    SelenideElement headerBrands = $x("//ul[@class='header-top-menu']//a[@title='Бренды']");
    SelenideElement headerFeedback = $x("//ul[@class='header-top-menu']//a[@title='Отзывы']");
    SelenideElement headerPayment = $x("//ul[@class='header-top-menu']//a[@title='Оплата']");
    SelenideElement headerDelivery = $x("//ul[@class='header-top-menu']//a[@title='Доставка']");
    SelenideElement headerRefund = $x("//ul[@class='header-top-menu']//a[@title='Гарантии и возврат']");
    SelenideElement headerHelp = $x("//ul[@class='header-top-menu']//a[@title='Помощь']");
}
