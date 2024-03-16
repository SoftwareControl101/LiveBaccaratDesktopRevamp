@Payout @Maintenance
Feature: Payout

  @PayoutWait
  Scenario: PO Fetch: Wait Until There Is A Round Result For Payout
    Given I Go To The Live Casino
    When I Join Live Baccarat Revamp
    And I Enter The Dealer Table
    Then I Place A Bet Until There Is A Round Result For All Payouts
      | Commission Player            |
      | Commission Banker            |
      | Commission Tie               |
      | Commission Pair              |
      | Non-commission Player        |
      | Non-commission Banker        |
      | Non-commission Banker Of Six |
      | Non-commission Tie           |
      | Non-commission Pair          |
      | Dragon Bonus Natural Win     |
      | Dragon Bonus Natural Tie     |
      | Dragon Bonus 9 Difference    |
      | Dragon Bonus 8 Difference    |
      | Dragon Bonus 7 Difference    |
      | Dragon Bonus 6 Difference    |
      | Dragon Bonus 5 Difference    |
      | Dragon Bonus 4 Difference    |
      | Fortune Six 2 Cards          |
      | Fortune Six 3 Cards          |

  @PayoutTest1
  Scenario: PO Test 1: Checking The Payout Calculation Of Commission Player
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Commission Player"

  @PayoutTest2
  Scenario: PO Test 2: Checking The Payout Calculation Of Commission Banker
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Commission Banker"

  @PayoutTest3
  Scenario: PO Test 3: Checking The Payout Calculation Of Commission Tie
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Commission Tie"

  @PayoutTest4
  Scenario: PO Test 4: Checking The Payout Calculation Of Commission Pair
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Commission Pair"

  @PayoutTest6
  Scenario: PO Test 6: Checking The Payout Calculation Of Non-commission Player
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Non-commission Player"

  @PayoutTest7
  Scenario: PO Test 7: Checking The Payout Calculation Of Non-commission Banker
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Non-commission Banker"

  @PayoutTest8
  Scenario: PO Test 8: Checking The Payout Calculation Of Non-commission Banker Of Six
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Non-commission Banker Of Six"

  @PayoutTest9
  Scenario: PO Test 9: Checking The Payout Calculation Of Non-commission Tie
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Non-commission Tie"

  @PayoutTest11
  Scenario: PO Test 11: Checking The Payout Calculation Of Non-commission Pair
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Non-commission Pair"

  @PayoutTest12
  Scenario: PO Test 12: Checking The Payout Calculation Of Dragon Bonus Natural Win
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus Natural Win"

  @PayoutTest13
  Scenario: PO Test 13: Checking The Payout Calculation Of Dragon Bonus Natural Tie
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus Natural Tie"

  @PayoutTest14
  Scenario: PO Test 14: Checking The Payout Calculation Of Dragon Bonus 9 Difference
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus 9 Difference"

  @PayoutTest15
  Scenario: PO Test 15: Checking The Payout Calculation Of Dragon Bonus 8 Difference
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus 8 Difference"

  @PayoutTest16
  Scenario: PO Test 16: Checking The Payout Calculation Of Dragon Bonus 7 Difference
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus 7 Difference"

  @PayoutTest17
  Scenario: PO Test 17: Checking The Payout Calculation Of Dragon Bonus 6 Difference
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus 6 Difference"

  @PayoutTest18
  Scenario: PO Test 18: Checking The Payout Calculation Of Dragon Bonus 5 Difference
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus 5 Difference"

  @PayoutTest19
  Scenario: PO Test 19: Checking The Payout Calculation Of Dragon Bonus 4 Difference
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Dragon Bonus 4 Difference"

  @PayoutTest21
  Scenario: PO Test 21: Checking The Payout Calculation Of Fortune Six 2 Cards
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Fortune Six 2 Cards"

  @PayoutTest22
  Scenario: PO Test 22: Checking The Payout Calculation Of Fortune Six 3 Cards
    When I Check The Round Result
    Then I Verify The Payout Calculation Of "Fortune Six 3 Cards"