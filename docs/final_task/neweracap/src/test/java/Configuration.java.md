# Configuration.java
## Overview
The `Configuration` class is a Java file that is part of a larger software project. Its primary purpose is to set up the configuration for the project, including initializing various pages used in the project. It utilizes the Selenide library for browser automation and testing.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Useful details](#properties)

## Prerequisites
This file has the following dependencies:
- `com.codeborne.selenide.Selenide`
- `lombok.Getter`
- `org.testng.annotations.AfterClass`
- `org.testng.annotations.BeforeClass`
- `pages.HomePage`
- `pages.LogInRegistrationPage`
- `pages.SearchResultPage`
- `pages.caps_pages.AstrologyCapsPage`
- `pages.caps_pages.CitySeriesCapsPage`
- `pages.caps_pages.NflPlayoffsCapsPage`
- `pages.caps_pages.TeenageMutantNinjaTurtlesCapsPage`

## Usage
To use the `Configuration` class in a project, follow these steps:
1. Make sure all the necessary dependencies are available in the project.
2. Instantiate the `Configuration` class.
3. Call the `setUp()` method to initialize the configuration.

Example:
```java
Configuration configuration = new Configuration();
configuration.setUp();
```

## Methods
The `Configuration` class has the following methods:

### `setUp()`
This method is annotated with `@BeforeClass` and is called before the test class is executed. It sets up the configuration for the project by performing the following steps:
1. Clears the browser cookies.
2. Checks if the browser is Chrome.
3. Sets the browser window to start maximized.
4. Initializes various page objects used in the project.

### `shutDown()`
This method is annotated with `@AfterClass` and is called after the test class is executed. It shuts down the WebDriver and clears the browser cookies.

## Useful details
- The `Configuration` class uses the Lombok `@Getter` annotation to automatically generate getter methods for its instance variables.
- The `setUp()` method initializes various page objects, such as `HomePage`, `LogInRegistrationPage`, `SearchResultPage`, etc. These page objects are likely used for browser automation and testing purposes in the larger project.
- The `shutDown()` method is responsible for closing the WebDriver and clearing the browser cookies after the test class is executed.