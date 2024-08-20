# docs/final_task/neweracap/src/main/java/pages/README.md

## Overview
The `pages` folder contains the page object classes for different pages of a web application. These classes provide methods to interact with the elements on each page, such as clicking buttons, entering data, and verifying content. They are designed to make it easier to write automated tests for the application and encapsulate the logic and actions related to each page.

## Usage
To use these page object classes in a project, follow these steps:

1. Make sure you have the necessary dependencies. The `HomePage` class requires the Selenide library for browser automation.

2. Import the desired page object class into your test script or code file.

3. Instantiate an object of the page object class.

4. Use the provided methods of the page object class to interact with the elements on the page.

## Useful details
- Each page object class represents a specific page of the web application and provides methods related to that page.
- The classes are designed to improve test code maintainability and readability by encapsulating page-specific logic.
- The classes may have dependencies on external libraries or frameworks, so make sure to import the necessary dependencies.
- Refer to the documentation of each page object class for detailed information on the available methods and their usage.

### LogInRegistrationPage.java
This file represents a page object class for a log in and registration page. It provides methods to interact with the elements on the page, such as entering email and password, clicking buttons, and checking for the presence of certain elements. This class is specifically designed to facilitate automated tests for the log in and registration functionality of the application.

### SearchResultPage.java
This file represents a page object class for the search result page of a web application. It provides methods to verify the content and functionality of the search result page, such as checking the number of displayed items and selecting the number of items to be displayed. The class encapsulates the logic and actions related to the search result page and allows other parts of the project to interact with it efficiently.