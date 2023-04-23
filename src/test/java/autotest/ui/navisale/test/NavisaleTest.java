package autotest.ui.navisale.test;

import autotest.ui.navisale.config.SpringConfig;
import autotest.ui.navisale.steps.BaseSteps;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

@Execution(ExecutionMode.SAME_THREAD)
@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = {SpringConfig.class})
@RequiredArgsConstructor

public class NavisaleTest extends BaseSteps {

    public void setUp(){
        chromedriver().setup();
        browser = "chrome";
        browserSize = "1920x1080";
        headless = false;
    }

    @BeforeEach
    public void init(){setUp();}

    @BeforeEach
    public void openSite(){open("https://stocks.navisale.ru/");}

    @AfterEach
    public void cleaningUp(){
        headerSteps.goToBasket();
        basketSteps.deleteAllItems();
        closeWebDriver();}

    @DisplayName("Переходы -> категория - сортировка товара по скидке - добавление в корзину ")
    @Test
    void case1 (){
        widgetSteps.goToMenCategory();
        defaultCategoryItemsSteps.chooseFirstDiscount();
        defaultCategoryItemsSteps.getFirstItem();
        defaultItemSteps.addItemToBasket();
        headerSteps.goToBasket();
    }


}
