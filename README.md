# java-selenium
## TODO
Include example of dropdown page object interactions. "Sort by" is an example of this: http://automationpractice.com/index.php?id_category=3&controller=category

## Known Limitations
* Tests are only run in Chrome.
* Login is performed through the UI. Ideally an API call or creation of a cookie would be used instead.
* An account has been registered manually that is used for login. Ideally this would be setup and deleted before all tests are ran.

## Page Object Model
The tests utilise the [Page Object Model](https://www.pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests) design pattern.<p>
All pages extend from one [`BasePage`](src/main/java/pages/BasePage.java) class that holds common methods e.g. `getHeadingText()`.<p>
The [`PageUrls`](src/main/java/pages/PageUrls.java) class acts as 'constants file' to hold URLs which are used in the page objects and in the tests themselves. 

## Run Tests
To run all tests run `mvn clean test` in the command line.<p>
This will run all tests and generate reports in the [`target/cucumber-reports`](target/cucumber-reports) directory.

## Hooks
The tests make use of both [Cucumber hooks](https://cucumber.io/docs/cucumber/api/#hooks) and [TestNG annotations](https://testng.org/doc/documentation-main.html#annotations) in order to manage the state before and after each test runs.<p>
These are declared in the [`TestRunner`](src/test/java/support/TestRunner.java) class 

## Screenshots
A screenshot is only taken when a test fails.<p>
The screenshot is embedded into the [`target/cucumber-reports/cucumber-pretty`](target/cucumber-reports/cucumber-pretty) report.
