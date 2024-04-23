@Graph
Feature: Graph

  Background: 
    Given User is on DSAlgoHome Page
    Then User clicks on Signinlink
    Then Click on Graph Get started button
    When User click on Graph link

  Scenario: Graph Valid Data
    When User enters valid python code for graph
    When user clicks on signout button

  Scenario: Graph InValid Data
    When User enters Invalid python code for graph
    When user clicks on signout button
