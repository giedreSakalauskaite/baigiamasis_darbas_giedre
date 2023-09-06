package lt.giedre.pom.test.skytech;

import lt.giedre.pom.page.skytech.LoginPage;
import lt.giedre.pom.page.skytech.SearchPage;
import lt.giedre.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SearchTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openWithCorrectUserLogin();
    }

    @Test
    public void SearchingForItem() {
        String searchValue = "spausdintuvas fujifilm";
        List<String> searchingCriteria = Arrays.asList("spausdintuvas", "fujifilm");
        Boolean actualResult;
        SearchPage.clickOnSearchFieldAndEnterText(searchValue);
        SearchPage.clickOnSearchButton();
        actualResult = SearchPage.checkSearchResult(searchingCriteria);
        Assert.assertTrue(actualResult);
    }
}
