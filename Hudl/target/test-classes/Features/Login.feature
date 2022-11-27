#Author: aranyaaarjun@gmail.com
#Keywords Summary :Framework for Hudl Application

Feature: Feature to test the Login functionality of Hudl Application

  	Scenario: Validate the Successful Login to Hudl Application
  	Given User is in main page
    When User clicks on signin button
    Then User is navigated to login page
    When User enters email 'aranyaaarjun@gmail.com' and password 'Abhi@143'
    And User clicks on the login button
    Then User is navigated to the Home Page
    
    Scenario: Validate the Login Failure while giving invalid credentials
    Given User is in main page
    When User clicks on signin button
    Then User is navigated to login page
    When User enters email 'abc@xyz.com' and password '112233'
    And User clicks on the login button
    Then User get invalid login error
    
    Scenario: Validate the error messages without providing credentials
    Given User is in main page
    When User clicks on signin button
    Then User is navigated to login page
    And User clicks on the login button
    Then User get invalid login error
    