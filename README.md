# OOTP
# **LR #1**

## **FactoryMethod**
The Factory Pattern, also known as the Factory Method Pattern, suggests that you should define an interface or abstract class for creating an object, while leaving it up to the subclasses to decide which class to instantiate. In simpler terms, subclasses have the responsibility of creating an instance of the class.

Abstract class - AbstractFactory.java - 3 building methods

Empire and Modern factory extending abstract factory and implementing it methods according to his own specifications


# **LR #2**
## **Prototype**
The Prototype pattern is a creational design pattern that enables the cloning of objects, including complex ones, without being dependent on their specific classes.

Interface Product.java defining contract to clone some product and get info about it.
Char.java - implementing an interface and their methods (defining how to clone (copy object) himself)


# **LR #3**
## **Strategy**
The Strategy pattern is a behavioral design pattern that allows you to define a group of algorithms, encapsulate each algorithm in a separate class, and make the objects of these classes interchangeable.

In this pattern example, I define which engine will be used to build the car.
Movable.java - main interface for controlling the car movements.
ElectricMove.java and PetrolMove.java - simple engine realization (they implementig Movable)

Car.java - class representing a car
 

# **LR #4**
## **Command**
The Command pattern is a behavioral design pattern that transforms a request into a self-contained object, encapsulating all the information related to the request. This transformation enables passing requests as method arguments, delaying or queuing the execution of a request, and supporting undoable operations.

This pattern represents the operation of a simple cafe that receives orders in order of priority from guests.

# **LR #5**
## **Iterator**
The Iterator pattern is a behavioral design pattern that allows you to iterate over the elements of a collection without exposing its underlying representation, such as a list, stack, tree, and so on.

This is a simple implementation of this pattern using the example used in the factory method. Allows you to iterate over different types of chairs using the universal List.


# **LR #6**
## **Interpreter**
The Interpreter pattern is a design pattern that defines a way to evaluate sentences or expressions in a language. The fundamental concept is to have a dedicated class for each symbol, whether it is a terminal or nonterminal, in a specialized computer language.

I implement this template using an example of filtering candidates by knowledge, using 3 types of conditions.


# **LR #7**
## **Memento**
The Memento pattern is a behavioral design pattern that allows you to save and restore the previous state of an object without exposing the implementation details.

This pattern represents the operation of a simple cafe that receives orders in order of priority from guests and can save orders in the order history and make them again if the user liked what was cooked for him.


# **LR #8**
## **Decorator**
The Decorator pattern is a structural design pattern that enables you to add new functionalities or behaviors to objects by enclosing them within special wrapper objects that encompass the desired behaviors.

To implement this pattern, I used the analogy of cooking a pizza, and adding additional ingredients to it using (from the programming side) decorator classes, which are determined by the ToppingDecorator contract.

## **Adapter**
The Adapter pattern is a structural design pattern that facilitates collaboration between objects with incompatible actions.

To implement this pattern I used the analogy of using a character in a simple computer game. In this game, the character has only three types of actions:
1. use a weapon
2. to walk a certain distance
3. interact with the enemy

Using the EnemyWeaponAttacker interface, a contract is negotiated with successors, who will be able to perform the 3 actions mentioned earlier.
So I'm using different heroes with different implementations using the same input interfaces.
