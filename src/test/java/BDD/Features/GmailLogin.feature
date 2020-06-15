Feature: Gamil login page

  Scenario: Validate gmail login page when user is valid, password is invalid

    Given user is in gmail login page
    When Enters valid user in User Field
    And Click next button
    And Enters in-valid password in password field
    And Click on next button to login
    Then Verify the error message on login page

