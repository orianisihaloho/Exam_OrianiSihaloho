package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ToDoStepDefinition {

    ToDoHomePage toDoHomePage = new ToDoHomePage();


    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {

    }

    @When("User add task")
    public void userAddTask() {
        toDoHomePage.addTask();

    }

    @When("User input todo {string}")
    public void userInputTodo(String keyword) {
        toDoHomePage.userInputTodo(keyword);
    }

    @When("User input task description {string}")
    public void userInputTaskDescription(String keyworddesc) {

        toDoHomePage.userInputTodo(keyworddesc);
    }

    @When("User click save")
    public void userClickSave() {

        toDoHomePage.clickSave();
    }

    @When("User refresh task")
    public void userRefreshTask() {
        toDoHomePage.userRefreshTask();

    }

    @When("User filter active task")
    public void userFilterActiveTask() {
        toDoHomePage.userFilterActiveTask();

    }

    @When("User filter completed task")
    public void userFilterCompletedTask() {
        toDoHomePage.userFilterCompletedTask();
    }

    @When("User check task")
    public void userCheckTask() {
        toDoHomePage.userCheckTask();
    }


    @When("User clear completed task")
    public void userClearCompletedTask() {
        toDoHomePage.userClearCompletedTask();
    }
}
