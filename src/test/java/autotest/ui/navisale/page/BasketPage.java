package autotest.ui.navisale.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
@Component

public class BasketPage {

    ElementsCollection deleteAllItem = $$x("//li[@class='item delete']");
    ElementsCollection value = $$x("//option[@value]");
    SelenideElement submitButton = $x("//div[@class='payment']//button[@type='submit']");



}
