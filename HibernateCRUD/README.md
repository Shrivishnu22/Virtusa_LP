# Hibernate - CRUD Operations

> JPA Repository
- It is a Java interface that extends the CrudRepository interface provided by Spring Data. 
- It provides a number of methods for performing CRUD (Create, Read, Update, Delete) operations on data stored in a database. 
- JPA Repository is used to simplify the database access by providing a higher-level abstraction layer, reducing the amount of code needed to perform common database operations. 
- The JPA Repository interface is a part of the Java Persistence API (JPA) and is used to manage the persistence of Java objects in a database.

> Thymeleaf
- It is a template engine for Java, which is used for web application development. 
- It allows developers to define HTML templates with placeholders for dynamic data, and then fill those placeholders with actual data at runtime.

`Note` For basics, Refer [here](https://github.com/Shrivishnu22/Virtusa_LP/tree/master/Hibernate)

## Work Flow 
- First of all, Created a class named [Product](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/HibernateCRUD/src/main/java/com/example/demo/model/Product.java) and defined the attributes in it.
- Implemented a interface named [ProductRepository](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/HibernateCRUD/src/main/java/com/example/demo/repository/ProductRepository.java) which extends `JpaRepository`
- In the JPA Repository implementation, there are two parameters, they are `Class name` and `Id Datatype`.
- Then, In the [ProductServices](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/HibernateCRUD/src/main/java/com/example/demo/service/ProductServices.java) interface, CRUD operation methods are defined and to be used in future.
- [ProductServiceImpl](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/HibernateCRUD/src/main/java/com/example/demo/serviceimple/ProductServiceImpl.java) class uses the method which is defined in `ProductServices` and CRUD operations of `JPA Repository` extends by `ProductRepository`
- The local instance of `ProductRepository` and it's constructor are created. The CRUD methods are implemented using In-built functions of `JPA Repository`.
- The Database URL, credentials and JSP path are defined in [Appilication.properties](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/HibernateCRUD/src/main/resources/application.properties). 
- The front-end [JSP files](https://github.com/Shrivishnu22/Virtusa_LP/tree/master/HibernateCRUD/src/main/resources/templates) are constructed with help of `thymeleaf`.
- In [ProductController](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/HibernateCRUD/src/main/java/com/example/demo/controller/ProductController.java), instance of `ProductServices` and it's constructor are defined. Using `ProductServices`, the CRUD methods are called and actions are made.
- Each methods are mapped with respective URLs using `@RequestMapping` annotation. It returns the specific `JSP page` for user's request.

## Tech Stack 
- Hibernate
- Thymeleaf
- MySQL
- Maven
