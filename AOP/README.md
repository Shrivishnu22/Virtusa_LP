# Spring AOP - [Aspect-Oriented Programming]

> AOP
- It allows developers to encapsulate these cross-cutting concerns into modular and reusable components, 
- which can be easily plugged into different parts of the application, without affecting its core business logic. 
- This helps to improve code maintainability and modularity, and reduces code duplication.

> @Configuration
- Classes annotated with @Configuration are usually used as sources of bean definitions for the application context.
- It acts as a source of bean definitions for a Spring application context.

> @Aspect
- The @Aspect annotation enables the implementation of aspect-oriented programming (AOP) in the Spring framework.
- It is used to define a class as an aspect.
- A class can be designated as an aspect and its methods can be configured to run before, after, or around specific join points in the application. 
- Join points are specific points in the execution of a program, such as method calls, exception handling, and field access.

> @EnableAspectJAutoProxy
-  This annotation enables automatic proxying of beans marked with AspectJ annotations, which allows for seamless integration of AOP in a Spring-based application. 
-  By using this annotation, you can keep your business logic clean and separate from any cross-cutting concerns, making it easier to maintain and test your code.

> Joint points 
- Joint points in AOP refer to specific points in the execution of a program where an aspect can be applied. 
- Joint points are the locations in a program where an aspect's advice can be woven into the application.
- `jp.getSignature()` - It provides information about the method being called, its return type, parameters, etc.
- `jp.getArgs()[0].toString()` - It is a method call to access the first argument of the joint point jp and converting it to a string representation.

## Work Flow 
- At first, the [Main.class](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/AOP/src/main/java/container/Main.java) contains the definition of `ApplicationContext` of [BeanConf.class](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/AOP/src/main/java/container/BeanConf.java).
- After reaching the `BeanConf.class`, It encounters with `@ComponentScan` and `@EnableAspectJAutoProxy` annotation. It directs to [LoggingAspect](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/AOP/src/main/java/container/LoggingAspect.java) because of `@Aspect` annotation.
- Reads and ready to perform the methods with defined `@Before` and `@After` annotations.
- In `Main.class`, the two beans are defined and called the respective methods.
- Using `AOP`, The `Before` and `After` statements are executed with methods without code redundancy.

## Tech Stack 
- Spring
- AOP
- Maven
