
Feature: Logging in to an existing twitter handle
  I want to be able to log in and check my feeds in twitter

  Scenario: Log into an existing twitter account
    Given I am in the twitter home page
    And login as "johndoe310718@yahoo.com" with password "testaccount#1"
    Then I should land on my personal landing page "John Doe"