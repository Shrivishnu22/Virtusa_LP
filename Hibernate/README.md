# Hibernate - ORM [Object Relational Mapping]

Hibernate is a Java framework used for object-relational mapping (ORM) for database management

> JPA [Java Persistence API]
- It is a standard interface for managing relational databases in Java applications. 
- JPA provides a set of specifications for storing, accessing, and managing data in a relational database using Java code. 
- JPA can be implemented by various ORM (Object Relational Mapping) frameworks, including Hibernate
- *Developers interact with databases without having to write complex SQL statements, and instead use Java objects to manage the data.*

> @Entity
- It is a JPA annotation that marks a Java class as an entity bean. It is used to map the class to a database table

> @Table 
-  It is a JPA annotation that is used to specify the name of the table to which the entity maps
-  If no @Table annotation is specified, the default name of the table will be the name of the class, with the first letter of each word capitalized

> @Id and @GeneratedValue
- ```@Id``` is a JPA annotation that is used to specify the primary key of an entity in a database table
- ```@GeneratedValue``` is another JPA annotation that is used to specify how the primary key value of an entity is generated. 
- It can be used in conjunction with @Id to specify the generation strategy, such as auto-increment or sequence

> Service Registry
- It is a registry of services that are used by Hibernate to connect to a database. 
- It is a mechanism to manage the configuration settings of various services that Hibernate needs in order to interact with a database

> Session Factory
- It is a factory class in Hibernate that provides a factory method to get the session objects to communicate with the database.
- The session factory can create multiple sessions, and each session is used to interact with the database to perform various CRUD operations.

> Transaction 
-  A transaction is a unit of work that is either committed or rolled back.
-  All the database operations performed within the transaction are executed as a single unit of work. 
-  If any of the operations fail, the transaction is rolled back and all the changes made during the transaction are undone. 
-  If all the operations are successful, the transaction is committed and the changes are persisted in the database.

## Flow 
- Created a class named [Person](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/Hibernate/src/main/java/hibernate/Person.java) with some attributes and annotated with `@Entity` and `@Table`.
- `@Id` and `@GeneratedValue` is surrounded with attribute named roll. It assigns the roll as *primary key*.
- Created a configuration file (e.g. [hibernate.cfg.xml](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/Hibernate/src/main/resources/hibernate.cfg.xml)) to configure Hibernate, such as specifying the database connection details, and mapping files.
- Creating an instance of the Configuration class from Hibernate in [Access.java](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/Hibernate/src/main/java/hibernate/Access.java). The .configure() method is used to load the Hibernate configuration properties from the default hibernate configuration file, hibernate.cfg.xml.
- The ```addAnnotatedClass(Person.class)``` method is used to add a class to the configuration. This is needed because Hibernate needs to know which classes should be persisted to the database. In this case, the Person class is being added.
- The `ServiceRegistryBuilder` creates a `ServiceRegistry` object that is used to store configuration information for a Hibernate session factory. 
- The properties are applied to the service registry using `applySettings` method. Then, the `config.buildSessionFactory` method uses the service registry to create a `SessionFactory` object.
- Finally, a new Session object is opened from the `SessionFactory`. The Session object is the primary interface for performing CRUD (Create, Read, Update, Delete) operations on your database tables
- Certain functions are created to perform CRUD operations using Session in-build functions is surrounded by Try-Catch block to handle the Hibernate exceptions.

## Tech Stack 
- Hibernate
- MySQL
- Maven
