# Abstract Factory Design Pattern
- It is a type of design pattern that allows you to create objects that share common characteristics, but have different implementations.
- An abstract class is used to provide a common interface for its subclasses, and the subclasses are then responsible for providing their own implementation for the abstract methods.

> Abstract class
- It is a class that can't be instantiated, meaning that you can't create an object of the abstract class. 
- It provides a common interface for its subclasses. An abstract class can contain both abstract methods (methods without a body) and concrete methods (methods with a body). 
- Subclasses of an abstract class must implement the abstract methods, unless they themselves are abstract. 
- The purpose of an abstract class is to provide a common interface for a group of related classes.

### Interface Vs Abstract Class
- An abstract class is used when we want to provide a common base class for a set of related classes, and share common functionality among them. An abstract class can have abstract methods (methods without a body), which must be implemented by the concrete subclasses. It also can have concrete methods (methods with a body), which can be reused by the subclasses.
- An interface is used when we want to define a common behavior for multiple classes, regardless of their inheritance hierarchy. An interface can only contain abstract methods and constants. Classes that implement an interface must provide implementations for all the methods declared in the interface.
- Abstract classes are useful when we need to share common code among related classes, while interfaces are useful when we want to define a common behavior for unrelated classes.

### Factory Vs Abstract Design Pattern
- The key difference between the two patterns is that in the factory design pattern, we use a single factory class to create instances of multiple classes, 
- while in the abstract factory pattern, we use multiple factories, each creating instances of a single class. The abstract factory pattern is more flexible, as it allows us to easily change
- For more Detail explanation with Example. [Check it out](https://gist.github.com/Shrivishnu22/36469dc1be4d86316089ca188c1c5593).

## Tech Stack 
- Java 
- Maven
