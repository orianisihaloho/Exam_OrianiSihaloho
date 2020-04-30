@Android
Feature: Add to do task
  Scenario:  Add task
    Given User is on to do list page
    When User add task
    When User input todo "Exam"
    When User input task description "Automation Exam"
    When User click save


