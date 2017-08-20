# Different Source Sets for Different Test Types

This project provides a baseline to separate unit and integration tests and use two totally different source sets
for each of them. After applying this `pom.xml` you should have the following directory structure:
```
-- src
    |-- integration
    |   |-- java
    |   |   -- [integration tests]
    |   |       
    |   -- resources
    |-- main
    |   |-- java
    |   |   -- [source code]
    |   |
    |   -- resources
    -- unit
        |-- java
        |   -- [unit tests]
        |
        -- resources

```

## Moment of truth
Just run the `mvn verify` command and:
```
[Truncated...]
[INFO] --- maven-surefire-plugin:2.20:test (default-test) @ maven-source-sets ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running me.alidg.NumbersTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.043 s - in me.alidg.NumbersTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ maven-source-sets ---
[INFO] Building jar: /Users/Ali/Desktop/Projects/Java/Maven/Source Sets/target/maven-source-sets-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-failsafe-plugin:2.20:integration-test (integration-test) @ maven-source-sets ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running me.alidg.NumbersIT
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s - in me.alidg.NumbersIT
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.264 s
[INFO] Finished at: 2017-08-20T16:56:35+04:30
[INFO] Final Memory: 20M/215M
[INFO] ------------------------------------------------------------------------
```