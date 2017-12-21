# UIAutomation project

## Used technologies
* IntelliJ IDEA
* Git
* Maven 3
* Java
* jUnit 4
* Gherkin
* Cucumber
* Selenium WebDriver
* Page Object Model
* PageFactory
* DriverFactory

## Planned features 
* Parallel Test Execution

## Test environment setup

### Install the used technologies

#### Git Version control
Official page: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

#### Maven dependency tool
Official page: https://maven.apache.org/install.html

#### Java 8 SDK
Official page: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

### Checkout the source files from git
```git
git clone git@github.com:peterzsilak/UIAutomation.git 
```
## Running test packages

### Smoke test package
```bash
mvn clean verify -P SmokeTest
```
### Regression test package
```bash
mvn clean verify -P RegressionTest
```
## 