package autotest.ui.navisale.steps;

import autotest.ui.navisale.page.MainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainSteps {

    @Autowired
    MainPage mainPage;


    public void search(String request) {
        mainPage.getSearchInput().click();
        mainPage.getSearchInput().setValue(request);
        mainPage.getSearchInput().pressEnter();
    }

}
