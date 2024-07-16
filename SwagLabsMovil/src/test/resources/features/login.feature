CreaFeature: SwagLabs Login

  Background:
    Given The user completes the form using username "standard_user" and password "secret_sauce"

  Scenario: Successful login with valid credentials
    When the user presses the login button
    Then The user should see the title PRODUCTS

    Scenario: Successful view products page after login
        When the user presses the login button
        Then The user should see at least one product

