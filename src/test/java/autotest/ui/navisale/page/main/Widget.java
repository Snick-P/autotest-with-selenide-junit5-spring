package autotest.ui.navisale.page.main;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$x;

@Getter
@Component
public class Widget {

    SelenideElement catalogForm = $x("//a[@id='rubrics-toggle']");
    SelenideElement forMen = $x("//div[@data-selector='rubrics']//a[@title='Мужчинам']");
    SelenideElement menUnderwear = $x("//div[@data-idx='0']//ul/li[1]");
    SelenideElement menTrousers = $x("//div[@data-idx='0']//ul/li[2]");
    SelenideElement menJeans = $x("//div[@data-idx='0']//ul/li[3]");
    SelenideElement menOuterwear = $x("//div[@data-idx='0']//ul/li[4]");
    SelenideElement menVest = $x("//div[@data-idx='0']//ul/li[5]");
    SelenideElement menCostumes = $x("//div[@data-idx='0']//ul/li[6]");
    SelenideElement menJacket = $x("//div[@data-idx='0']//ul/li[7]");
    SelenideElement menShirt = $x("//div[@data-idx='0']//ul/li[8]");
    SelenideElement menSweater = $x("//div[@data-idx='0']//ul/li[9]");
    SelenideElement menSportswear = $x("//div[@data-idx='0']//ul/li[10]");
    SelenideElement menHoodie = $x("//div[@data-idx='0']//ul/li[11]");
    SelenideElement menTshirt = $x("//div[@data-idx='0']//ul/li[12]");
    SelenideElement menShorts = $x("//div[@data-idx='0']//ul/li[13]");
    SelenideElement menBags = $x("//div[@data-idx='0']//ul/li[14]");
    SelenideElement menAccessory = $x("//div[@data-idx='0']//ul/li[15]");

    SelenideElement forWoman = $x("//div[@data-selector='rubrics']//a[@title='Женщинам']");
    SelenideElement womanUnderwear = $x("//div[@data-idx='1']//ul/li[1]");
    SelenideElement womanBlouse = $x("//div[@data-idx='1']//ul/li[2]");
    SelenideElement womanTrousers = $x("//div[@data-idx='1']//ul/li[3]");
    SelenideElement womanOuterwear = $x("//div[@data-idx='1']//ul/li[4]");
    SelenideElement womanJeans = $x("//div[@data-idx='1']//ul/li[5]");
    SelenideElement womanHomeClothes = $x("//div[@data-idx='1']//ul/li[6]");
    SelenideElement womanVest = $x("//div[@data-idx='1']//ul/li[7]");
    SelenideElement womanBreeches = $x("//div[@data-idx='1']//ul/li[8]");
    SelenideElement womanJumpsuit = $x("//div[@data-idx='1']//ul/li[9]");
    SelenideElement womanLongsleeve = $x("//div[@data-idx='1']//ul/li[10]");
    SelenideElement womanJacket = $x("//div[@data-idx='1']//ul/li[11]");
    SelenideElement womanDress = $x("//div[@data-idx='1']//ul/li[12]");
    SelenideElement womanShirt = $x("//div[@data-idx='1']//ul/li[13]");
    SelenideElement womanCostumes = $x("//div[@data-idx='1']//ul/li[14]");
    SelenideElement womanSweater = $x("//div[@data-idx='1']//ul/li[15]");
    SelenideElement womanSportswear = $x("//div[@data-idx='1']//ul/li[16]");
    SelenideElement womanHoodie = $x("//div[@data-idx='1']//ul/li[17]");
    SelenideElement womanTshirt = $x("//div[@data-idx='1']//ul/li[18]");
    SelenideElement womanShorts = $x("//div[@data-idx='1']//ul/li[19]");
    SelenideElement womanSkirt = $x("//div[@data-idx='1']//ul/li[20]");
    SelenideElement womanMaternityClothes = $x("//div[@data-idx='1']//ul/li[21]");
    SelenideElement womanBags = $x("//div[@data-idx='1']//ul/li[22]");
    SelenideElement womanAccessory = $x("//div[@data-idx='1']//ul/li[23]");

    SelenideElement shoes = $x("//div[@data-selector='rubrics']//a[@title='Обувь']");
    SelenideElement shoesForMen = $x("//div[@data-idx='2']//ul/li[1]");
    SelenideElement shoesForWoman = $x("//div[@data-idx='2']//ul/li[2]");

    SelenideElement bagsAndSuitcase = $x("//a[@title='Сумки и чемоданы' and @data-action='sidebar-link']");
    SelenideElement bags = $x("//div[@data-idx='3']//ul/li[1]");
    SelenideElement suitcase = $x("//div[@data-idx='3']//ul/li[2]");
    SelenideElement travelBags = $x("//div[@data-idx='3']//ul/li[3]");
    SelenideElement backpack = $x("//div[@data-idx='3']//ul/li[4]");
    SelenideElement briefcase = $x("//div[@data-idx='3']//ul/li[5]");
    SelenideElement cosmeticBag = $x("//div[@data-idx='3']//ul/li[6]");
    SelenideElement laptopBag = $x("//div[@data-idx='3']//ul/li[7]");

    SelenideElement accessories = $x("//a[@title='Аксессуары' and @data-action='sidebar-link']");
    SelenideElement watch = $x("//div[@data-idx='4']//ul/li[1]");
    SelenideElement jewelry = $x("//div[@data-idx='4']//ul/li[2]");
    SelenideElement wallet = $x("//div[@data-idx='4']//ul/li[3]");
    SelenideElement umbrella = $x("//div[@data-idx='4']//ul/li[4]");
    SelenideElement glasses = $x("//div[@data-idx='4']//ul/li[5]");
    SelenideElement belt = $x("//div[@data-idx='4']//ul/li[6]");
    SelenideElement tie = $x("//div[@data-idx='4']//ul/li[7]");
    SelenideElement carnivalCostume = $x("//div[@data-idx='4']//ul/li[8]");
    SelenideElement keychain = $x("//div[@data-idx='4']//ul/li[9]");
    SelenideElement businessCardHolder = $x("//div[@data-idx='4']//ul/li[10]");
    SelenideElement cover = $x("//div[@data-idx='4']//ul/li[11]");
    SelenideElement accBags = $x("//div[@data-idx='4']//ul/li[12]");
    SelenideElement adornment = $x("//div[@data-idx='4']//ul/li[13]");
    SelenideElement topItem = $x("//div[@data-idx='4']//ul/li[14]");

    SelenideElement zara = $x("//a[@title='Zara' and @data-action='sidebar-link']");
    SelenideElement zaraForWoman = $x("//div[@data-idx='5']//ul/li[1]");
    SelenideElement zaraForMen = $x("//div[@data-idx='5']//ul/li[2]");
    SelenideElement zaraForKids = $x("//div[@data-idx='5']//ul/li[3]");
    SelenideElement zaraBeauty = $x("//div[@data-idx='5']//ul/li[4]");

}
