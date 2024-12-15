# Design Patterns Overview

This repository demonstrates the implementation of various design patterns categorized into **Behavioral**, **Creational**, and **Structural** patterns. Below is a description of each design pattern included in the project:

---

## **Behavioral Design Patterns**
Behavioral design patterns focus on improving communication between objects and making the interaction more flexible and extensible.

1. **Chain of Responsibility (ChainOfResponsibilityDP)**  
   The Chain of Responsibility pattern allows multiple objects to process a request in a chain, where each handler decides whether to handle the request or pass it to the next handler.  
   - **Use Case**: Logging frameworks, request handling in a web server.  
   - **Example**: A request for user permissions goes through multiple layers of validation, each layer either handles the request or forwards it.

2. **Mediator (MediatorDP)**  
   The Mediator pattern defines an object that acts as a central hub to facilitate communication between multiple objects, preventing direct interaction between them and reducing tight coupling.  
   - **Use Case**: GUI components where buttons, text fields, and checkboxes interact indirectly via a mediator.  
   - **Example**: A chat application where a central server relays messages between users.

---

## **Creational Design Patterns**
Creational design patterns focus on object creation mechanisms, providing flexibility in how objects are instantiated.

1. **Abstract Factory (AbstractFactoryDP)**  
   The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.  
   - **Use Case**: Cross-platform GUI frameworks that create Windows or Mac-style UI elements.  
   - **Example**: Creating different themes (light and dark) for a UI toolkit.

2. **Factory Method (FactoryDP)**  
   The Factory Method pattern defines a method in a base class to create objects, but allows derived classes to alter the type of objects that will be created.  
   - **Use Case**: When a class needs to delegate object creation to its subclasses.  
   - **Example**: A document editor creating different types of documents like Word or PDF files.

3. **Prototype (PrototypeDP)**  
   The Prototype pattern allows creating new objects by copying an existing object, which serves as a prototype. This approach avoids the overhead of creating objects from scratch.  
   - **Use Case**: When creating a large number of objects with similar properties.  
   - **Example**: Cloning a user profile or configuration settings in an application.

4. **Singleton (SingletonDP)**  
   The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.  
   - **Use Case**: Managing shared resources like a database connection or logging service.  
   - **Example**: A configuration manager that loads settings from a file and shares them across the application.

5. **Factory Test (FactoryDP_test)**  
   This directory contains test cases for the Factory Method pattern to ensure that the implementation meets expected behavior.

---

## **Structural Design Patterns**
Structural design patterns focus on composing classes or objects into larger structures while keeping them flexible and efficient.

1. **Composite (CompositeDP)**  
   The Composite pattern allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.  
   - **Use Case**: File systems where files and folders are treated the same way.  
   - **Example**: A drawing application where shapes can be grouped, and groups can be manipulated like single shapes.

2. **Decorator (DecoratorDP)**  
   The Decorator pattern dynamically adds behavior to an object without modifying its structure.  
   - **Use Case**: Adding features to a graphical component like scrollbars or borders at runtime.  
   - **Example**: Wrapping a text field object to add spell-checking functionality.

3. **Facade (FacadeDP)**  
   The Facade pattern provides a simplified interface to a larger body of code, making a system easier to use.  
   - **Use Case**: Simplifying interactions with a complex subsystem, such as a library for multimedia processing.  
   - **Example**: A hotel booking system providing a single API for searching and booking rooms.

4. **Proxy (ProxyDP)**  
   The Proxy pattern provides a surrogate or placeholder for another object to control access to it.  
   - **Use Case**: Implementing lazy initialization, access control, or logging for objects.  
   - **Example**: A virtual proxy that loads an image only when it is displayed.

---
