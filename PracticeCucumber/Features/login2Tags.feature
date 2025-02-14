
@reg
Feature: Login2Tags funtionality

@smoke
Scenario: verify login with valid credentials

Given user open chrome browser
Given user enter url "https://practice.expandtesting.com/login"
Then user enter username "practice"
Then user enter pwd "SuperSecretPassword!"
Then user click on login
Then user will redirect to home page
Then user will see the title of the page

@sanity
Scenario: verify login with invalid credentials

Given user open chrome browser
Given user enter url "https://practice.expandtesting.com/login1"
Then user enter username "practice1"
Then user enter pwd "SuperSecretPassword!"
Then user click on login
Then user will redirect to home page
Then user will see the title of the page

@smoke @sanity
Scenario: verify login with valid username invalid invalid credentials

Given user open chrome browser
Given user enter url "https://practice.expandtesting.com/login"
Then user enter username "practice"
Then user enter pwd "SuperSecretPassword2!"
Then user click on login
Then user will redirect to home page
Then user will see the title of the page