@UserInterface
Feature: User Interface

  Background:
    Given I Go To The Live Casino

  @UserInterfaceTest1
  Scenario: UI Test 1: Checking The Thumbnail Of Live Baccarat Revamp
    Then I Verify The Thumbnail Of Game

  @UserInterfaceTest2
  Scenario: UI Test 2: Checking The Launching Of Live Baccarat Revamp
    When I Join Live Baccarat Revamp
    Then I Verify The Launching Of Game

  @UserInterfaceTest3
  Scenario: UI Test 3: Checking The UI Of Live Baccarat Revamp Lobby
    When I Join Live Baccarat Revamp
    Then I Verify The Game Lobby

  @UserInterfaceTest4
  Scenario: UI Test 4: Checking The UI Of Live Baccarat Revamp During Betting Phase
    When I Join Live Baccarat Revamp
    And I Enter The Dealer Table
    Then I Verify The UI Of Game During Betting Phase

  @UserInterfaceTest5
  Scenario: UI Test 5: Checking The UI Of Live Baccarat Revamp During Dealing Phase
    When I Join Live Baccarat Revamp
    And I Enter The Dealer Table
    Then I Verify The UI Of Game During Dealing Phase