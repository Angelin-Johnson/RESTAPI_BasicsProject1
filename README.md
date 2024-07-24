This project uses:
1.)IntelliJ
2.)Maven
3.)TestNG
4.)RestAssured

Maven:
---------------------------

Maven is an open-source build automation and project management tool widely used for Java applications.  
As a build automation tool, it automates the source code compilation and dependency management, assembles binary codes
into packages, and executes test scripts. Maven translates and packages your source code so that it becomes
an executable application.

https://www.browserstack.com/guide/what-is-maven-in-java

TESTNG:
----------------------------

-TestNG is a testing framework for Java that helps automate tests.
-It offers features like annotations, assertions and functionalities for data-driven testing and parallel testing.
-TestNG provides more powerful and flexible functionalities compared to JUnit.
-Common uses include unit testing, integration testing and end-to-end testing.
-You can write test cases in TestNG using annotations and leverage functionalities like parameterization.
TestNG is a testing framework for Java that helps in automating tests for your software applications.

It allows you to write and organize test cases, execute them efficiently, and generate detailed test reports. 
TestNG supports various testing scenarios like unit testing, integration testing, and end-to-end testing.

https://www.qable.io/blog/basic-of-testng-how-we-can-use-it-in-the-testing


JSONPath:
--------------------------------------
JSONPath is a query language for JSON, similar to XPath for XML.
AlertSite API endpoint monitors let you use JSONPath in assertions to specify the JSON fields 
that need to be verified.
https://support.smartbear.com/alertsite/docs/monitors/api/endpoint/jsonpath.html
Evaluator:https://jsonpath.com/

Hamcrest Library:
-----------------------------------------
https://www.vogella.com/tutorials/Hamcrest/article.html

Specification:
-------------------------
1.)If you have multiple tests and wants to avoid duplicate requests parameters and response.
You can use the specification object. 
2.)There are two types of specification builder java class.
    -RequestSpecBuilder
            If require common parameters to build a request for multiple tests.
            io.restassured.builder.RequestSpecBuilder
    -ResponseSpecBuilder
            To validate common response or needed for multiple tests from the body.
            io.restassured.builder.ResponseSpecBuilder

Serialisation and Deserialization:
---------------------------------------

https://blog.nonstopio.com/serialization-and-deserialization-in-rest-assured-api-testing-371c467edc7eSerialization is the process of translating a data structure 
or object state into a format that can be stored or transmitted and reconstructed later. 
The opposite operation, extracting a data structure from a series of bytes, is deserialization.

To create a Pojo class:https://www.jsonschema2pojo.org/
ObjectMapper Class: https://www.baeldung.com/jackson-object-mapper-tutorial

Authentication:
--------------------------------------------
https://docs.github.com/en/rest/authentication/authenticating-to-the-rest-api?apiVersion=2022-11-28

File upload and download:
----------------------------------------------
Async API:
--------------------------------------------------
An asynchronous API, or async API for short, is essentially an API that does not provide data immediately. 
It's implied that the user will likely have to wait until later for the data from their request to be delivered.
https://blog.hubspot.com/website/asynchronous-api
https://medium.com/@huzefa.qubbawala/design-and-implementation-of-an-asynchronous-api-model-for-long-running-operations-in-rest-api-3303ba6d45a2

Proxy:
-----------------------------------------------------
An API proxy is a thin application program interface (API) server that exposes an interface for an existing service or services.
A "proxy" is something that acts as an agent or intermediary for something else. 
In software design, proxies are often used to decouple two software components so they can evolve independently.
In modern computing, and in particular with hybrid clouds, proxies are used to decouple front-end and back-end service 
components, the former normally deployed in the cloud and the latter in the data center.
- Charles is used as proxy here
- 
Allure Report:
-------------------------------------------------------
setup-https://qaautomation.expert/2023/10/05/integration-of-allure-report-with-rest-assured-and-testng/
annotation:https://sarkershantonu.github.io/2021/04/29/allure2-annotations/qa autoamtion expert allure

rt



            

