# Spring Example - FBI (Field Based Injection)

It is a way to set up dependencies between objects in Spring framework by using annotations

> @Component
- It is used to mark a class as a Spring bean.
- It is used to mark a class as a candidate for component scanning and to make it a Spring bean

> @Autowired
- It is used to inject that bean into another class.
- It is used to mark a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.

>@ComponentScan
- It is used to scan for Spring components in the defined package and its sub-packages.
- Any class with the @Component annotation in this package will be automatically registered as a Spring bean.

## Flow 
- SpellChecker is a java file contains it's own constructor and a method called checkSpelling(). Also declared with @component annotation.
- TextEditor is a another java file which includes the SpellChecker object and It contains getter and setter method for the object 
- The setter method of the object is declared with @Autowired annotation. Another method named spellCheck() used to call the method called checkSpelling. Also declared with @component annotation
- The main class called Access.java, It contains AppilicationContext which includes beans.xml file and calls the method named spellCheck() in TextEditor class using AppilicationContext.
- In beans.xml file componentScan tag is declared.

## Addition
- Field based Configuration (@componentScan) can be implemented with Java Configuration file in replacement of XML file.
- Like this : [Click Here](https://github.com/Shrivishnu22/Virtusa_Learnings/blob/master/springJBC/src/main/java/conf/BeanConfig.java)
   
## Tech Stack 
- Java
- Spring
- Maven
