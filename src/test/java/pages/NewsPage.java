package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class NewsPage {
    public NewsPage checkNewsTextTest(String value) {
        $x("//div//h1").shouldHave(text(value));
        return this;
    }
}
