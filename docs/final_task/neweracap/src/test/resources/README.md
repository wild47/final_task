# docs/final_task/neweracap/src/test/resources/README.md

## Overview
The `resources` folder is used to store files that are essential for configuring and running tests in the software project. It contains the `suiteTest.xml` file, which is an XML file used to configure a TestNG test suite.

## Usage
To utilize the `resources` folder in your project, follow these steps:
1. Copy the `suiteTest.xml` file into your project's test resources directory.
2. Make any necessary modifications to the `suiteTest.xml` file to suit your specific testing requirements.

## Useful details
- The `suiteTest.xml` file in the `resources` folder defines two tests within the TestNG test suite: "logInTests" and "other".
- Each test contains a class, "NewEraCapTest", with a list of methods to be included in the test.
- The "logInTests" test includes the methods "userShouldLogIn" and "userShouldRestorePassword".
- The "other" test includes the methods "checkThatSearchWorksCorrect", "checkThatResultPageContainsSoManyCapsAsIndicated", and "checkThatRegistrationCompleteSuccessfully".