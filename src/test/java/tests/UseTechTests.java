package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("UseTech")
public class UseTechTests extends TestBase {
    @Test
    @DisplayName("Проверяем количество кнопок в header меню")
    void startPageCheckHeaderContainerTest() {
        MainUseTechPage.openPage()
                .headerContainer(9);
    }

    @Test
    @DisplayName("Открываем страницу Новости и видим заголовок Новости")
    void newsPageTest() {
        MainUseTechPage.openPage()
                .news();
                new NewsPage().checkNewsTextTest("Новости");
    }

    @Test
    @DisplayName("Открываем страницу Контакты и проверяем заголовок Контакты")
    void contactsPageTest() {
        MainUseTechPage.openPage()
                .contacts();
                new ContactsPage().checkContactTextTest("Контакты");
    }

    @Test
    @DisplayName("Открываем страницу Продукты и видим в заголовках Продукты")
    void productsPageTest() {
        MainUseTechPage.openPage()
                .products();
        new ProductsPage().checkProductTextTest("Продукты");
    }

    @Test
    @DisplayName("Открываем страницу Награды и видим в заголовках Награды")
    void awardsPageTest() {
        MainUseTechPage.openPage()
                .awards();
        new AwardsPage().checkAwardsTextTest("Награды");
    }

}
