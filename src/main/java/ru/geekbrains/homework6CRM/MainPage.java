package ru.geekbrains.homework6CRM;

import org.openqa.selenium.WebDriver;

public class MainPage extends BaseElements {
    public NavigationMenu navigationMenu;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
        navigationMenu = new NavigationMenu(webDriver);
    }


}
