@Completetest
Feature: Login to Retail website
# in feature  will be used as a comment
# Every feature files starts with feature: <Name of Feautre>

Background:
Given User is on Retail Website

@login @Regression @smokeTest
Scenario: Login to MyAccount
When User click on MyAccount
And User click on Login
And User enter userName 'eagles@tekschool.us' and password 'eagles'
And User click on Login button
Then User should be logged in to MyAccount Dashboard

# Instead of writting this scenario 3 times and just changing values
# Cucumber provides Scenario Outline with Examples keyword to do
 #Data Driven Testing
@test
Scenario Outline: Login to MyAccount with Multiple users
When User click on MyAccount
And User click on Login
And User enter userName '<userName>' and password '<password>'
And User click on Login button
Then User should be logged in to MyAccount Dashboard

Examples:
	|userName|password|
	|eagles@tekschool.us|eagles|
	|hawks@tekschool.us|hawks|
	|falcons@tekschool.us|falcons|
	
@RegisterTestCase
 Scenario: Register new user to Retail website
 
 When User click on MyAccount
And User click on Register option
And User fill the Registration form with bellow information
|firstName|lastName|eMail|telephone|password|passwordConfirm|Subscribe|
|zara|jee|rafiullah_mohmand@yahoo.com|5716663125|Jan@1232|Jan@1232|no|
And User accept the privacy any policy
And User click on continue button
Then User should be registered in Retail website

	
	
	
	
	