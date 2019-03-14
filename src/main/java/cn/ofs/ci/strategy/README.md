<h1>目的

``策略模式：定义一系列算法，将每种算法封装起来，并且可以相互替换使用，策略模式让算法可以独立于使用它的客户应用而独立变化。``

<h1>实现过程

<p>1.需要一个总体结构负责保存当前的具体策略，然后在具体的使用方法中调用具体策略实现响应的算法。
<p>2.可以在适当的时候改变当前的策略
<p>3.每种条件分支作为一个具体的策略算法单独实现。

<h1>Java SDK中的策略模式

在JDK中存在着策略模式应用，例如在java.util.concurrent.ThreadPoolExecutor 线程池类中就存在着4种预定义的处理程序策略。
<p>1.ThreadPoolExecutor.AbortPolicy 默认策略模式；该策略在处理程序遭到拒绝的时候将抛出运行时RejectedExecutionException.
<p>2.ThreadPoolExecutor.CallerRunsPolicy 策略：线程调用运行该任务的execute本身，此策略提供简单的反馈控制机制，能够减缓新任务的提交速度。
<p>3.ThreadPoolExecutor.DiscardPolicy 策略：不能执行的任务将被删除。
<p>4.ThreadPoolExecutor.DiscardOldestPolicy 策略：如果执行程序尚未关闭，则位于工作队列头部的任务将被删除，然后充实执行程序（如果失败，则重复此过程）。

<h1>相关的设计模式
<p>1.抽象工厂模式：
<p>2.状态模式：个人认为状态模式和策略模式抛开策略模式是针对于算法来说，两者最大的却别是，状态模式中每个状态的选择都对象内部进行，而策略模式是交给外部进行。
<p>3.模板方法模式