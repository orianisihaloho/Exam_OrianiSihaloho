package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDoHomePage {
    public boolean isOnPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver,15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fab_add_task"))).isDisplayed();
    }

    public void addTask(){
        WebElement buttonSearch = AndroidDriverInstance.androidDriver.findElement(By.id("fab_add_task"));    // find element submit by Xpath
        buttonSearch.click();                                                                                // do click

    }

    public void userInputTodo(String keyword){
        WebElement inputSearch = AndroidDriverInstance.androidDriver.findElement(By.id("add_task_title"));
        inputSearch.sendKeys(keyword);
    }

    public void clickSave(){
        WebElement buttonSearch = AndroidDriverInstance.androidDriver.findElement(By.id("fab_edit_task_done"));    // find element submit by Xpath
        buttonSearch.click();                                                                                // do click

    }

    public void userRefreshTask() {
        WebElement refresh = AndroidDriverInstance.androidDriver.findElement(By.id("refresh_layout"));
        refresh.click();

    }

    public void userClearCompletedTask() {
        WebElement opt = AndroidDriverInstance.androidDriver.findElement(By.id("More options"));
        opt.click();

        WebElement cc = AndroidDriverInstance.androidDriver.findElement((By.xpath("//android.widget.TextView[contains(@text,'Clear completed')]")));
        cc.click();
    }

    public void userFilterActiveTask() {
        WebElement filter = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));
        filter.click();
        WebElement filteractive = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Active')]"));
        filteractive.click();
    }

    public void userFilterCompletedTask() {
        WebElement filter = AndroidDriverInstance.androidDriver.findElement(By.id("menu_filter"));    // find filter
        filter.click();
        WebElement filtercompleted = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Completed')]"));
        filtercompleted.click();
    }


    public void userCheckTask() {
        WebElement check = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.CheckBox[contains(@checkable,'true')]"));
        check.click();
    }


}
