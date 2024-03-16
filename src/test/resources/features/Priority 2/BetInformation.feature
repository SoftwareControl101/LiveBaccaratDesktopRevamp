@BetInformation @Maintenance
Feature: Bet Information

  Background:
    Given I Go To The Live Casino
    And I Join Live Baccarat Revamp
    And I Enter The Dealer Table

  @BetInformationTest1
  Scenario: BI Test 1: Checking Bet Information With Win Result When Placed Bet On Player Or Banker
    When I Place Bet On "Player Or Banker" Betting Option Until "Win"
    And I Go To My Bets
    And I Click Bet Details
    Then I Verify The Bet Details Information With "Win Result When Placed Bet On Player Or Banker"

  @BetInformationTest2
  Scenario: BI Test 2: Checking Bet Information With Lose Result When Placed Bet On Player Or Banker
    When I Place Bet On "Player Or Banker" Betting Option Until "Lose"
    And I Go To My Bets
    And I Click Bet Details
    Then I Verify The Bet Details Information With "Lose Result When Placed Bet On Player Or Banker"

  @BetInformationTest3
  Scenario: BI Test 3: Checking Bet Information With Tie Result When Placed Bet On Player Or Banker
    When I Place Bet On "Player Or Banker" Betting Option Until "Tie"
    And I Go To My Bets
    And I Click Bet Details
    Then I Verify The Bet Details Information With "Tie Result When Placed Bet On Player Or Banker"

  @BetInformationTest4
  Scenario: BI Test 4: Checking Bet Information With Tie Result When Placed Bet On Player Or Banker
    When I Place Bet On "Tie" Betting Option Until "Tie"
    And I Go To My Bets
    And I Click Bet Details
    Then I Verify The Bet Details Information With "Tie Result When Placed Bet On Tie"

  @BetInformationTest5
  Scenario: BI Test 5: Checking Bet Information With Tie Result When Placed Bet On Main And Side
    When I Place Bet On "Main And Side" Betting Option Until "Tie"
    And I Go To My Bets
    And I Click Bet Details
    Then I Verify The Bet Details Information With "Tie Result When Placed Bet On Main And Side"