
Feature: Login3 funtionality
Scenario Outline: verify login with valid credentials

Given user open chrome browser
Given user enter url "https://practice.expandtesting.com/login"
Then user enter username "<username>"
Then user enter pwd "<password>"
Then user click on login
Then user will redirect to home page
Then user will see the title of the page
	
	Examples:
	|username|password|
	|u1|p1|
	|u3|p3|
	|u2|p2|