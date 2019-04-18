<h3>桥接模式（Bridge Pattern）

<h4>定义

    桥接模式的用意是 "将抽象化（Abstraction)与实现化（Implemention)脱耦，使得二者可以独立变化"。
    用意是把实现和它的接口分开，以便它们可以独立地变化。
    桥接模式并不是用来把衣蛾已有的对象接到不相匹配的接口上的，而是功能部分和实现部分的桥梁，使两部分独立扩展、变化，又不相互影响

<h4>抽象化

    抽取存在于多个实体的 "共同的"、"概念性的" "联系"，就叫抽象化

<h4>方法分析

    不使用继承，使用对象组合的方式，将两者的强关联关系变化为弱关联关系。

<h4>桥接模式主要包含如下几个角色：

    Abstraction：抽象类。 
    RefinedAbstraction：扩充抽象类。 
    Implementor：实现类接口。 
    ConcreteImplementor：具体实现类 。 

<h4>要点

    桥接模式的要点是区分功能层次和实现层次，然后使用聚合的方式，将要做的事情委托给实现部分办理。

<h4>扩展Java SDK
    
    桥接模式在JDK中有体现，如java.util.logging中的Handler和Formatter类，就是典型的桥接模式。