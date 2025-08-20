Hexagonal Architecture Example with Java & Spring

This project is an example of Hexagonal Architecture with Java and Spring, demonstrating how to structure a web application in a maintainable and decoupled way.

-MAIN COMPONENTES-

Domain Objects
- Pure domain entities, free from external dependencies, that encapsulate business state and behavior.

Use Cases
- Classes representing specific use cases (e.g., SendMoneyUseCase) containing business logic but without external dependencies.

Input and Output Ports
Interfaces located in the core of the application:

Input Ports: defined to be invoked by incoming adapters (like web controllers).

Output Ports: interfaces for domain interaction with the outside world, such as repositories or notification services.

Adapters
- Concrete implementations that connect the outside world to the domain:

Incoming adapters (“driving adapters”): web interfaces that call the input ports.

Outgoing adapters: for persistence (e.g., JPA) that implement the output ports.
