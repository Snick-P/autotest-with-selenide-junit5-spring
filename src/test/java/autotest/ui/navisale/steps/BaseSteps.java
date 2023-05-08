package autotest.ui.navisale.steps;


import autotest.ui.navisale.page.BasketPage;
import autotest.ui.navisale.page.DefaultItemPage;
import autotest.ui.navisale.steps.main.FilterSteps;
import autotest.ui.navisale.steps.main.FooterSteps;
import autotest.ui.navisale.steps.main.HeaderSteps;
import autotest.ui.navisale.steps.main.WidgetSteps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseSteps extends BasketPage {

    @Autowired
    protected BasketSteps basketSteps;
    @Autowired
    protected DefaultCategoryItemsSteps defaultCategoryItemsSteps;
    @Autowired
    protected DefaultItemSteps defaultItemSteps;
    @Autowired
    protected MainSteps mainSteps;
    @Autowired
    protected FilterSteps filterSteps;
    @Autowired
    protected FooterSteps footerSteps;
    @Autowired
    protected HeaderSteps headerSteps;
    @Autowired
    protected WidgetSteps widgetSteps;
    @Autowired
    protected DefaultItemPage defaultItemPage;

}
