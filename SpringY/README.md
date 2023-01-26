# Spring Bean Object Creation 

> Spring
- Spring framework is a powerful and popular Java framework that provides a comprehensive infrastructure for developing Java applications
- It provides a range of features such as Inversion of Control, Aspect-oriented programming, a container, data access and web application dev

> Spring ApplicationContext
-  It is a container that holds the spring beans and manage their lifecycle. 
-  It is responsible for creating and initializing the beans, injecting their dependencies and managing their interactions with other beans

> Beans 
- It is a Java object that is managed by the Spring container. 
- Beans are typically used to represent the components of an application, such as services, repositories, and controllers

## Working

- First of all, I have created a class named "Student" and it has two properties as name and Id.
- Using AppilicationContext of spring, I have connected the beans.xml file
- In beans.xml, Using property tag I have appended the values with pre defined attributes.
- Displaying the values by calling getter function from Bean Object using AppilicationContext variable


## Tech Stack 
- Java
- Spring
- Maven
