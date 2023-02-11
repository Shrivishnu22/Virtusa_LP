# Factory Design Pattern
- It is a creational design pattern that provides a way to create objects without specifying the exact class of object that will be created. 
- This is achieved by creating an interface for creating an object and implementing the interface in various classes that extend it.

> Interface 
- It is a blueprint of a class that specifies what methods and variables a class
- When a class implements an interface, it has to provide an implementation for all the methods defined in the interface.
- using interfaces provides a level of abstraction and decoupling, making the code more flexible, maintainable, and reusable.

## Work Flow 
- At first, the class was created with named [Employee](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/FactoryDesignPattern/src/main/java/container/Employee.java) having some attributes.
- A [Communication](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/FactoryDesignPattern/src/main/java/container/communication.java) interface is created and named as process.
- A seperate classes are introduced as [Email](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/FactoryDesignPattern/src/main/java/container/Email.java) and [Phone](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/FactoryDesignPattern/src/main/java/container/Phone.java).
- [Mode](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/FactoryDesignPattern/src/main/java/container/Mode.java) class is created and returns the class which matches with required attribute.
- Finally, [Access](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/FactoryDesignPattern/src/main/java/container/Access.java) class is created and *reference variable* for interface is introduced.
- another object is created for Mode class and passes the mode choice as parameter.
- The interface reference variable stores the respective object of a class.
- Interface calls the method of respective class.

## Tech Stack 
- Java 
- Maven
