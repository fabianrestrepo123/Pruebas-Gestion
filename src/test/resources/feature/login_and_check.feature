Feature: I, as a user, want to register and make a deposit

  @Register
  Scenario: do the registration on guru
    Given the user must be on the page the guru
    When make a resgister
    Then validate message

  @CheckDeposit
  Scenario: make a check
    Given the user must be on the page the guru home
    When make a check
    Then validate messages