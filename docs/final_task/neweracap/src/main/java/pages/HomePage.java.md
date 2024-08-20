# HomePage.java
## Overview
The `HomePage` class represents the homepage of a web application. It provides methods to interact with elements on the homepage such as signing in or registering, and performing a search. The class uses the Selenide library for browser automation.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Useful details](#properties)

## Prerequisites
The following dependencies are required to use the `HomePage` class:
- Selenide: version not specified

## Usage
To use the `HomePage` class in a project, follow these steps:

1. Import the `HomePage` class into the desired file:
   ```java
   import pages.HomePage;
   ```
2. Instantiate the `HomePage` class:
   ```java
   HomePage homePage = new HomePage();
   ```
3. Use the available methods to interact with the homepage elements, such as:
   ```java
   homePage.openBaseUrl();
   homePage.clickOnSignInRegisterButton();
   homePage.searchSomeData("example");
   ```

## Methods
The `HomePage` class provides the following methods:

### `openBaseUrl()`
Opens the base URL of the web application.

Example usage:
```java
homePage.openBaseUrl();
```

### `clickOnSignInRegisterButton()`
Clicks on the sign-in/register button on the homepage.

Example usage:
```java
homePage.clickOnSignInRegisterButton();
```

### `searchSomeData(String text)`
Performs a search with the given text on the homepage.

Parameters:
- `text` (String): The text to search for.

Example usage:
```java
homePage.searchSomeData("example");
```

## Useful details
- The `HOME_URL` constant represents the URL of the homepage.
- The `signInRegisterButton` variable represents the sign-in/register button element on the homepage.
- The `searchButton` variable represents the search button element on the homepage.
- The `searchField` variable represents the search field element on the homepage.