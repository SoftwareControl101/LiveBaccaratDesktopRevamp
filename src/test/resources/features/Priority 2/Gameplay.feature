@Gameplay @Maintenance
Feature: Gameplay

  Background:
    Given I Go To The Live Casino
    And I Join Live Baccarat Revamp

  @GameplayTest1
  Scenario: GP Test 1: Checking The Behavior Of The Game When Entered Table While Betting Phase
    When I Enter The Dealer Table
    Then Verify "The Behavior Of The Game When Entered Table While Betting Phase"

  @GameplayTest2
  Scenario: GP Test 2: Checking The Behavior Of The Game When Entered Table While Dealing Phase
    When I Enter The Dealer Table
    Then Verify "The Behavior Of The Game When Entered Table While Dealing Phase"

  @GameplayTest8
  Scenario: GP Test 8: Checking The Behavior Of The Game When New Round Started
    When I Enter The Dealer Table
    And Wait "Until New Round Starts"
    Then Verify "The Behavior Of The Game When New Round Started"

  @GameplayTest9
  Scenario: GP Test 9: Checking The Behavior Of The Game When Placed Bet On Each Betting Options
    When I Enter The Dealer Table
    And Place "A Bet On Each Betting Option"
    Then Verify "The Behavior Of The Game When Placed Bet On Each Betting Options"

  @GameplayTest10
  Scenario: GP Test 10: Checking The Behavior Of The Game When Placed Bets After Confirmed Bets
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Place "A Bet Again"
    Then Verify "The Behavior Of The Game When When Placed Bets After Confirmed Bets"

  @GameplayTest11
  Scenario: GP Test 11: Checking The Behavior Of The Game When Not Confirmed Bet And Timer Less Than 10 Seconds
    When I Enter The Dealer Table
    And Place "A Bet On Any Betting Options"
    And Wait "Until Timer Less Than 10 Seconds"
    Then Verify "The Behavior Of The Game When Not Confirmed Bet And Timer Less Than 10 Seconds"

  @GameplayTest12
  Scenario: GP Test 12: Checking The Behavior Of The Betting Timer When It Reaches 10 Seconds
    When I Enter The Dealer Table
    And Wait "Until Timer Reaches 10 Seconds"
    Then Verify "The Behavior Of The Betting Timer When It Reaches 10 Seconds"

  @GameplayTest13
  Scenario: GP Test 13: Checking The Behavior Of The Game During Dealing Phase
    When I Enter The Dealer Table
    And Wait "Until Dealing Phase"
    Then Verify "The Behavior Of The Game During Dealing Phase"

  @GameplayTest14
  Scenario: GP Test 14: Checking The Behavior Of The Game During Betting Phase
    When I Enter The Dealer Table
    And Wait "Until Betting Phase"
    Then Verify "The Behavior Of The Game During Betting Phase"

  @GameplayTest22
  Scenario: GP Test 22: Checking The Behavior Of The Game When Placed Bet And Betting Phase Closed
    When I Enter The Dealer Table
    And Place "A Bet On Any Betting Options"
    And Wait "Until Betting Phase Close"
    Then Verify "The Behavior Of The Game When Placed Bet And Betting Phase Closed"

  @GameplayTest23
  Scenario: GP Test 23: Checking The Behavior Of The Game When Betting Phase Closed
    When I Enter The Dealer Table
    And Wait "Until Betting Phase Close"
    Then Verify "The Behavior Of The Game When Betting Phase Closed"

  @GameplayTest24
  Scenario: GP Test 24: Checking The Behavior Of The Game When Betting Phase Opened
    When I Enter The Dealer Table
    And Wait "Until Betting Phase Open"
    Then Verify "The Behavior Of The Game When Betting Phase Opened"

  @GameplayTest27
  Scenario: GP Test 27: Checking The Behavior Of The Game When Player Wins
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Wait "Until Player Wins"
    Then Verify "The Behavior Of The Game When Player Wins"

  @GameplayTest28
  Scenario: GP Test 28: Checking The Behavior Of The Game When Player Loses
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Wait "Until Player Loses"
    Then Verify "The Behavior Of The Game When Player Loses"

  @GameplayTest34
  Scenario: GP Test 34: Checking The Behavior Of The Game When Player Or Banker Has 10 Or Face Cards
    When I Enter The Dealer Table
    And Wait "Until Player Or Banker Has 10 Of Face Cards"
    Then Verify "The Behavior Of The Game When Player Or Banker Has 10 Or Face Cards"

  @GameplayTest35
  Scenario: GP Test 35: Checking The Behavior Of The Commission And Non-Commission Button When Clicked
    When I Enter The Dealer Table
    And Wait "Until Betting Phase Open"
    And Click "The Commission And Non-Commission Button"
    Then Verify "The Behavior Of The Commission And Non-Commission Button When Clicked"
    And Click "The Commission And Non-Commission Button"
    Then Verify "The Behavior Of The Commission And Non-Commission Button When Re-clicked"

  @GameplayTest36
  Scenario: GP Test 36: Checking The Behavior Of The Game When Did Not Bet For 8 Rounds
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Do "Not Bet For 8 Consecutive Rounds"
    Then Verify "The Behavior Of The Game When Did Not Bet For 8 Rounds"

  @GameplayTest37
  Scenario: GP Test 37: Checking The Behavior Of The Game When Did Not Bet For 9 Rounds
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Do "Not Bet For 9 Consecutive Rounds"
    Then Verify "The Behavior Of The Game When Did Not Bet For 9 Rounds"

  @GameplayTest38
  Scenario: GP Test 38: Checking The Behavior Of The Game When Placed Minimum Bet On Any Betting Options
    When Click "The High Table Limits"
    And I Enter The Dealer Table
    And Place "A Bet On Any Betting Options"
    And Wait "Until Timer Less Than 10 Seconds"
    Then Verify "The Behavior Of The Game When Placed Minimum Bet On Any Betting Options"

  @GameplayTest41
  Scenario: GP Test 41: Checking The Behavior Of The Chips When Placed Each Chips On All Table Limits
    When I Enter The Dealer Table
    And Place "Each Chips On All Table Limits"
    Then Verify "The Behavior Of The Chips When Placed Each Chips On All Table Limits"

  @GameplayTest42
  Scenario: GP Test 42: Checking The Behavior Of The Game When Placed Bet And Exit The Table
    When I Enter The Dealer Table
    And Check "The Round ID"
    And Place "A Bet On Any Betting Options"
    And Click "The Back Button"
    Then Verify "The Behavior Of The Game When Placed Bet And Exit The Table"

  @GameplayTest43
  Scenario: GP Test 43: Checking The Behavior Of The Game When Placed And Confirmed Bets On Multiple Table
    When I Enter The Dealer Table
    And Place "And Confirm Bets On Multiple Table"
    Then Verify "The Behavior Of The Game When Placed And Confirmed Bets On Multiple Table"

  @GameplayTest44
  Scenario: GP Test 44: Checking The Behavior Of The Game When Added Chips To Selected Chips
    When I Enter The Dealer Table
    And Wait "Until New Round Starts"
    And Click "The Edit Chips Button"
    And Do "Select And Add Any Chip To Selected Chips"
    Then Verify "The Behavior Of The Game When Added Chips To Selected Chips"

  @GameplayTest45
  Scenario: GP Test 45: Checking The Behavior Of The Game When Removed Chips To Selected Chips
    When I Enter The Dealer Table
    And Wait "Until New Round Starts"
    And Click "The Edit Chips Button"
    And Do "Select And Remove Any Chip To Selected Chips"
    Then Verify "The Behavior Of The Game When Removed Chips To Selected Chips"

  @GameplayTest48
  Scenario: GP Test 48: Checking The Behavior Of The Game When Clicked Bet Limit Or Payout Tab Menu
    When I Enter The Dealer Table
    And Click "The Limits & Payouts Button"
    And Click "Bet Limit Or Payout Tab"
    Then Verify "The Behavior Of The Game When Clicked Bet Limit Or Payout Tab Menu"

  @GameplayTest49
  Scenario: GP Test 49: Checking The Behavior Of The Game When Selected Any Available Table Limitt
    When I Enter The Dealer Table
    And Click "The Table Limit Button"
    And Click "Any Table Limit Available"
    Then Verify "The Behavior Of The Game When Selected Any Available Table Limit"

  @GameplayTest50
  Scenario: GP Test 50: Checking The Behavior Of The Video Button When Clicked
    When I Enter The Dealer Table
    And Click "The Video Button"
    Then Verify "The Behavior Of The Video Button When Clicked"
    And Click "The Video Button"
    Then Verify "The Behavior Of The Video Button When Re-clicked"

  @GameplayTest51
  Scenario: GP Test 51: Checking The Behavior Of The Music Button When Clicked
    When I Enter The Dealer Table
    And Click "The Music Button"
    Then Verify "The Behavior Of The Music Button When Clicked"
    And Click "The Music Button"
    Then Verify "The Behavior Of The Music Button When Re-clicked"

  @GameplayTest52
  Scenario: GP Test 52: Checking The Behavior Of The Voice Button When Clicked
    When I Enter The Dealer Table
    And Click "The Voice Button"
    Then Verify "The Behavior Of The Voice Button When Clicked"
    And Click "The Voice Button"
    Then Verify "The Behavior Of The Voice Button When Re-clicked"

  @GameplayTest54
  Scenario: GP Test 54: Checking The Behavior Of The Confirm Button After Betting A Round
    When I Enter The Dealer Table
    And Place "And Confirm Any Betting Options"
    And Wait "Until New Round Starts"
    Then Verify "The Behavior Of The Confirm Button After Betting A Round"