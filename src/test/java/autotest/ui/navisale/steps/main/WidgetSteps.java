package autotest.ui.navisale.steps.main;


import autotest.ui.navisale.page.main.Widget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.sleep;

@Component
public class WidgetSteps {

    @Autowired
    private Widget widget;

    public void goToMenCategory() {
        widget.getCatalogForm().click();
        widget.getForMen().hover();
        sleep(150);
    }

    public void goToMenUnderwear() {
        goToMenCategory();
        widget.getMenUnderwear().click();
    }

    public void goToMenTrousers() {
        goToMenCategory();
        widget.getMenTrousers().click();
    }

    public void goToMenJeans() {
        goToMenCategory();
        widget.getMenJeans().click();
    }

    public void goToMenOutwear() {
        goToMenCategory();
        widget.getMenOuterwear().click();
    }

    public void goToMenVest() {
        goToMenCategory();
        widget.getMenVest().click();
    }

    public void goToMenCostumes() {
        goToMenCategory();
        widget.getMenCostumes().click();
    }

    public void goToMenJacket() {
        goToMenCategory();
        widget.getMenJacket().click();
    }

    public void goToMenShirt() {
        goToMenCategory();
        widget.getMenShirt().click();
    }

    public void goToMenSweater() {
        goToMenCategory();
        widget.getMenSweater().click();
    }

    public void goToMenSportswear() {
        goToMenCategory();
        widget.getMenSportswear().click();
    }

    public void goToMenHoodie() {
        goToMenCategory();
        widget.getMenHoodie().click();
    }

    public void goToMenTshirt() {
        goToMenCategory();
        widget.getMenTshirt().click();
    }

    public void goToMenShorts() {
        goToMenCategory();
        widget.getMenShorts().click();
    }

    public void goToMenBags() {
        goToMenCategory();
        widget.getBags().click();
    }

    public void goToMenAccessory() {
        goToMenCategory();
        widget.getMenAccessory().click();
    }


    public void goToWomanCategory() {
        widget.getCatalogForm().click();
        widget.getForWoman().hover();
        sleep(150);
    }

    public void goToWomanUnderwear() {
        goToWomanCategory();
        widget.getWomanUnderwear().click();
    }

    public void goToWomanBlouse() {
        goToWomanCategory();
        widget.getWomanBlouse().click();
    }

    public void goToWomanTrousers() {
        goToWomanCategory();
        widget.getWomanTrousers().click();
    }

    public void goToWomanOuterwear() {
        goToWomanCategory();
        widget.getWomanOuterwear().click();
    }

    public void goToWomanJeans() {
        goToWomanCategory();
        widget.getWomanJeans().click();
    }

    public void goToWomanHomeClothes() {
        goToWomanCategory();
        widget.getWomanHomeClothes().click();
    }

    public void goToWomanVest() {
        goToWomanCategory();
        widget.getWomanVest().click();
    }

    public void goToWomanBreeches() {
        goToWomanCategory();
        widget.getWomanBreeches().click();
    }

    public void goToWomanJumpsuit() {
        goToWomanCategory();
        widget.getWomanJumpsuit().click();
    }

    public void goToWomanLongsleeve() {
        goToWomanCategory();
        widget.getWomanLongsleeve().click();
    }

    public void goToWomanJacket() {
        goToWomanCategory();
        widget.getWomanJacket().click();
    }

    public void goToWomanDress() {
        goToWomanCategory();
        widget.getWomanDress().click();
    }

    public void goToWomanShirt() {
        goToWomanCategory();
        widget.getWomanShirt().click();
    }

    public void goToWomanCostumes() {
        goToWomanCategory();
        widget.getWomanCostumes().click();
    }

    public void goToWomanSweater() {
        goToWomanCategory();
        widget.getWomanSweater().click();
    }

    public void goToWomanSportswear() {
        goToWomanCategory();
        widget.getWomanSportswear().click();
    }

