package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class MainUseTechPage {
    public static MainUseTechPage openPage() {
        open("https://usetech.ru/");
        return new MainUseTechPage();
    }

    private final SelenideElement news = $("#menu-item-452"),
            contacts = $("#menu-item-203"),
            products = $("#menu-item-1081"),
            awards = $("#menu-item-418");

    public void headerContainer(int containerSize) {
        $$x("//div//nav[@id='nav-menu-container']//li")
                .shouldHave(CollectionCondition.size(containerSize));
    }

    public void news() {
        this.news.click();
    }

    public void contacts() {
        this.contacts.click();
    }

    public void products() {
        this.products.click();
    }

    public void awards() {
        this.awards.click();
    }

}
