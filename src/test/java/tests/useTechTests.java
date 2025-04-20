package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.useTechMainPage;

@Tag("UseTech")
public class useTechTests extends TestBase {
    @Test
    void startPageCheckHeaderContainerTest() {
        useTechMainPage.openPage()
                .headerContainer(9); //Проверяем количество кнопок в header меню
    }

    @Test
    void newsPageTest() {
        useTechMainPage.openPage()
                .news("Новости"); //Находимся на странице Новости и видим заголовок Новости
    }

    @Test
    void contactsPageTest() {
        useTechMainPage.openPage()
                .contacts("Контакты"); //Находимся на странице Контакты и видим заголовок Контакты
    }

    @Test
    void productsPageTest() {
        useTechMainPage.openPage()
                .products("Продукты"); //Находимся на странице Продукты и видим в заголовках Продукты
    }

    @Test
    void awardsPageTest() {
        useTechMainPage.openPage()
                .awards("Награды"); //Находимся на странице Награды и видим в заголовках Награды
    }

}
