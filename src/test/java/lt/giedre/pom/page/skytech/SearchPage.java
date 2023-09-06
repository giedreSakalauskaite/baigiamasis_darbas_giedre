package lt.giedre.pom.page.skytech;

import lt.giedre.pom.page.Common;
import lt.giedre.pom.page.Locators;

import java.util.List;

public class SearchPage {
    public static void clickOnSearchFieldAndEnterText(String searchValue) {
        Common.sendKeysToField(
                Locators.Skytech.HomePage.searchField,
                searchValue
        );
    }

    public static void clickOnSearchButton() {
        Common.clickOnElement(
                Locators.Skytech.HomePage.searchButton
        );
    }

    public static Boolean checkSearchResult(List<String> searchingCriteria) {
        int countCriteria = 0;
        Common.waitForElements(Locators.Skytech.Search.productListing);
        List<String> searchResults = Common.getSearchResult(
                Locators.Skytech.Search.productListing);
        for (String searchResult : searchResults) {
            for (String criteria : searchingCriteria) {
                if (searchResult.contains(criteria)) {
                    break;
                }
                countCriteria++;
                if (countCriteria >= searchResults.size()) {
                    return false;
                }
            }
        }
        return true;
    }
}
