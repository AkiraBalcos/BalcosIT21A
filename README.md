Polymorphism and Abstraction

1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?
- Method overriding is important because it allows child classes to provide their own behavior for a method inherited from the parent class. In my Notification System, both `EmailNotification` and `SMSNotification` override the `sendNotification()` method to display different messages. If a child class does not override the method, it will use the parent's original method instead.

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?
- We cannot create an object directly from an abstract class because it may contain abstract methods that do not have a complete implementation. The purpose of this restriction is to make sure that child classes provide the required behavior before their objects are created. It also helps organize and maintain a common structure for related classes.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?
- I can add another child class that extends the `Notification` parent class and overrides the `sendNotification()` method. For example, I can create a `PushNotification` class that sends notifications to a mobile application. The existing program can support this new class without changing the other child classes.

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.
- Yes, polymorphism and abstraction can work together in one program. Abstraction provides a common structure through an abstract parent class, while polymorphism allows different child classes to perform different actions using the same method. For example like my activity in polymorphism and abstraction, an abstract class called `SmartDevice` can have an abstract method called `turnOn()`. The child classes `SmartLight` and `SmartFan` can implement this method differently. A parent-class reference can hold either child object and call its corresponding `turnOn()` method. This demonstrates both abstraction and polymorphism.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?
- As a future programmer, I would use polymorphism when I want different classes to perform different actions using the same method. It makes a program more flexible and easier to expand. I would use abstraction when I want to hide unnecessary implementation details and provide a common structure for related classes. It helps make programs more organized, understandable, and easier to maintain.