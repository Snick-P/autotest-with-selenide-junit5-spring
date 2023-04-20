package autotest.ui.navisale.page;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$$x;

@Getter
@Component
public class MainPage {

ElementsCollection changeBannerCategoryCollection = $$x("//a[contains(@class, 'carousel-promotion')]");


}
