package autotest.ui.navisale.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
@Component
public class MainPage {

ElementsCollection changeBannerCategoryCollection = $$x("//a[contains(@class, 'carousel-promotion')]");

SelenideElement searchInput = $x("//input"),
searchResult = $x("//div[@class='rubrics-layout__content']/div");



}
