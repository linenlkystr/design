<h1>定义

责任链模式（chain of responsibility Pattern）是一种对象的行为模式。在责任链模式中模式中，很多对象由每一个对象对共其下家的阴影而连接起来形成一条链。

<h1>涉及的角色

<p>1.抽象处理者角色（handler）：
<p>2.具体处理者的角色（ConcreteHandler）： 

<h1>相关的设计模式

<p>1.外观模式：在设置责任链中的链条时，可能会用到外观模式，让客户端应用只与外观打交道。
<p>2.组合模式：责任链模式也是一种树形结构，只不过它只有一条主干线而已，没有其他分支，因此可以说在责任链中应用了组合模式配置链条。
<p>3.命令模式：责任链模式中设计了请求传递的行为，请求的传递用到了命令模式。
<p>4.观察者模式：在涉及请求传递模式中，还有一个就是观察者模式。观察者模式和责任链模式是有区别的，1.观察者模式模式可以有多个接收者同时接收，而责任链模式只有一个接收者接收消息并传递。2.两个模式的职责是不同的，观察者模式主要是事件触发，将消息发送出去，是一种广播模式，而责任链模式模式是按照既定规则进行一些列的消息处理。

<h1>使用场合

<p>1.有多个对象处理同一个请求，具体由哪一个来处理还不确定，只有在运行时才能确定那个对象处理的情况。
<p>2.消息具有多个接收者，而接收对象又不明确的情况。只需要向其中一个对象发出消息，由其内部具体处理。
<p>3.同一个消息的多个处理对象可能会动态增加或者减少，需要动态地指定的情况。

<h1> Java SDK中的责任链模式

JDK中的责任链使用：java.lang.ClassLoader. 在ClassLoader 抽象类中，存在一个指向父类的指针parent，在构造方法中传入父类对象应用，在loadClass方法中就体现了责任链的处理过程。