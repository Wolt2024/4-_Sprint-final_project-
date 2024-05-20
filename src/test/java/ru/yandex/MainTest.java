package ru.yandex;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


// Базовый тестовый класс, для настройки драйвера. Другие тестовые классы наследуются от базового.
public class MainTest {
    //Объявляем переменную драйвера
    protected WebDriver driver;

    // Инициализируем драйвер
    @Before
    public void startUp() {
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp() {
        // Закрываем сессию драйвера
        driver.quit();
    }

    // Неявное ожидание заданное количество секунд
    public void implicitlyWait(long numberOfSeconds) {
        driver.manage().timeouts().implicitlyWait(numberOfSeconds, TimeUnit.SECONDS);
    }

}

