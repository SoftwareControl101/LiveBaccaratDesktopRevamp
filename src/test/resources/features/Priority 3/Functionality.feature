@Functionality
Feature: Functionality

  Background:
    Given I Go To The Live Casino
    And I Join Live Baccarat Revamp

  @FunctionalityTest1
  Scenario: FT Test 1: Checking The Number Of Deals Displayed On The Lobby
    When I Enter The Dealer Table
    And I Check "The Number Of Deals And Table Name"
    And I Click "The Back Button On The Lobby"
    Then I Verify "The Number Of Deals Displayed On The Lobby"

  @FunctionalityTest2
  Scenario: FT Test 2: Checking The Functionality Of Show/Hide The Balance Button On The Lobby
    When I Click "The Show/Hide Balance Button On The Lobby"
    Then I Verify "The Functionality After Clicking Show/Hide Balance Button On The Lobby"
    When I Click "The Show/Hide Balance Button On The Lobby"
    Then I Verify "The Functionality After Re-clicking Show/Hide Balance Button On The Lobby"

  @FunctionalityTest3
  Scenario: FT Test 3: Checking The Functionality On Each Table Limit Button
    When I Click "On Each Table Limit"
    Then I Verify "The Functionality After Clicking Each Table Limit Button"

  @FunctionalityTest4
  Scenario: FT Test 4: Checking The Functionality Of The Back Button On The Lobby
    When I Click "The Back Button On The Lobby"
    Then I Verify "The Functionality After Clicking The Back Button On The Lobby"

  @FunctionalityTest5
  Scenario: FT Test 5: Checking The Functionality Of Any Live Baccarat Revamp Table
    When I Enter "Any Dealer Table"
    Then I Verify "The Functionality After Clicking Any Table"

  @FunctionalityTest6
  Scenario: FT Test 6: Checking The Functionality Of The Other Live Games
    When I Click "The Other Live Games"
    Then I Verify "The Functionality After Clicking The Other Live Games"

  @FunctionalityTest7
  Scenario: FT Test 7: Checking The Functionality Of The All Games
    When I Click "The All Games"
    Then I Verify "The Functionality After Clicking The All Games"

  @FunctionalityTest8
  Scenario: FT Test 8: Checking The Number Of Deals Displayed After Round Finished
    When I Enter The Dealer Table
    And I Check "The Number Of Deals"
    And I Wait "Until Round Is Over"
    And I Click "The Back Button On The Lobby"
    Then I Verify "The Number Of Deals Displayed After Round Finished"

  @FunctionalityTest9
  Scenario: FT Test 9: Checking The Functionality Of The Back Button On The Game
    When I Enter The Dealer Table
    And I Click "The Back Button On The Game"
    Then I Verify "The Functionality After Clicking The Back Button On The Game"

  @FunctionalityTest10
  Scenario: FT Test 10: Checking The Functionality Of The Limits & Payouts
    When I Enter The Dealer Table
    And I Click "The Limits & Payouts"
    Then I Verify "The Functionality After Clicking The Limits & Payouts"

  @FunctionalityTest11
  Scenario: FT Test 11: Checking The Functionality Of The Payout Tab In Limits & Payouts
    When I Enter The Dealer Table
    And I Click "The Limits & Payouts"
    And I Click "The Payout Tab"
    Then I Verify "The Functionality After Clicking The Payout Tab In Limits & Payouts"

  @FunctionalityTest12
  Scenario: FT Test 12: Checking The Functionality Of The Bet Limit Tab In Limits & Payouts
    When I Enter The Dealer Table
    And I Click "The Limits & Payouts"
    And I Click "The Bet Limit Tab"
    Then I Verify "The Functionality After Clicking The Bet Limit Tab In Limits & Payouts"

  @FunctionalityTest13
  Scenario: FT Test 13: Checking The Functionality Of The Table Limit Button
    When I Enter The Dealer Table
    And I Click "The Table Limit Button"
    Then I Verify "The Functionality After Clicking The Table Limit Button"

  @FunctionalityTest14
  Scenario: FT Test 14: Checking The Functionality Of The Help
    When I Enter The Dealer Table
    And I Click "The Help"
    Then I Verify "The Functionality After Clicking The Help"

  @FunctionalityTest15
  Scenario: FT Test 15: Checking The Functionality Of Each Category In The Help
    When I Enter The Dealer Table
    And I Click "The Help"
    And I Click "On Each Category In Help"
    Then I Verify "The Functionality After Clicking Each Category In The Help"
    When I Click "On Each Category In Help"
    Then I Verify "The Functionality After Re-clicking Each Category In The Help"

  @FunctionalityTest16
  Scenario: FT Test 16: Checking The Functionality Of The Back Button On The Help
    When I Enter The Dealer Table
    And I Click "The Help"
    And I Click "The Back Button On The Help"
    Then I Verify "The Functionality After Clicking The Back Button On The Help"

  @FunctionalityTest17
  Scenario: FT Test 17: Checking The Functionality After Selecting Other Table Limit
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Table Limit Button"
    And I Enter "Other Table Limit Table"
    Then I Verify "The Functionality After Selecting Other Table Limit"

  @FunctionalityTest18
  Scenario: FT Test 18: Checking The Functionality Of The Total Bet Indicator
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    Then I Verify "The Functionality Of The Total Bet Indicator"

  @FunctionalityTest22
  Scenario: FT Test 22: Checking The Functionality Of The My Bets
    When I Enter The Dealer Table
    And I Click "The My Bets"
    Then I Verify "The Functionality After Clicking The My Bets"

  @FunctionalityTest23
  Scenario: FT Test 23: Checking The Functionality Of Running Round In My Bets
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Click "The My Bets"
    And I Click "The Running Tab"
    Then I Verify "The Functionality Of Running Round In My Bets"

  @FunctionalityTest24
  Scenario: FT Test 24: Checking The Functionality Of Settled Round In My Bets
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Round Is Over"
    And I Click "The My Bets"
    And I Click "The Settled Tab"
    Then I Verify "The Functionality Of Settled Round In My Bets"

  @FunctionalityTest25
  Scenario: FT Test 25: Checking The Functionality Of Show/Hide The Balance Button On The Game
    When I Click "The Show/Hide Balance Button On The Game"
    Then I Verify "The Functionality After Clicking Show/Hide Balance Button On The Game"
    When I Click "The Show/Hide Balance Button On The Game"
    Then I Verify "The Functionality After Re-clicking Show/Hide Balance Button On The Game"

  @FunctionalityTest26
  Scenario: FT Test 26: Checking The Functionality Of Balance Indicator When Placed And Confirmed Bets
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    Then I Verify "The Functionality Of Balance Indicator When Placed And Confirmed Bets"

  @FunctionalityTest27
  Scenario: FT Test 27: Checking The Functionality Of Balance Indicator After Winning Round
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Bet Wins"
    Then I Verify "The Functionality Of Balance Indicator After Winning Round"

  @FunctionalityTest28
  Scenario: FT Test 28: Checking The Functionality Of The Switch Table Button
    When I Enter The Dealer Table
    And I Click "The Switch Table Button"
    Then I Verify "The Functionality After Clicking The Switch Table Button"

  @FunctionalityTest29
  Scenario: FT Test 29: Checking The Functionality When Joined Other Table In The Switch Table
    When I Enter The Dealer Table
    And I Click "The Switch Table Button"
    And I Enter "Other Table"
    Then I Verify "The Functionality When Joined Other Table In The Switch Table"

  @FunctionalityTest30
  Scenario: FT Test 30: Checking The Functionality When Joined Other Live Game Table In The Switch Table
    When I Enter The Dealer Table
    And I Click "The Switch Table Button"
    And I Enter "Other Live Game Table"
    Then I Verify "The Functionality When Joined Other Live Game Table In The Switch Table"

  @FunctionalityTest31
  Scenario: FT Test 31: Checking The Functionality Of Round ID Indicator When New Round Started
    When I Enter The Dealer Table
    And I Check "The Round ID Indicator"
    And I Wait "Until Round Is Over"
    Then I Verify "The Functionality Of Round ID Indicator When New Round Started"

  @FunctionalityTest32
  Scenario: FT Test 32: Checking The Functionality Of The Player Prediction Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Player Prediction Button"
    Then I Verify "The Functionality Of The Player Prediction Button"

  @FunctionalityTest33
  Scenario: FT Test 33: Checking The Functionality Of The Banker Prediction Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Banker Prediction Button"
    Then I Verify "The Functionality Of The Banker Prediction Button"

  @FunctionalityTest34
  Scenario: FT Test 34: Checking The Functionality Of The Commission And Non-Commission Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Commission And Non-Commission Button"
    Then I Verify "The Functionality Of The Commission And Non-Commission Button"

  @FunctionalityTest36
  Scenario: FT Test 36: Checking The Functionality Of The Confirm Button
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    Then I Verify "The Functionality After Clicking The Confirm Button"

  @FunctionalityTest37
  Scenario: FT Test 37: Checking The Functionality Of The Double Button
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Double Button"
    Then I Verify "The Functionality After Clicking The Double Button"

  @FunctionalityTest38
  Scenario: FT Test 38: Checking The Functionality Of The Cancel Button
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Cancel Button"
    Then I Verify "The Functionality After Clicking The Cancel Button"

  @FunctionalityTest39
  Scenario: FT Test 39: Checking The Functionality Of The Edit Chips Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Edit Chips Button"
    Then I Verify "The Functionality After Clicking The Edit Chips Button"

  @FunctionalityTest40
  Scenario: FT Test 40: Checking The Functionality Of The Next Arrow Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Edit Chips Button"
    And I Click "The Next Arrow Button"
    Then I Verify "The Functionality After Clicking The Next Arrow Button"

  @FunctionalityTest41
  Scenario: FT Test 41: Checking The Functionality Of The Previous Arrow Button
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Edit Chips Button"
    And I Click "The Next Arrow Button"
    And I Click "The Previous Arrow Button"
    Then I Verify "The Functionality After Clicking The Previous Arrow Button"

  @FunctionalityTest42
  Scenario: FT Test 42: Checking The Functionality Of The Close Button In Edit Chips
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Edit Chips Button"
    And I Click "The Close Button In Edit Chips"
    Then I Verify "The Functionality After Clicking The Close Button In Edit Chips"

  @FunctionalityTest42
  Scenario: FT Test 42: Checking The Functionality Of The Close Button In Edit Chips
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Edit Chips Button"
    And I Click "The Close Button In Edit Chips"
    Then I Verify "The Functionality After Clicking The Close Button In Edit Chips"

  @FunctionalityTest43
  Scenario: FT Test 43: Checking The Functionality Of The Save Button In Edit Chips
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Edit Chips Button"
    And I Click "The Save Button In Edit Chips"
    Then I Verify "The Functionality After Clicking The Save Button In Edit Chips"

  @FunctionalityTest44
  Scenario: FT Test 44: Checking The Functionality Of The Save Button In Edit Chips When Changed Chip
    When I Enter The Dealer Table
    And I Wait "Until Betting Phase"
    And I Click "The Edit Chips Button"
    And I Do "Change Any Chip On My Chips"
    And I Click "The Save Button In Edit Chips"
    Then I Verify "The Functionality After Clicking The Save Button In Edit Chips When Changed Chip"

  @FunctionalityTest47
  Scenario: FT Test 47: Checking The Functionality Of The Confirm Button On Popup Message
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Wait "Until Betting Timer Reaches Last 10 Seconds"
    And I Click "The Popup Confirm Button"
    Then I Verify "The Functionality After Clicking The Confirm Button On Popup Message"

  @FunctionalityTest48
  Scenario: FT Test 48: Checking The Functionality Of The Not Now Button On Popup Message
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Wait "Until Betting Timer Reaches Last 10 Seconds"
    And I Click "The Popup Not Now Button"
    Then I Verify "The Functionality After Clicking The Not Now Button On Popup Message"

  @FunctionalityTest49
  Scenario: FT Test 49: Checking The Functionality Of The ReBet Button
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Betting Phase"
    And I Click "The ReBet Button"
    Then I Verify "The Functionality After Clicking The ReBet Button"

  @FunctionalityTest50
  Scenario: FT Test 50: Checking The Functionality Of The ReBet Button When Doubled ReBet
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Betting Phase"
    And I Click "The ReBet Button"
    And I Click "The Double Button"
    Then I Verify "The Functionality After Clicking The ReBet Button When Doubled ReBet"

  @FunctionalityTest51
  Scenario: FT Test 51: Checking The Functionality Of The ReBet Button When Canceled ReBet
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Betting Phase"
    And I Click "The ReBet Button"
    And I Click "The Cancel Button"
    Then I Verify "The Functionality After Clicking The ReBet Button When Canceled ReBet"

  @FunctionalityTest52
  Scenario: FT Test 52: Checking The Functionality Of The ReBet Button When Undo ReBet
    When I Enter The Dealer Table
    And I Place "A Bet On Any Betting Options"
    And I Click "The Confirm Button"
    And I Wait "Until Betting Phase"
    And I Click "The ReBet Button"
    And I Click "The Undo Button"
    Then I Verify "The Functionality After Clicking The ReBet Button When Undo ReBet"