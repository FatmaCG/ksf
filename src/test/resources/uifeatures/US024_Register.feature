@US024
  Feature: Register Page
    Scenario: As a user, I should be registered to log into the system.
      Given user goes to home page
      When user clicks on Account button
      And user clicks Don't have an account? Register.link
      * user enters email
      * user enters password
      * user enters password again
      * user clicks to register button
      Then user should see the Register Successfully! message
     # Then user should see url contains user-panel