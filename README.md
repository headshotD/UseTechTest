
<h1 >Демопроект по автоматизации тестирования сайта <a href="https://usetech.ru/ "> Usetech</a></h1>

## ☑️ Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

<a id="tools"></a>
## :ballot_box_with_check:Технологии и инструменты:

|         Java                                                                                                      | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         |  Jenkins                                                                                                        |   Telegram
|:----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="media/java-svgrepo-com.svg" width="50" height="50"  alt="Java"/></a>  | <a href="https://www.jetbrains.com/idea/"><img src="media/intellij-idea-svgrepo-com.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/github-badge-svgrepo-com.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/gradle-svgrepo-com.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="media/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="media/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="media/Allure.svg" width="50" height="50"  alt="Allure"/></a> |<a href="https://www.jenkins.io/"><img src="media/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://web.telegram.org/"><img src="media/Telegram.svg" width="50" height="50" alt="Telegram"/></a> |<a href="https://qameta.io/"><img src="images\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

<a id="cases"></a>
## :ballot_box_with_check: Реализованные проверки:

- Проверка на количество кнопок в header меню на главной странице
- Переходим с главной страницы на страницу Новости и проверяем текст на заголовок с текстом "Новости"
- Переходим с главной страницы на страницу Контакты и проверяем текст на заголовок с текстом "Контакты"
- Переходим с главной страницы на страницу Продукты и проверяем текст на заголовок с текстом "Продукты"
- Переходим с главной страницы на страницу Награды и проверяем текст на заголовок с текстом "Награды"

## <img alt="Jenkins" height="25" src="media/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/C34-Olejjka1337-unit14-UseTech/)


<p align="center">  
<img src="media/JenkinsBuild.jpg" alt="Jenkins" width="950"/></a>  
</p>


## :ballot_box_with_check: Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 127.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)


## Команда для запуска из терминала

Удаленный запуск с использованием Jenkins+Selinoid(требуется логин и пароль):
```bash  
gradle clean UseTech -Denv=remote
```

## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure Report	</a>


## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/AR1.png" width="850">  
</p>  

## Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/screen/AR2.png" width="850">  
<img title="Allure Graphics" src="images/screen/AR3.png" width="850">  
</p>


## <img alt="Allure_TO" height="25" src="images/logo/Allure_TO.svg" width="25"/> </a>Интеграция с Allure TestOps</a>


## Allure TestOps Dashboard

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/ATO5.png" width="850">  
</p>  

## Авто и Ручные тест-кейсы

<p align="center">  
<img title="Allure Tests" src="images/screen/ATO3.png" width="850">  
<img title="Allure Tests" src="images/screen/ATO6.png" width="850">  

</p>

## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-689">Jira</a>

<p align="center">  
<img title="Jira" src="images/screen/jira.png" width="">  
</p>

____
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/tg.png" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/screen/gif/selenideVideo (2).gif" width="550" height="350"  alt="video">   
</p>
