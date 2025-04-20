package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class useTechMainPage {
    public static useTechMainPage openPage() {
        open("https://usetech.ru/");
        return new useTechMainPage();
    }

    private final SelenideElement menuButton = $("#mobile-nav-toggle"),
            news = $("#menu-item-452"),
            contacts = $("#menu-item-203"),
            products = $("#menu-item-1081"),
            awards = $("#menu-item-418");

    public useTechMainPage menuButton() {
        this.menuButton.click();
        return this;
    }
    public useTechMainPage headerContainer(int containerSize) {
        $$x("//div//nav[@id='nav-menu-container']//li")
                .shouldHave(CollectionCondition.size(containerSize));
        return this;
    }

    public useTechMainPage news(String value) {
        this.news.click();
        $x("//div//h1").shouldHave(text(value));
        return this;
    }

    public useTechMainPage contacts(String value) {
        this.contacts.click();
        $x("//div//h1").shouldHave(text(value));
        return this;
    }

    public useTechMainPage products(String value) {
        this.products.click();
        $x("//section[@id='products']//div[@id='sectionAnnotation']").shouldHave(text(value));
        return this;
    }

    public useTechMainPage awards(String value) {
        this.awards.click();
        $x("//div//h1").shouldHave(text(value));
        return this;
    }

}
