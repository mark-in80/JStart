package ru.ok;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void FirstTest() {
        System.setProperty("webdriver.chrome.driver", "/home/mark/Загрузки/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ok.ru/");

    }
}
