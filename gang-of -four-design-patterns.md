# Gang of Four Design Patterns

This name for the pattern originated from the book named “[Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/gp/product/0201633612/ref=as_li_tl?ie=UTF8&camp=1789&creative=390957&creativeASIN=0201633612&linkCode=as2&tag=triatcraft-20&linkId=XRGUDJCGWC6AJNZM)” Authored by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides . It got nicknamed Gangs of Four design patterns because of the four authors. Furthermore, it got a shorter name “***GoF Design Patterns***”.

The GoF wrote the book in a C++ context but it still remains very relevant to Java programming. C++ and Java are both object-oriented languages.

## GoF Design Pattern Types

GoF Design Patterns are divided into three categories:

1. **Creational**: The design patterns that deal with the creation of an object.
1. **Structural**: The design patterns in this category deal with the class structure such as Inheritance and Composition.
1. **Behavioral**: This type of design pattern provides solutions for better interaction between objects, how to provide lose coupling, and flexibility to extend easily in future.

## Creational Design Patterns
There are 5 design patterns in the creational design patterns category.

| **Pattern Name**                      | **Description**                                                                                                             |
|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| [Singleton](#singleton)               | The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created. |
| [Factory](#factory_)                  | The factory pattern takes out the responsibility of instantiating an object from the class to a Factory class.              |
| [Abstract Factory](#abstract-factory) | Allows us to create a Factory for factory classes.                                                                          |
| [Builder](#)                          | Creating an object step by step and a method to finally get the object instance.                                            |
| [Prototype](#)                        | Creating a new object instance from another similar instance and then modifying it according to our requirements.           |



---
## **Singleton**

**Java Singleton Pattern** is one of the **Gangs of Four Design patterns** and comes in the **Creational Design Pattern** category.

## **Singleton Pattern**
- The Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
- The singleton class must provide a global access point to get the instance of the class.
- Singleton pattern is used for logging, driver objects, caching and thread pool.
- Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
- Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.

## **Java Singleton Pattern Implementation**
To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.

- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.

We can have different approaches of Singleton pattern implementation and design concerns with the implementation.

1. Eager initialization
1. Static block initialization
1. Lazy Initialization
1. Thread Safe Singleton
1. Bill Pugh Singleton Implementation
1. Using Reflection to destroy Singleton Pattern
1. Enum Singleton
1. Serialization and Singleton

---
## **Factory** 

In Java applications, you might be often using the new operator to create an object of a class. This is often fine for small Java programs. But when you work on large-scale enterprise-class applications, the amount of code to create objects will gradually increase and will become scattered across the application. If class names are hardcoded in such code, the complexities of managing the code will keep increasing as you add new classes to the application. To address such concerns, you can use the factory method pattern. This pattern is a classic Gang of Four creational design pattern that is concerned with the creation of objects in an application. As the name suggests, the factory method pattern makes use of classes that act as factories to create objects. This pattern favors method invocation instead of making direct constructor calls to create objects. In the factory method pattern, you provide an interface, which can be a Java interface or an abstract class to create objects. A factory method in the interface defers the object creation to one or more concrete subclasses at run time. The subclasses implement the factory method to select the class whose objects need to be created.

![Factory Design Pattern](Aspose.Words.d9550ed7-18c5-470e-ba55-dc9d60d2ac62.001.png)The components of the factory method pattern in the context of the pizza store can be summarized as:

- Product (Pizza): Is an interface or an abstract class whose subclasses are instantiated by the factory method.
- ConcreteProduct (CheesePizza, PepperoniPizza, and VeggiePizza): Are the concrete subclasses that implement/extend Product. The factory method instantiates these subclasses.
- Creator (BasePizzaFactory): Is an interface or an abstract class that declares the factory method, which returns an object of type Product.
- ConcreteCreator (PizzaFactory): Is a concrete class that implements the factory method to create and return a ConcreteProduct to Client.
- Client: Asks the Creator for a Product.


A Client that requires a ConcreteProduct does not create any object but instead asks the Creator for it. The ConcreteCreator implements the factory method to create the object transparently from the Client. As a result, the Client is not required to be aware of any ConcreteProduct and how they are created. This approach advocates the Object-Oriented Programming principle “***Program to an interface, not an implementation** “*, which leads to polymorphism, a key feature of object-oriented programming. In addition, as object creation is centralized in the ConcreteCreator, any changes made to a Product or any ConcreteProduct does not affect the Client.	

In the examples above provided in the [github,](https://github.com/mlr28/gof-design-structure-example/tree/master/src/main/java/com/gof/design/creational/factory_design) we have not created any concrete **Pizza** objects in the code. Therefore, if we enhance the **Pizza** implementation classes in a newer release, we do not require updating any client or test code. 

Java APIs and frameworks extensively use the factory method pattern. You should also consider using it because of the advantages it provides. The key advantage that you have already learned, is how the factory method pattern helps encapsulate object creation code from client code. This decouples your client code from the concrete classes you need to instantiate. Therefore, while developing applications, if you see an opportunity to encapsulate object creation code, apply the factory method pattern. Also, by using this pattern you will have a centralized location for object creation code, which will make it easy for you to debug and troubleshoot.



#
# **Abstract Factory**
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
##
## Structural Design Patterns
There are 7 structural design patterns defined in the Gangs of Four design patterns book.

|**Pattern Name**| **Description**                                                                                                                                 |
| --- |-------------------------------------------------------------------------------------------------------------------------------------------------|
|[Adapter](https://www.digitalocean.com/community/tutorials/adapter-design-pattern-java)| Provides an interface between two unrelated entities so that they can work together.                                                            |
|[Composite](https://www.digitalocean.com/community/tutorials/composite-design-pattern-in-java)| Used when we have to implement a part-whole hierarchy. For example, a diagram made of other pieces such as circle, square, triangle, etc.       |
|[Proxy](https://www.digitalocean.com/community/tutorials/proxy-design-pattern)| Provide a surrogate or placeholder for another object to control access to it.                                                                  |
|[Flyweight](https://www.digitalocean.com/community/tutorials/flyweight-design-pattern-java)| Caching and reusing object instances, used with immutable objects. For example, string pool.                                                    |
|[Facade](https://www.digitalocean.com/community/tutorials/facade-design-pattern-in-java)| Creating a wrapper interface on top of existing interfaces to help client applications.                                                         |
|[Bridge](https://www.digitalocean.com/community/tutorials/bridge-design-pattern-java)| The bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client program. |
|[Decorator](https://www.digitalocean.com/community/tutorials/decorator-design-pattern-in-java-example)| The decorator design pattern is used to modify the functionality of an object at runtime.                                                       |
##
## Behavioral Design Patterns
There are 11 behavioral design patterns defined in the GoF design patterns.

|**Pattern Name**| **Description**                                                                                                                                   |
| --- |---------------------------------------------------------------------------------------------------------------------------------------------------|
|[Template Method](https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java)| used to create a template method stub and defer some of the steps of implementation to the subclasses.                                            |
|[Mediator](https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java)| used to provide a centralized communication medium between different objects in a system.                                                         |
|[Chain of Responsibility](https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java)| used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.                |
|[Observer](https://www.digitalocean.com/community/tutorials/observer-design-pattern-in-java)| useful when you are interested in the state of an object and want to get notified whenever there is any change.                                   |
|[Strategy](https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial)| Strategy pattern is used when we have multiple algorithms for a specific task and client decides the actual implementation to be used at runtime. |
|[Command](https://www.digitalocean.com/community/tutorials/command-design-pattern)| Command Pattern is used to implement lose coupling in a request-response model.                                                                   |
|[State](https://www.digitalocean.com/community/tutorials/state-design-pattern-java)| State design pattern is used when an Object changes its behavior based on its internal state.                                                     |
|[Visitor](https://www.digitalocean.com/community/tutorials/visitor-design-pattern-java)| Visitor pattern is used when we have to perform an operation on a group of similar kinds of Objects.                                              |
|[Interpreter](https://www.digitalocean.com/community/tutorials/interpreter-design-pattern-java)| defines a grammatical representation for a language and provides an interpreter to deal with this grammar.                                        |
|[Iterator](https://www.digitalocean.com/community/tutorials/iterator-design-pattern-java)| used to provide a standard way to traverse through a group of Objects.                                                                            |
|[Memento](https://www.digitalocean.com/community/tutorials/memento-design-pattern-java)| The memento design pattern is used when we want to save the state of an object so that we can restore it later on.                                |

||||
| :- | :-: | -: |

