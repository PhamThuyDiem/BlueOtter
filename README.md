# BlueOtter Pre-Hiring Assignment

1> Install and add system PATH
* Install Java 8 or higher (you can refer to [this](https://java.com/en/download/help/download_options.xml) for more details)
* Install Maven (you can refer to [this](https://maven.apache.org/install.html) for more details)
* Install Allure (you can refer to [this](https://docs.qameta.io/allure/) for more details)

2> Run the automated script and view result
The following commands are the common commands for running test. These commands are executed in the BlueOtter folder, so please cd to this folder first.

* For running the whole tests
`mvn clean test -DsuiteXmlFile=src\test\testsuite\SigninSuite.xml,src\test\testsuite\SignupSuite.xml && pause && allure serve`

* For running the sign in tests
`mvn clean test -DsuiteXmlFile=src\test\testsuite\SigninSuite.xml -Dbrowser=ie && pause && allure serve`

* For running the sign up tests
`mvn clean test -DsuiteXmlFile=src\test\testsuite\SignupSuite.xml -Dbrowser=ie && pause && allure serve`

---

**Diem Pham**
