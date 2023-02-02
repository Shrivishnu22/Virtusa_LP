# Spring Boot MVC [Model-View-Controller]

It is a variation of the traditional MVC pattern that makes use of the Spring Boot framework

> Spring Boot MVC
- It provides a simpler and faster way to develop MVC applications with Spring by removing much of the boilerplate code and configuration required in traditional Spring MVC
- It also integrates with other Spring technologies like Spring Data and Spring Security, making it easier to build complete web applications
- The Model, View, and Controller components remain the same in Spring Boot MVC, but with the addition of the Spring Boot framework, development becomes more streamlined and efficien

> Default packages
 - [Application.java](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringBootMVC/src/main/java/com/example/demo/MvcspringApplication.java)
      * This is the main class of your Spring Boot application.
      * It is responsible for starting the entire application and bootstrapping the required components such as web servers, databases, etc.
 - [ServletInitializer.java](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringBootMVC/src/main/java/com/example/demo/ServletInitializer.java)
      * This is a Java class that extends the SpringBootServletInitializer class. 
      * It is used to configure the application for deployment in a traditional Servlet container.
      * It provides a convenient way to configure and run a Spring Boot application as a WAR file

> WAR [Web ARchive]
- The file is a type of archive file that contains all the resources and components required to run a web application. 
- It is a standard format used to package and distribute Java Servlet applications. 
- A WAR file typically includes Java classes, JSPs (JavaServer Pages), HTML pages, images, and other resources required by the application.

> application.properties file
-  is a configuration file in Spring Boot that contains various properties and configuration settings used by your application. 
-  These properties can be used to configure various aspects of your application, such as database connection details
-  The information in the application.properties file is organized in simple key-value pairs, like "setting name" = "setting value"

> tomcat-jasper
- It is the JSP (JavaServer Pages) engine used in the Apache Tomcat web server. 
- It is responsible for converting JSP files into Java servlets and executing them to generate dynamic web pages. 
- Jasper provides a fast and efficient JSP engine for Tomcat, allowing developers to easily create dynamic web pages using JSPs.

>  @Service annotation
- is automatically registered as a bean in the Spring application context. 
- This means that you can use the @Autowired annotation to inject a service into another component, such as a controller, and
- have it automatically created and managed by the Spring framework

*Note:*
``` @PathVariable can be mentioned by / While @RequestParam must be mentioned by ? to access the data ```

## Work Flow
- A user makes a request to the web application using their web browser.
- The request is received by a [controller](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringBootMVC/src/main/java/com/example/demo/controller/WelcomeController.java) in Spring Boot, which acts as the main entry point for handling the request.
- The Controller then selects the appropriate [View component](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringBootMVC/src/main/webapp/views/welcomepage.jsp), which is responsible for rendering the data in a user-friendly format.
- The controller also fetches the data from [Service class](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringBootMVC/src/main/java/com/example/demo/service/WelcomeService.java) using *@service* annoatation.
- The View component uses the data returned by the Model to generate a response, which is then sent back to the user.
- The user sees the result of their request in their web browser.


## Tech Stack 
- Spring Boot MVC
- Maven
