package autotest.ui.navisale.page.main;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;

@Getter
@Component
public class Footer {

    SelenideElement footerSiteLogoButton = $x("//div[@class='footer__area-logo']/img");

    //выполнить через List Collection
    SelenideElement footerContactInfo = $x("//div[@data-menu-idx='0']//ul[@class='footer-menu__list']/li[1]");
    SelenideElement footerLegalInfo = $x("//div[@data-menu-idx='0']//ul[@class='footer-menu__list']/li[2]");
    SelenideElement footerOffer = $x("//div[@data-menu-idx='0']//ul[@class='footer-menu__list']/li[3]");

    SelenideElement footerBrands = $x("//div[@data-menu-idx='1']//ul[@class='footer-menu__list']/li[1]");
    SelenideElement footerPayment = $x("//div[@data-menu-idx='1']//ul[@class='footer-menu__list']/li[2]");
    SelenideElement footerDelivery = $x("//div[@data-menu-idx='1']//ul[@class='footer-menu__list']/li[3]");

    SelenideElement footerSupport = $x("//div[@data-menu-idx='2']//ul[@class='footer-menu__list']/li[1]");
    SelenideElement footerTrack = $x("//div[@data-menu-idx='2']//ul[@class='footer-menu__list']/li[2]");
    SelenideElement footerFeedback = $x("//div[@data-menu-idx='2']//ul[@class='footer-menu__list']/li[3]");

    SelenideElement footerEmailButton = $x("//a[@title='Написать нам']");
    SelenideElement footerInstagramButton = $x("//a[@title='Navisale.ru в Instagram']");
    SelenideElement footerVKButton = $x("//a[@title='Navisale.ru во ВКонтакте']");
    SelenideElement footerTgButton = $x("//a[@title='Navisale.ru в Telegram']");

}
