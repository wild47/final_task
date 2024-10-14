# docs/final_task/neweracap/src/main/java/pages/README.md

## Overview
The `pages` folder contains Java classes that represent different pages of the website. These classes are responsible for interacting with the elements on their respective pages.

## Usage
To use the classes in this folder, you need to instantiate them in your code and call their methods to perform actions on the corresponding pages.

For example, to interact with the home page, you can instantiate the `HomePage` class and call its methods to open the home URL, click on the sign-in/register button, or perform a search.

```java
HomePage homePage = new HomePage();
homePage.openBaseUrl();
homePage.clickSignInRegisterButton();
homePage.performSearch("example search term");
```

Similarly, you can instantiate the other page classes (`LogInRegistrationPage`, `SearchResultPage`, etc.) and call their methods to perform actions on those pages.

## Useful details
- The classes in this folder import classes and methods from the Selenide and Selenium libraries, which are used for web automation.
- Each class has private instance variables that represent elements on the page, such as buttons, input fields, etc.
- The classes have methods that allow you to interact with the elements on the page, such as clicking buttons, entering text, etc.
- It is recommended to thoroughly test the code and ensure it meets the requirements before using it in a production environment.