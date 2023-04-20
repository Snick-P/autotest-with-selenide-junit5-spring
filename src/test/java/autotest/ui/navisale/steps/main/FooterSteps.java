package autotest.ui.navisale.steps.main;


import autotest.ui.navisale.page.main.Footer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooterSteps {

    @Autowired
    private Footer footer;

    public void goToContactInfo(){
        footer.getFooterContactInfo().click();
    }

    public void goToLegalInfo(){
        footer.getFooterLegalInfo().click();
    }

    public void goToOffer(){
        footer.getFooterOffer().click();
    }

    public void goToBrands(){
        footer.getFooterBrands().click();
    }

    public void goToPayment(){
        footer.getFooterPayment().click();
    }

    public void goToDelivery(){
        footer.getFooterDelivery().click();
    }

    public void goToSupport(){
        footer.getFooterSupport().click();
    }

    public void goToTrack(){
        footer.getFooterTrack().click();
    }

    public void goToFeedback(){
        footer.getFooterFeedback().click();
    }

    public void goToEmail(){
        footer.getFooterEmailButton().click();
    }

    public void goToInstagram(){
        footer.getFooterInstagramButton().click();
    }

    public void goToVK(){
        footer.getFooterVKButton().click();
    }

    public void goToTg(){
        footer.getFooterTgButton().click();
    }




}
