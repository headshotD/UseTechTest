package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("UseTech")
public class UseTechTests extends TestBase {

    private AwardsPage awardsPage;
    private ContactsPage contactsPage;
    private NewsPage newsPage;
    private ProductsPage productsPage;
    private static final int HEADER_BUTTONS_COUNT = 9;

    @BeforeEach
    public void setUp() {

        MainUseTechPage.openPage();
        newsPage = new NewsPage();
        contactsPage = new ContactsPage();
        productsPage = new ProductsPage();
        awardsPage = new AwardsPage();
    }

    @Test
    @DisplayName("Проверяем количество кнопок в header меню")
    void startPageCheckHeaderContainerTest() {
        MainUseTechPage.openPage()
                .headerContainer(HEADER_BUTTONS_COUNT);
    }

    @Test
    @DisplayName("Открываем страницу Новости и видим заголовок Новости")
    void newsPageTest() {
        MainUseTechPage.openPage()
                .news();
        newsPage.checkNewsTextTest("Новости");
    }

    @Test
    @DisplayName("Открываем страницу Контакты и проверяем заголовок Контакты")
    void contactsPageTest() {
        MainUseTechPage.openPage()
                .contacts();
        contactsPage.checkContactTextTest("Контакты");
    }

    @Test
    @DisplayName("Открываем страницу Продукты и видим в заголовках Продукты")
    void productsPageTest() {
        MainUseTechPage.openPage()
                .products();
        productsPage.checkProductTextTest("Продукты");
    }

    @Test
    @DisplayName("Открываем страницу Награды и видим в заголовках Награды")
    void awardsPageTest() {
        MainUseTechPage.openPage()
                .awards();
        awardsPage.checkAwardsTextTest("Награды");
    }

}
