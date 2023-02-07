# JUnit

It can be used for testing individual units of code such as methods or classes

`@Test`
- It is used in JUnit to denote a method as a test method. 
- The test method should contain the logic for testing a specific functionality of the code. 
- JUnit framework will run all the methods annotated with @Test and report the success or failure of the test

`@DisplayName()`
- The custom display name will be used in test reports and other test output, instead of the default name derived from the class or method name
- Using @DisplayName can make test output more readable and easier to understand, especially when working with complex tests.

`@BeforeAll and @AfterAll`
- They are used to specify methods that need to be executed before and after all the test cases in a JUnit test class respectively.

`@BeforeEach and @AfterEach`
- It used to specify methods that should run before and after each test method respectively. 
- These methods are useful for setting up and cleaning up the environment for each test case.

`@Disabled`
-  This annotation is used to temporarily disable the test methods if they are undergoing maintenance.

`@ParameterizedTest and @CsvSource`
- @ParameterizedTest is a JUnit 5 annotation used to run a single test multiple times with different parameters
- @CsvSource is another JUnit 5 annotation used in combination with @ParameterizedTest to provide a CSV formatted string of parameters to a test method. The values in the CSV string are used as arguments to the test method.

## Work Flow
- Write test cases: Write test cases for [individual units](https://github.com/Shrivishnu22/Virtusa_LP/tree/master/JUnit/src/main/java/junit) of the code, covering all the possible scenarios.
- Configure JUnit: Integrate JUnit into the project. It can be done either by including JUnit JARs in the classpath or by using a build tool such as Maven or Gradle to manage dependencies.
- Create [Tester Class](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/JUnit/src/test/java/junit/Tester.java) : class that performs simple arithmetic operations like addition and subtraction. The class contains several test methods for testing the addition and subtraction operations. The test methods are decorated with JUnit annotations such as @Test, @BeforeEach, @AfterEach, @BeforeAll, @AfterAll, @Disabled, @ParameterizedTest and @CsvSource.
- Run test cases: Use JUnit to run the test cases. JUnit will automatically execute all the test cases and report the results.
- Analyze test results: Evaluate the results of the test cases to determine if the code is working correctly. If there are any failures, examine the test cases and the code to identify and fix the issue.
   
## Tech Stack 
- JUnit
- Maven
