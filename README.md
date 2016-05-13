# VerVal_Desktop
*Introduction to testing in Java.*

## Lab 1: The basics
Introduction to Junit and testing.

* Test class naming: `MyClassName` + `Test`
  * Example: `LogAnalyserTest`
* Test case naming: `myMethodName` + `_TestedCase` + `_ExpectedBehavior`
  * Example: `isValidLogFileName_ValidName_ReturnsTrue`

**Tests are annotated with `@Test`.** This annotation tells JUnit that the `public void` method to which it is attached can be run as a test case.
```Java
@Test
public void isValidLogFileName_ValidName_ReturnsTrue() throws Exception{
    assertEquals(true,logAnalyser.isValidLogFileName("perfectFileName.str"));
}
```

**If you weant to omit a test case use `@Ignore` annotation.** Methods annotated with `@Test` that are also annotated with `@Ignore` will not be executed as tests. Classes anottated with `@Ignore` will ignore all contained test. 
```Java
@Ignore
@Test
public void isValidLogFileName_ValidName_ReturnsTrue() throws Exception{
    assertEquals(true,logAnalyser.isValidLogFileName("perfectFileName.str"));
}
```

**Testing exceptions can be achieved with parameterised `@Test` annotation:**
```Java
@Test(expected = IllegalArgumentException.class)
public void isValidLogFileName_ToShort_ExceptionThrown() throws Exception {
    logAnalyser.isValidLogFileName("");
}
```
####[Fixtures](http://www.tutorialspoint.com/junit/junit_test_framework.htm)
> Fixtures is a fixed state of a set of objects used as a baseline for running tests. The purpose of a test fixture is to ensure that there is a well known and fixed environment in which tests are run so that results are repeatable. It includes:
* `setUp()` method which runs before every test invocation.
* `tearDown()` method which runs after every test method.

```Java
@Before
public void setUp(){
    logAnalyser = new LogAnalyser();
}

@After
public void tearDown(){
    // Nothing to do ...
}
```
####[Parameterized tests](http://www.tutorialspoint.com/junit/junit_parameterized_test.htm)
> Parameterized tests allow developer to run the same test over and over again using different values. There are five steps, that you need to follow to create Parameterized tests.
Annotate test class with @RunWith(Parameterized.class)
* Create a public static method annotated with @Parameters that returns a Collection of Objects (as Array) as test data set.
* Create a public constructor that takes in what is equivalent to one "row" of test data.
* Create an instance variable for each "column" of test data.
* Create your tests case(s) using the instance variables as the source of the test data.
The test case will be invoked once per each row of data.

```Java
@RunWith(Parameterized.class)
public class LogAnalyserTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "abc.str", true }, { "abc.str1", false }, { "abc.str2", false }
        });
    }
    
    @Parameterized.Parameter
    public String fInput;

    @Parameterized.Parameter
    public boolean fExpected;
    ...
    // Test using parameters
    @Test
    public void isValidLogFileName_validName_returnsTrue() throws Exception{
        Assert.assertEquals(fExpected,logAnalyser.isValidLogFileName(fInput));
    }
    ...
```
Now it's time to check out the [code](https://github.com/ablenesi/VerVal_Desktop/blob/master/src/test/java/ro/ubbcluj/scs/LogAnalyserTest.java)!
