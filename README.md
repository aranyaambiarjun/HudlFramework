# HudlFramework
#Author : Aranya Ambi Arjun
#Language : Java
#Framework : Page Object Model Selenium BDD Framework
#Reporting : Junit
#BDD: Cucumber

This framework is to automate the functionalities of Hudl Application.
This is written in Java Language.
Used Page Object Model Selenium BDD framework integrated with Junit to automate the flows.
Login Functionality is automated now.
3 Scenarios are considered--> Successful Login , Invalid Credentials, Login without Credentials.
3 scenarios are written as features in Feature file in Simple Gherkin Language placed under Features folder.
Input Values are taken directly from Features, which can be parametrized if need to run the tests for multiple test data.
The actual implementation of the features are done in Step Definition Class under StepDefinitions.
Browser Initialization and tear down methods are written in Hooks inside Step Definition Class.
The feature files and the Step Definitions considered are linked in Test Runner Class.
All the fields and functions of each page are defined in corresponding Pages under Pages Folder.
Test Runner is the starting point of Execution. Open Test Runner class: Right Click on it --> Run as Junit
Test Results will be Published by Junit
