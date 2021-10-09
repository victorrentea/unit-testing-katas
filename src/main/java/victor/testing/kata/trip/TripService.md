# Unit Testing with Mocks - Level 1
## Purpose
Practice writing unit tests on existing code by introducing mocks to decouple unwanted dependencies.

**This assignment can be done individually or in Pair Programming.**

## Goal
Test every single piece of logic in Trip Service, such that
if you edit the code and change the behavior of the current code,
at least one test will fail. 

**RULE** You are not allowed to change anything in the tested code until you fully test it.

Tip: start testing the code from the "outside" - from the shortest branches first.
"Dig in" the tested code progressively as you discover its behavior.

To check that your tests executed a certain line in prod code, you can use: 
- In IntelliJ: https://www.jetbrains.com/help/idea/running-test-with-coverage.html
- In Eclipse: https://developers.redhat.com/blog/2017/10/06/java-code-coverage-eclipse/

Please note that just having covered a line doesn't prove it's really tested. 
For example, try to remove that line and see if any tests are failing. 

After you finish unit testing it, refactor the production code to simplify it.

## Tips:
If you need a refresh on how to use mocks, or you don't know a certain feature (eg mocking static methods),
first read carefully MockitoShowcaseTest. 
