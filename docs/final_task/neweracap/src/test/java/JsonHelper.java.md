# JsonHelper.java
## Overview
The `JsonHelper` class is used for reading JSON data from a file and converting it into test data for TestNG data providers. It provides a method `createDataFromJSON` that reads a JSON file, extracts the data for a specific test case, and converts it into a two-dimensional array of test data objects. The class is designed to be used in a software project that utilizes TestNG for test automation.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Useful details](#properties)

## Prerequisites
There are no external dependencies or prerequisites required to use the `JsonHelper` class.

## Usage
To use the `JsonHelper` class in a project, follow these steps:

1. Import the `JsonHelper` class into the desired Java file:
```java
import com.example.JsonHelper;
```

2. Call the `createDataFromJSON` method to generate test data from a JSON file:
```java
Object[][] testData = JsonHelper.createDataFromJSON(context, method);
```
The `context` parameter is an instance of `ITestContext` which provides information about the test context, and the `method` parameter is the `Method` object representing the test method for which the data is being generated.

3. Use the `testData` array in your TestNG test method for data-driven testing:
```java
@DataProvider(name = "testData")
public Object[][] testDataProvider() {
    return testData;
}

@Test(dataProvider = "testData")
public void testMethod(String param1, String param2) {
    // Test logic using the parameters
}
```

## Methods
### createDataFromJSON
```java
@DataProvider(name = JSON)
public static Object[][] createDataFromJSON(final ITestContext context, final Method method)
```
This method is a TestNG data provider that reads a JSON file and converts the data into test data for a specific test method.

Parameters:
- `context` - an instance of `ITestContext` that provides information about the test context.
- `method` - the `Method` object representing the test method for which the data is being generated.

Returns:
- a two-dimensional array of test data objects.

## Useful details
- The `JsonHelper` class uses the `org.json` library for parsing and manipulating JSON data.
- The JSON data is read from the file specified by the `PATH_TO_JSON` constant, which is set to "src/test/resources/jsonData.json".
- The JSON data is expected to have a specific structure where the keys represent test case names and the values are arrays of test data objects.
- The `createDataFromJSON` method retrieves the test data for a specific test case based on the method name and converts it into a two-dimensional array of test data objects.
- If there is an issue with the JSON data or parsing, an exception is thrown and an error message is printed to the console.