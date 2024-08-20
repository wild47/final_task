# suiteTest.xml
## Overview
The `suiteTest.xml` file is an XML file that serves as a test suite configuration for the TestNG testing framework. It specifies the tests that should be executed and their corresponding classes and methods. This file plays a crucial role in a software project as it allows developers to define and organize their tests in a structured manner.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Useful details](#properties)

## Prerequisites
There are no specific dependencies or prerequisites required to use the `suiteTest.xml` file.

## Usage
To use the `suiteTest.xml` file in a project, follow these steps:
1. Create an XML file with the name `suiteTest.xml` (or any desired name).
2. Specify the desired test suite configuration using the XML structure shown in the example below.
3. Save the file in a location accessible to the testing framework.

## Methods
The `suiteTest.xml` file does not contain any methods or functions. It is purely used as a configuration file for the TestNG testing framework.

## Useful details
- The `suiteTest.xml` file follows the XML format and starts with the XML declaration `<?xml version="1.0" encoding="UTF-8"?>`.
- The file uses the `<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">` declaration to define the document type as a TestNG suite file.
- The `suite` element represents the test suite and has the following attributes:
  - `name`: Specifies the name of the test suite.
  - `parallel`: Specifies the parallel execution mode for the tests. In this example, the value is set to "tests", meaning the tests will run in parallel.
  - `thread-count`: Specifies the number of threads to be used for parallel execution.
  - `preserve-order`: Specifies whether the order of tests should be preserved. In this example, it is set to "true".
- The `test` element represents an individual test within the test suite and has the `name` attribute to specify the test name.
- The `classes` element contains the classes that should be included in the test. In this example, the `NewEraCapTest` class is included.
- The `methods` element specifies the individual test methods that should be executed within the class. In this example, the `include` elements specify the test methods to be executed.

Example:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="test suite" parallel="tests" thread-count="5" preserve-order="true">
    <test name="logInTests">
        <classes>
            <class name="NewEraCapTest">
                <methods>
                    <include name="userShouldLogIn"/>
                    <include name="userShouldRestorePassword"/>
                </methods>
            </class>
        </classes>
    </test>
    <test name="other">
        <classes>
            <class name="NewEraCapTest">
                <methods>
                    <include name="checkThatSearchWorksCorrect"/>
                    <include name="checkThatResultPageContainsSoManyCapsAsIndicated"/>
                    <include name="checkThatRegistrationCompleteSuccessfully"/>
                </methods>
            </class>
        </classes>
    </test>
</suite>
```