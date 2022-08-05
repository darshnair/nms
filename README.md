# NMS Cinemas
## Group 6 - Project Case Study - NMS Cinemas - Java Microservices

## Project Timelines:
* Team Project  - 4-Aug-22  to 10-Aug-22
* Evaluation    - 10-Aug-22
---

## Project Collaborators:
* Mupparaju Ashok Kumar
* Sarvesh Ojha
* Manjunath S B
* Darsh Nair
* Raghav Agarwal
* KethamReddy Lokeshwar Reddy
---

## Project Tech Stack:
* Server-side:    Spring Boot, Spring Cloud, Spring Data JPA
* Database:       MySQL
* Server:         Embedded Tomcat
* DevOps:         Docker, Git-Hub
* Cloud Service:  AWS ECS
---

## Project Instructions:
* Group will be formed by SME’s.
* Participants should choose the project leader.
* Project Lead should assign the roles and responsibilities of project and update to team members.
* Read the project requirements document, identify the modules, and assign them to the members of the team.
* Project Lead should keep track of each team member's day-to-day activities in the Group activity template.
---

## Project Type: Online Movie Ticket Booking

## Project Domain: Entertainment

## Project Objective: 
Develop  a Backend  Restful  Web  services for  booking  movie  tickets  online  for  different  genres and 
languages based on the UI designed by front-end team using Java Microservice architecture.

## Background of the project: 
NMS Cinemas is a chain of single screen theatres that screen movie shows of different genres and languages at very genuine prices. 
It was established in 2004 in Pune, India. Recently, the business analysts noticed a decline in sales since 2010. 
They found out that the online booking of movie tickets from apps, such as BookMyShow and Paytm were gaining more profit 
by eliminating middlemen from the equation.Front-end team developed theUI in Angular with array as datastore. 
Now Team decided to develop required backend RESTful Web services based on the below UI using Java Microservice and 
AWS Cloud Architecture.The admin user will be able to Login to portal, create admin account,add,or remove different 
genres to or from the application to build a rich product line, edit movie details like name, ticket price, language, 
description, and show timings to keep it aligned to the current prices, enable,or disable movie shows, delete the movies, 
view different genres. The end user will be able to register to the application, change password, update profile, sign-in 
into the application to maintain the record of activities, Search for movie tickets based on the search keyword, 
apply filters and sort results based on different genres, add all the selected movie tickets to a cart and customize the 
purchase at the end, experience a seamless payment process, receive a booking summary page once the payment is complete.

## Angular Single Page Application (UI):

### Phase 1: Identify the services:
1. Review the Angular Single Page Application UI and Business Requirements mention above.
2. Identify the services and operations required as per the functionality.
3. Create a ms-word document and enlist all the services in the tabular format.

### Phase 2: Database Schema Design:
1. Identify domain objects and their attributes as per the requirement.
2. Create a Data Dictionary in the above ms-word document with below information:
  a. Name of the tables in the database.
  b. Constraints of a table i.e., keys, relationships, etc.
  c. Columns of the tables that related to each other.
3. Create a SQL file with the Schema about the database tables with necessary relationship.

### Phase 3: Back End Development Develop a RESTful Web API to perform CRUD operations on Domain objects as per requirements using Spring Boot and MySQL database:
Steps to develop a Restful Web API:
1. Create a Spring Boot application for each services using Spring boot starters.
2. Create Entity class for each domain object with required attributes.
3. Create Repository interface for CRUD operations using Spring Data JPA.
4. Create a Service class for writing the business logic, service-to-service calls and accessing the persistent layer.
5. Note:Use the Rest Template during the service-to-service calls with AWS.
6. Implement the Circuit Breaker design pattern using hystrix wherever synchronous service to service communication is required in service layer.
7. Create aRestController class for the services.
8. Identify the required MySQL database configuration. Apply the same step for creating all the required services.

### Phase 4: Adding the Containerization Capability Build a custom image for each service using a Dockerfile:
1. Create a “Dockerfile” in each service application
2. Add a maven plugin in the pom.xml for building and pushing docker images. 
3. Open the command, build the docker container image.
4. Login to Docker Hub. 
5. Finally, Tag and Push the microservice docker image to Docker Hub.

### Phase 5: Adding Microservice Capability: 
1. Use the AWS Parameter Store i.e., Centralized Configuration Management for your parameterslike credentialsor URL of load balancer during the service-to-service calls.
2. Identify the environment variables to be specified in Task Definition forthe specific service.
3. Create the parameters in the AWS Parameter Store for all the Services.
4. Mention all the parameters (with Name and Value) in Tabular format in the above created word document for each service.
5. Create a Task Definitions for each service in AWS ECS services with the Launch Type: Fargate.
6. Add the Environment Variables in Task Definition for each Service using the ARN of AWS Parameter Store.
7. Enable the Auto-configure CloudWatch Logs for all the services.
8. Create an AWS ECS cluster for all the services.
9. For dynamic registration, will make use of AWS Application Load Balancer and Target Group.
10. Create all the services using AWS ECS Service in the same cluster.
11. Use the single application load balancer forall the services.
12. Apply auto-scaling feature to each service.
13. Test all your service using the functional testing tools like Postman or curl. Add the screenshots in the above word documents. 

### Note:
* Use proper Java Naming Conventions(package, class and interface, variable names).
* Use Interfaces for loose coupling as and when required.
* Use Best Practices for REST API development.
* Use standard HTTP status codes: 404,500,200,201,401,403 while implementing.
* Apply necessary 12-factor app principles(https://12factor.net).
* Initially, separate the data store for each Microservice.
* Then keep the code at a similar level of maturity.
* After that, separately build each Microservice respective to its feature and then deploy it into containers.
* Finally, treat the servers stateless for communication.