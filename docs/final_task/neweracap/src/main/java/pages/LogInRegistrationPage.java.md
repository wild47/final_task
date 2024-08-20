# LogInRegistrationPage.java
## Overview
The `LogInRegistrationPage.java` file is part of a software project and represents a page object class for a log in and registration page. It provides methods to interact with the elements on the page such as entering email and password, clicking buttons, and checking for the presence of certain elements. The class is designed to make it easier to write automated tests for the log in and registration functionality of the application.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Useful details](#properties)

## Prerequisites
There are no specific prerequisites mentioned in the code file.

## Usage
To use the `LogInRegistrationPage` class in a project, you would first need to import it:
```java
import pages.LogInRegistrationPage;
```
Then, you can instantiate an object of the class and use its methods to interact with the log in and registration page:
```java
LogInRegistrationPage logInRegistrationPage = new LogInRegistrationPage();

// Example usage of methods
logInRegistrationPage.enterEmailToLogInField("test@example.com");
logInRegistrationPage.enterPasswordToLogInField("password");
logInRegistrationPage.clickSignInButton();
```

## Methods
The `LogInRegistrationPage` class provides the following methods:

### enterEmailToLogInField
```java
public LogInRegistrationPage enterEmailToLogInField(String email)
```
This method enters the provided email address in the log in email field.
- `email` - The email address to be entered in the field.

### enterPasswordToLogInField
```java
public LogInRegistrationPage enterPasswordToLogInField(String password)
```
This method enters the provided password in the log in password field.
- `password` - The password to be entered in the field.

### clickSignInButton
```java
public LogInRegistrationPage clickSignInButton()
```
This method clicks the sign in button on the log in page.

### checkThatMyAccountInfoIsDisplayed
```java
public LogInRegistrationPage checkThatMyAccountInfoIsDisplayed()
```
This method checks that the my account field is displayed on the page.

### enterFirstNameToRegistrationField
```java
public LogInRegistrationPage enterFirstNameToRegistrationField(String firstName)
```
This method enters the provided first name in the registration first name field.
- `firstName` - The first name to be entered in the field.

### enterLastNameToRegistrationField
```java
public LogInRegistrationPage enterLastNameToRegistrationField(String lastName)
```
This method enters the provided last name in the registration last name field.
- `lastName` - The last name to be entered in the field.

### enterEmailToRegistrationField
```java
public LogInRegistrationPage enterEmailToRegistrationField()
```
This method generates a random email address and enters it in the registration email field.

### enterPasswordToRegistrationField
```java
public LogInRegistrationPage enterPasswordToRegistrationField(String password)
```
This method enters the provided password in the registration password field.
- `password` - The password to be entered in the field.

### confirmPasswordToRegistrationField
```java
public LogInRegistrationPage confirmPasswordToRegistrationField(String password)
```
This method enters the provided password in the registration confirmation password field.
- `password` - The password to be entered in the field.

### clickRegister
```java
public LogInRegistrationPage clickRegister()
```
This method clicks the register button on the registration page.

### checkThatPopUpSuccessfulRegistrationDisplayed
```java
public LogInRegistrationPage checkThatPopUpSuccessfulRegistrationDisplayed()
```
This method checks that the pop-up for successful registration is displayed on the page.

### clickForgotPasswordButton
```java
public LogInRegistrationPage clickForgotPasswordButton()
```
This method clicks the forgot password button on the log in page.

### resetPassword
```java
public LogInRegistrationPage resetPassword(String email)
```
This method enters the provided email address in the forgot password email field, clicks the reset password button, and submits the form.
- `email` - The email address for password reset.

### checkThatPopUpExist
```java
public LogInRegistrationPage checkThatPopUpExist()
```
This method checks that the pop-up for password reset exists on the page.

### closePopUp
```java
public LogInRegistrationPage closePopUp()
```
This method closes the password reset pop-up.

### checkThatForgotPasswordButtonIsNotExistAfterPasswordReset
```java
public LogInRegistrationPage checkThatForgotPasswordButtonIsNotExistAfterPasswordReset()
```
This method checks that the forgot password button is not displayed on the page after a password reset.

## Useful details
The `LogInRegistrationPage` class uses the Selenide library for interacting with web elements and performing actions on a web page. It also uses the Apache Commons Lang library for generating random strings. There are no other specific details mentioned in the code file.