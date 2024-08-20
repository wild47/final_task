# NewEraCapTest.java
## Overview
The `NewEraCapTest` class is a Java file that contains test methods for testing various functionalities of a software project. It extends the `Configuration` class, suggesting that it inherits some common configuration settings or behaviors.

The purpose of this file is to provide automated tests for different scenarios, such as user login, password restoration, search functionality, and registration. Each test method performs a sequence of actions and assertions to verify the expected behavior of the software.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Useful details](#properties)

## Prerequisites
This file has a dependency on the `JsonHelper` class, which provides data for the test methods using the `dataProvider` attribute. The specific version of the `JsonHelper` class is not provided in the code snippet.

## Usage
To use the `NewEraCapTest` class in a project:

1. Ensure that the `Configuration` class is imported and available.
2. Ensure that the `JsonHelper` class is imported and available with the necessary data.
3. Instantiate an object of the `NewEraCapTest` class.
4. Call the desired test method(s) on the instantiated object.

Example:
```java
NewEraCapTest test = new NewEraCapTest();
test.userShouldLogIn("example@example.com", "password");
```

## Methods
1. `userShouldLogIn(String email, String password)`: This method performs the steps to log in a user. It takes the email and password as parameters and executes the following actions:
   - Opens the base URL.
   - Clicks on the sign-in/register button.
   - Enters the email in the login field.
   - Enters the password in the login field.
   - Clicks the sign-in button.
   - Checks that the user's account info is displayed.

2. `userShouldRestorePassword(String email)`: This method performs the steps to restore a user's password. It takes the email as a parameter and executes the following actions:
   - Opens the base URL.
   - Clicks on the sign-in/register button.
   - Clicks the forgot password button.
   - Resets the password using the provided email.
   - Checks that a pop-up exists.
   - Closes the pop-up.
   - Checks that the forgot password button is not displayed after password reset.

3. `checkThatSearchWorksCorrect(String dataForSearching)`: This method checks that the search functionality works correctly. It takes the data for searching as a parameter and executes the following actions:
   - Opens the base URL.
   - Searches for the provided data.
   - Checks that the search result page contains the search input.

4. `checkThatResultPageContainsSoManyCapsAsIndicated(String dataForSearching)`: This method checks that the result page contains a specific number of caps as indicated. It takes the data for searching as a parameter and executes the following actions:
   - Opens the base URL.
   - Searches for the provided data.
   - Checks that the search result page contains the search input.
   - Checks that the result page contains twelve caps.
   - Checks that the result page contains twenty-four caps.
   - Checks that the result page contains forty-eight caps.

5. `checkThatRegistrationCompleteSuccessfully(String firstName, String lastName, String password)`: This method checks that the registration process is completed successfully. It takes the first name, last name, and password as parameters and executes the following actions:
   - Opens the base URL.
   - Clicks on the sign-in/register button.
   - Enters the first name in the registration field.
   - Enters the last name in the registration field.
   - Enters the email in the registration field.
   - Enters the password in the registration field.
   - Confirms the password in the registration field.
   - Clicks the register button.
   - Checks that a pop-up indicating successful registration is displayed.

## Useful details
- The `NewEraCapTest` class extends the `Configuration` class, suggesting that it inherits or utilizes some common configuration settings or behaviors from the parent class.
- The test methods use a data provider (`JsonHelper.class`) to provide test data for different scenarios, such as login, password restoration, search, and registration. The specific implementation of the `JsonHelper` class is not provided in the code snippet.