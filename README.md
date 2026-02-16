# SOLID principles

SOLID principles are five design principles used in object-oriented programming to make software cleaner, more maintainable, flexible, and easier to understand.
They guide how you structure classes and dependencies so your code doesn’t become fragile or hard to change.
#
### S — Single Responsibility Principle (SRP)
A class should have only one reason to change.
That means a class should focus on one responsibility or concern. If a class handles multiple unrelated tasks, changes in one area can accidentally affect others. Keeping responsibilities separate makes code easier to understand, test, and modify.
In simple terms: one class, one job.
#
### O — Open/Closed Principle (OCP)
Software entities should be open for extension but closed for modification.
You should be able to add new behavior without changing existing, stable code. Instead of modifying old code every time requirements change, you extend the system in a way that preserves what already works.
In simple terms: add new features without breaking old ones.
#
### L — Liskov Substitution Principle (LSP)
Subtypes must be substitutable for their base types without altering the correctness of the program.
If a class inherits from another, it should behave in a way that does not surprise users of the base class. If replacing a parent type with a child type breaks the system, the design is flawed.
In simple terms: a subclass should truly be a specialized version of its parent, not a contradiction of it.
#
### I — Interface Segregation Principle (ISP)
Clients should not be forced to depend on methods they do not use.
Large, general-purpose interfaces can create unnecessary dependencies. It is better to have smaller, focused interfaces so that implementing classes only need to support what is relevant to them.
In simple terms: keep interfaces small and specific.
#
### D — Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions.
Instead of tightly coupling important business logic to specific implementations, depend on abstract contracts. This makes systems more flexible, testable, and easier to change.
In simple terms: depend on abstractions, not concrete details.
#
Together, SOLID principles encourage software that is modular, flexible, maintainable, and easier to evolve over time.
