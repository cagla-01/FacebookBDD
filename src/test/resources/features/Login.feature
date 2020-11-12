@web

  Feature: Login Facebook Page

    Background:
      Given  I am on login page

      @Login
      Scenario Outline: Verify invalid login for multiple users
        When I enter <username> into username text fields on home screen
        And I enter <password> into password text fields on home screen
        And I click on login button on home screen
        Then I verify that I am invalid login page



        Examples:
        | username       | password |
        |cagla@gmail.com | 153test  |
        |defne@gmail.com | 123testa |
        |erhan@gmail.com | 163testb |