    public void goToWomanHoodie() {
        goToWomanCategory();
        widget.getWomanHoodie().click();
    }

    public void goToWomanTshirt() {
        goToWomanCategory();
        widget.getWomanTshirt().click();
    }

    public void goToWomanShorts() {
        goToWomanCategory();
        widget.getWomanShorts().click();
    }

    public void goToWomanSkirt() {
        goToWomanCategory();
        widget.getWomanSkirt().click();
    }

    public void goToWomanMaternityClothes() {
        goToWomanCategory();
        widget.getWomanMaternityClothes().click();
    }

    public void goToWomanBags() {
        goToWomanCategory();
        widget.getWomanBags().click();
    }

    public void goToWomanAccessory() {
        goToWomanCategory();
        widget.getAccessories().click();
    }

    public void goToShoes() {
        widget.getCatalogForm().click();
        widget.getShoes().hover();
        sleep(150);
    }

    public void goToShoesForMen() {
        goToShoes();
        widget.getShoesForMen().click();
    }

    public void goToShoesForWoman() {
        goToShoes();
        widget.getShoesForWoman().click();
    }

    public void goToBagsAndSuitcase() {
        widget.getCatalogForm().click();
        widget.getBagsAndSuitcase().hover();
        sleep(150);
    }

    public void goToBags() {
        goToBagsAndSuitcase();
        widget.getBags().click();
    }

    public void goToSuitcase() {
        goToBags();
        widget.getSuitcase().click();
    }

    public void goToTravelBags() {
        goToBags();
        widget.getTravelBags().click();
    }

    public void goToBackpack() {
        goToBags();
        widget.getBackpack().click();
    }

    public void goToBriefcase() {
        goToBags();
        widget.getBriefcase().click();
    }

    public void goToCosmeticBag() {
        goToBags();
        widget.getCosmeticBag().click();
    }

    public void goToLaptopsBag() {
        goToBags();
        widget.getLaptopBag().click();
    }

    public void goToAccessory() {
        widget.getCatalogForm().click();
        widget.getAccessories().hover();
        sleep(150);
    }

    public void goToWatch() {
        goToAccessory();
        widget.getWatch().click();
    }

    public void goToJewelry() {
        goToAccessory();
        widget.getJewelry().click();
    }

    public void goToWallet() {
        goToAccessory();
        widget.getWallet().click();
    }

    public void goToUmbrella() {
        goToAccessory();
        widget.getUmbrella().click();
    }

    public void goToGlasses() {
        goToAccessory();
        widget.getGlasses().click();
    }

    public void goToBelt() {
        goToAccessory();
        widget.getBelt().click();
    }

    public void goToTie() {
        goToAccessory();
        widget.getTie().click();
    }

    public void goToCarnivalCostumes() {
        goToAccessory();
        widget.getCarnivalCostume().click();
    }

    public void goToKeychain() {
        goToAccessory();
        widget.getKeychain().click();
    }

    public void goToBusinessCardHolder() {
        goToAccessory();
        widget.getBusinessCardHolder().click();
    }

    public void goToCover() {
        goToAccessory();
        widget.getCover().click();
    }

    public void goToAccBags() {
        goToAccessory();
        widget.getAccBags().click();
    }

    public void goToAdornment() {
        goToAccessory();
        widget.getAdornment().click();
    }

    public void goToTopItems() {
        goToAccessory();
        widget.getTopItem().click();
    }

    public void goToZara() {
        widget.getCatalogForm().click();
        widget.getZara().hover();
        sleep(150);
    }

    public void goToZaraForWoman() {
        goToZara();
        widget.getZaraForWoman().click();
    }

    public void goToZaraForMen() {
        goToZara();
        widget.getZaraForMen().click();
    }

    public void goToZaraForKids() {
        goToZara();
        widget.getZaraForKids().click();
    }

    public void goToZaraBeauty() {
        goToZara();
        widget.getZaraBeauty().click();
    }

}
