package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class MainUseTechPage {
    public static MainUseTechPage openPage() {
        open("https://usetech.ru/");
        return new MainUseTechPage();
    }

    private final SelenideElement menuButton = $("#mobile-nav-toggle"),
            news = $("#menu-item-452"),
            contacts = $("#menu-item-203"),
            products = $("#menu-item-1081"),
            awards = $("#menu-item-418");

    public MainUseTechPage menuButton() {
        this.menuButton.click();
        return this;
    }
    public MainUseTechPage headerContainer(int containerSize) {
        $$x("//div//nav[@id='nav-menu-container']//li")
                .shouldHave(CollectionCondition.size(containerSize));
        return this;
    }

    public MainUseTechPage news() {
        this.news.click();
        return this;
    }

    public MainUseTechPage contacts() {
        this.contacts.click();
        return this;
    }

    public MainUseTechPage products() {
        this.products.click();
        return this;
    }

    public MainUseTechPage awards() {
        this.awards.click();
        return this;
    }

}
