package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    public ProductsPage checkProductTextTest(String value) {
        $x("//section[@id='products']//div[@id='sectionAnnotation']").shouldHave(text(value));
        return this;
    }
}
