# Spring JDBC Template

Spring JDBC Template is designed to simplify the process of working with databases, making it easier for developers to write efficient and maintainable code

> Spring JDBC Template
- It is a tool provided by the Spring framework that makes it easier to work with databases in Java
- It provides a simple and consistent way to interact with databases, relieving the developer from having to write complex and error-prone JDBC code

> db.properties File
- It is a configuration file used in a Spring JDBC template application
- It contains properties thWhen a query is executed, the JdbcTemplate class calls the mapRow method for each row returned from the database and maps it to a separate object.at define the configuration details for the database connection, such as the URL, username, password, and driver class name

> RowMapper
- It is an interface in the Spring JDBC framework that maps the results of a query executed on a database to Java objects
- The RowMapper interface contains a single method mapRow that maps each row of the result set to a separate object
- When a query is executed, the JdbcTemplate class calls the mapRow method for each row returned from the database and maps it to a separate object.

## Flow
- At first, Student class is created with attributes like id, name, phone no, city.
- Another file called *db.properties* in which driverClass, URL, username, password of database are defined in this file.
- Using ApplicationContext, beans.xml file object gets created
- In beans.xml, we created a data source object using the class "org.springframework.jdbc.datasource.DriverManagerDataSource", in which properties are derived from *db.properties* file.
  - The JdbcTemplate class requires a DataSource as a constructor argument, which is being passed to the JdbcTemplate constructor through a constructor-arg tag with name "dataSource" and a reference to the "dataSourceObj" bean defined previously.
  - Another bean is created and represents an instance of the class "container.StudentDao", which is a DAO (Data Access Object) class used to interact with a database.
  - The PropertyPlaceholderConfigurer bean is used to load properties from a file called db.properties and make the values available to other beans defined in the configuration.
- Finally, with the help of *RowMapper*, the data from the database gets displayed.

## Quick Overview
- Beans.xml [Go ->](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/JdbcTemplate/src/main/java/beans.xml)
- Dao File [Go ->](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/JdbcTemplate/src/main/java/container/StudentDao.java)
- RowMapper.class [Go ->](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/JdbcTemplate/src/main/java/container/StudentRowMapper.java)
   
## Tech Stack 
- Java
- Spring JDBC
- Maven
