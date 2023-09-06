package lt.giedre.pom.page;

import org.openqa.selenium.By;

public class Locators {
    public static class Skytech {
        public static class HomePage {
            public static By linkLogin = By.xpath(
                    "//div[@class='topmenu-login-panel'] //a[@class='link-login']");
            public static By myAccount = By.xpath("//a[contains(text(), 'Mano paskyra')]");
            public static By editIcon = By.xpath(
                    "//div[@class='edit-icon' and contains(text(),'Redaguoti')]");
            public static By sendLastName = By.xpath("//input[@name='data[lastname]']");
            public static By save = By.xpath("//div[@class='form-wrapper'] //input[@value='Išsaugoti']");
            public static By checkingLastName = By.xpath(
                    "//div[@class=\"info-wrapper\"]//span[@data-field='lastname']");
            public static By searchField = By.xpath("//input[@class='search-field inactive']");
            public static By searchButton = By.xpath("//input[@class='search-button']");
        }

        public static class LogIn {

            public static By emailAdress = By.xpath(
                    "//input[@name='email_address']");
            public static By password = By.xpath("//input[@name='password']");
            public static By userLogin = By.xpath("//input[@value='Prisijungti']");
            public static By loginError = By.xpath("//div[@class='login-error']");
        }

        public static class Search {

            public static By productListing = By.xpath("//table[@class='productListing']//tr[@class]");
        }

        public static class Cart {
            public static By cartIcon = By.xpath("//input[@class='icon-cart']");
            public static By cartText = By.xpath(
                    "//span[@class='text' and contains(text(), 'Krepšelyje yra ')]");
            public static By removeIcon = By.xpath("//a[@class='remove-icon']");
            public static By itemIsRemoved = By.xpath(
                    "//span[@class='text' and contains(text(), 'Krepšelis yra tuščias')]");
        }
    }
}
