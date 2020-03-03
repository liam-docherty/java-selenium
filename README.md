# java-selenium
## TODO
Include example of dropdown page object interactions. "Sort by" is an example of this: http://automationpractice.com/index.php?id_category=3&controller=category

## Run Tests
To run all tests run `mvn clean test` in the command line.<p>
This will run all tests and generate reports in the [`target/cucumber-reports`](target/cucumber-reports) directory.

## Hooks
The tests make use of both [Cucumber hooks](https://cucumber.io/docs/cucumber/api/#hooks) and [TestNG annotations](https://testng.org/doc/documentation-main.html#annotations) in order to manage the state before and after each test runs.<p>
These are declared in the [`TestRunner`](src/test/java/support/TestRunner.java) class 

## Screenshots
A screenshot is only taken when a test fails.<p>
The screenshot is embedded into the [`target/cucumber-reports/cucumber-pretty`](target/cucumber-reports/cucumber-pretty) report.
