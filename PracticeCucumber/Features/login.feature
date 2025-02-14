
Feature: Login funtionality
Scenario: verify login with valid credentials

Given user open chrome browser
Given user enter url "https://practice.expandtesting.com/login"
Then user enter username "practice"
Then user enter pwd "SuperSecretPassword!"
Then user click on login
Then user will redirect to home page
Then user will see the title of the page
	