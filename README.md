# user-file-service
**Add and retrieve Users from a file.**

Steps to execute the service on local system.

1. Clone the repository locally and open the project in IntelliJ.
2. Ensure that you are using Java 11 or above (export JAVA_HOME=`/usr/libexec/java_home -v 11`)
3. On IntelliJ terminal execute `./gradlew clean build` to build the project.
4. On IntelliJ terminal execute  `./gradlew bootRun` to start the service.

The service has two endpoints. After starting the service locally ,refer http://localhost:8080/swagger-ui/index.html to view the endpoints.

1. To add users in the file , submit a post request using Swagger link [http://localhost:8080/swagger-ui/index.html#/user-file/insertUserData](http://localhost:8080/swagger-ui/index.html#/user-file/insertUserData) .
2. Click the "**Try it out**" button on the right-hand corner and post the below example request body. Change values to submit multiple requests.

`   { "userID": "debadesarkar",
   "hasPassword":"x",
   "userIdentifier": 1001,
   "groupIdentifier":1000,
   "gecosField":"Debayan De Sarkar,Room 1009,(234)555-8987,(234)555-1270",
   "homeDirectory":"/home/debadesarkar",
   "startProgram":"/bin/sh"
   }`

3. Click the **Execute** button to submit the above json payload.
4. To view the list of users, hit the link [http://localhost:8080/rest/v1/users-list](http://localhost:8080/rest/v1/users-list) on a browser.
5. Alternatively you can also access the Swagger link [http://localhost:8080/swagger-ui/index.html#/user-file/getAllUsers](http://localhost:8080/swagger-ui/index.html#/user-file/getAllUsers) , click on **Try it out** button on the right-hand corner and hit the **Execute** button to submit the request. 
