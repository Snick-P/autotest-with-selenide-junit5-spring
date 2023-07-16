package autotest.ui.navisale.test;

import autotest.ui.navisale.config.SpringConfig;
import autotest.ui.navisale.helpers.AllureAttachments;
import autotest.ui.navisale.helpers.DriverUtils;
import autotest.ui.navisale.steps.BaseSteps;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Execution(ExecutionMode.SAME_THREAD)
@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = {SpringConfig.class})
@RequiredArgsConstructor

public class NavisaleTest extends BaseSteps {

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        chromedriver().setup();
        browser = "chrome";
        browserSize = "1920x1080";
        baseUrl = "https://stocks.navisale.ru/";
        headless = true;
    }


    @AfterEach
    public void addAttachments() {
        AllureAttachments.addScreenshotsAs("Last screenshot");
        AllureAttachments.addBrowserConsoleLogs();
        AllureAttachments.addPageSource();
        closeWebDriver();
    }


    @DisplayName("Переходы -> категория - сортировка товара по скидке - добавление в корзину")
    @Owner("snproskuryakov")
    @Tag("navisale")
    @Test
    void case1() {
        step("Переход на базовую страницу", () -> open(baseUrl));
        step("Переход в категорию для мужчин", () -> widgetSteps.goToMenCategory());
        step("Сортировка по размеру скидки", () -> defaultCategoryItemsSteps.chooseFirstDiscount());
        step("Выбор первого товара из списка", () -> defaultCategoryItemsSteps.getFirstItem());
        step("Добавление товара в корзину", () -> defaultItemSteps.addItemToBasket());
        step("Переход в корзину", () -> headerSteps.goToBasket());
    }


    @DisplayName("Проверка фильтра страна-поставщик")
    @Owner("snproskuryakov")
    @Tag("navisale")
    @ParameterizedTest
    @CsvSource(textBlock = """
            Германия ; Германии ;
            США ; США ;
            Турция ; Турции
            """,
            delimiter = ';')
    void case2(String country, String countryAssert) {
        step("Переход на базовую страницу", () -> open(baseUrl));
        step("Переход в категорию для мужчин", () -> widgetSteps.goToMenCategory());
        step("Выбор фильтра по стране-поставщика", () -> filterSteps.chooseSupplierCountry(country));
        step("Подтвердить выбранные фильтры", () -> filterSteps.submitFilters());
        step("Выбор первого товара из списка", () -> defaultCategoryItemsSteps.getFirstItem());
        step("Проверка соответствия страны поставщика", () -> assertThat(defaultItemPage.getParameters().toString()).contains(countryAssert));
    }

    @DisplayName("Проверка фильтра бренд")
    @Owner("snproskuryakov")
    @Tag("navisale")
    @ParameterizedTest
    @CsvSource(textBlock = """
            Nike ;
            Adidas ;
            ZARA ;
            """, delimiter = ';')
    void case3(String brand) {
        step("Переход на базовую страницу", () -> open(baseUrl));
        step("Переход в категорию для мужчин", () -> widgetSteps.goToMenCategory());
        step("Выбор фильтра по бренду", () -> filterSteps.chooseBrand(brand));
        step("Подтвердить выбранные фильтры", () -> filterSteps.submitFilters());
        step("Выбор первого товара из списка", () -> defaultCategoryItemsSteps.getFirstItem());
        step("Проверка соответствия бренда", () -> assertThat(defaultItemPage.getProductBrandButton().toString()).containsIgnoringCase(brand));
    }


    @DisplayName("Проверка ошибок в консоли")
    @Owner("snproskuryakov")
    @Tag("navisale")
    @Test
    void case4() {
        step("Переход на базовую страницу", () -> open(baseUrl));
        step("Проверка отсутствия ошибок в консоли с текстом SEVERE", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";
            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @DisplayName("Проверка невалидного запроса")
    @Owner("snproskuryakov")
    @Tag("navisale")
    @Test
    void case5() {
        step("Переход на базовую страницу", () -> open(baseUrl));
        step("Поисковой запрос", () -> mainSteps.search("asdadafafgsa"));
        step("Проверка результатов поиска", () ->
                assertThat(mainPage.getSearchResult().toString()).contains("Товары не найдены"));


    }


}
