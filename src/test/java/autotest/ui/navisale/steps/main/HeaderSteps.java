package autotest.ui.navisale.steps.main;


import autotest.ui.navisale.page.main.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HeaderSteps {

    @Autowired
    private Header header;

    public void goToSiteLogoButton(){
        header.getHeaderSiteLogoButton().click();
    }

    public void searchInput(){
        header.getHeaderSearchButton().click();
    }

    public void searchButton(){
        header.getHeaderSearchButton().click();
    }

    public void loginButton (){
        header.getHeaderLoginUserButton().click();
    }

    public void inputPhone(){
        header.getHeaderInputPhone().click();
    }

    public void loginWithPassword(){
        header.getHeaderLoginWithPassword().click();
    }

    public void inputEmail(){
        header.getHeaderInputEmail().click();
    }

    public void inputPassword(){
        header.getHeaderInputPassword().click();
    }

    public void goToBasket(){
        header.getHeaderBasketButton().click();
    }

    public void goToForMen(){
        header.getHeaderForMen().click();
    }

    public void goToForWoman(){
        header.getHeaderForWoman().click();
    }

    public void goToShoes(){
        header.getHeaderShoes().click();
    }

    public void goToBagsAndSuitcase(){
        header.getHeaderBagsAndSuitcase().click();
    }

    public void goToAccessory(){
        header.getHeaderAccessories().click();
    }

    public void goToBrands(){
        header.getHeaderBrands().click();
    }

    public void goToFeedback(){
        header.getHeaderFeedback().click();
    }

    public void goToPayment(){
        header.getHeaderPayment().click();
    }

    public void goToDelivery(){
        header.getHeaderDelivery().click();
    }

    public void goToRefund(){
        header.getHeaderRefund().click();
    }

    public void goToHelp(){
        header.getHeaderHelp().click();
    }

}
