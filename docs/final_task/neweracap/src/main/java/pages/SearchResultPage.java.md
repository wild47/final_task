# SearchResultPage.java
## Overview
The SearchResultPage.java file is a Java class that represents the search result page of a web application. It provides methods for verifying the content and functionality of the search result page, such as checking the number of displayed items and selecting the number of items to be displayed.

This class plays a role in the software project by encapsulating the logic and actions related to the search result page. It allows other parts of the project to interact with and verify the state of the search result page.

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Usage](#usage)
3. [Methods](#methods)
4. [Useful details](#properties)

## Prerequisites
There are dependencies required to use the SearchResultPage class:
- [Selenide](https://selenide.org/) library: version not specified

## Usage
To use the SearchResultPage class in a project, follow these steps:
1. Ensure that the Selenide library is added as a dependency in the project.
2. Create an instance of the SearchResultPage class:
```java
SearchResultPage searchResultPage = new SearchResultPage();
```
3. Use the available methods to interact with and verify the search result page.

## Methods
The SearchResultPage class provides the following methods:

### checkThatResultPageContainsSearchInput(String text)
Verifies that the search result page contains the specified text.
- Parameters:
  - text: The text to be checked in the search result page.
- Returns: The SearchResultPage instance.

### resultPageContainsTwelveCaps()
Verifies that the search result page contains twelve caps.
- Returns: The SearchResultPage instance.

### resultPageContainsTwentyFourCaps()
Verifies that the search result page contains twenty-four caps.
- Returns: The SearchResultPage instance.

### resultPageContainsFortyEightCaps()
Verifies that the search result page contains forty-eight caps.
- Returns: The SearchResultPage instance.

## Useful details
- The SearchResultPage class uses the Selenide library for interacting with web elements.
- It has private SelenideElement variables representing various elements on the search result page, such as the search result heading, pagination, drop-down menu for selecting the number of caps, and different options for the number of caps.
- The class uses CSS and XPath selectors to locate the elements on the page.
- The class has a collection of SelenideElements representing the caps displayed on the search result page.
- The methods of the class perform actions such as clicking on elements, scrolling, and verifying the size of the caps collection.