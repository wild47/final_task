# docs/final_task/neweracap/src/test/java/README.md

## Overview
The `src/test/java` folder contains the test code for the NewEraCap project. It includes the `Configuration`, `JsonHelper`, and `NewEraCapTest` classes.

## Usage
To utilize the test code in your project, follow these steps:

1. Copy the `Configuration.java` file into your project's test folder.
2. Copy the `JsonHelper.java` file into your project's test folder.
3. Copy the `NewEraCapTest.java` file into your project's test folder.
4. Make sure to resolve any import statements that may be missing in your project.

Once the test code is in your project, you can use the `NewEraCapTest` class to run tests on the NewEraCap application. The test methods in this class cover various functionalities of the application, such as login and registration.

## Useful details
Here are some additional details about the test code:

- The `Configuration` class contains imports, class variables, and methods annotated with `@BeforeClass` and `@AfterClass`. It imports page classes from the `pages` package and classes from external libraries. It also imports static methods from the `com.codeborne.selenide.Configuration` and `com.codeborne.selenide.Selenide` classes. The class variables have getter annotations, allowing access to them from other classes.

- The `JsonHelper` class contains a static method called `createDataFromJSON`, which is annotated with `@DataProvider`. This method provides test data for TestNG tests. It reads JSON data from a file located at `src/test/resources/jsonData.json` and uses the `DefaultParameterNameDiscoverer` class from the Spring framework to retrieve the names of the test method parameters. The method then parses the JSON data and returns it.

- The `NewEraCapTest` class is a test class that extends the `Configuration` class. It contains multiple test methods annotated with `@Test` and uses the `JSON` data provider from the `JsonHelper` class. The test methods cover various functionalities of the NewEraCap application, such as login and registration.