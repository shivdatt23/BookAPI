# BookAPI
 BookAPI is a CRUD REST API built using Spring Boot 3, Spring Data JPA, and MySQL Database.

BOOKAPI is hosted in Railway Application (same as heroku)

Domain Name :- 
https://bookapi-production-cd53.up.railway.app/books

 
 The API first create, update, delete, retrieve of the BOOK and AUTHOR.
 1.Project Structure
 
 ![project_structure](https://github.com/shivdatt23/BookAPI/assets/64527116/71468d24-6d02-4d41-8c9f-d3437784097b)

2.Configuring MySQL database
  MySQL is the database and we need to configure the URL, username, and password so that our Spring boot can establish a connection with the database on startup.
  Open the src/main/resources/application.properties file and add the following properties to it.
  Here i have created two profiles of the application.properties
          --- application-dev.properties (local machine)
          --- application-prod.properties (hosted on cloud server)

3. Create JPA entity (BOOK and AUTHOR)
4. Create Spring Data JPA Repository for Book Enity
5. Service Layer Implementation
6. Creating BookController
7. Run the Application
   The controller is responsible for handling incoming HTTP requests and returning the appropriate response.
   it get defined the endpoints of the API and map them to the appropriate methods in the Service layer.
8. Test the SpringBoot CRUD API using POSTMAN client


   -- GET
   
   
   

  ![get_map](https://github.com/shivdatt23/BookAPI/assets/64527116/1cdb3f0e-a717-49b0-b328-37181cf4c6ea)

  -- POST



  ![post_map](https://github.com/shivdatt23/BookAPI/assets/64527116/01323ace-8012-475b-b71e-c629dfa9f536)

  --MODIFY

  ![update_map](https://github.com/shivdatt23/BookAPI/assets/64527116/cdaf4d2e-cdf6-4ed3-b578-07e92d2b6bc3)



  --DELETE



![delete_map](https://github.com/shivdatt23/BookAPI/assets/64527116/7f7b97ae-89e7-4834-9c70-0a90481ce6c8)

  
