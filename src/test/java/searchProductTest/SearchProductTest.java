package searchProductTest;

import baseTest.BaseTest;
import org.junit.Test;

public class SearchProductTest extends BaseTest {
    @Test
    public void searchProduct(){
        searchPage.openSearchPage();
        searchPage.closePromotion();
        searchPage.clickOnButtonSearch();
        searchPage.enterProduct("bags");
        searchPage.clickOnLupa();







    }

}
