# mufiye_design_pattern
## UML
* 依赖：A类中使用到了B类，A类依赖B类
* 泛化：可以理解为继承，是依赖关系的特例
* 实现：一个类实现一个接口，也是依赖关系的特例
* 关联：实际上就是类与类之间的联系，也是依赖关系的特例
    - 具有方向性：单向和双向
    - 具有多重性
* 聚合：表示的是整体和部分的关系，是关联关系的特例
* 组合：组合和聚合的关系是生命周期关系的不同，组合整体的生命周期大于等于部分
## 设计模式的七大原则
### 单一指责原则
降低类的复杂度，一个类只负责一项职责：
* 提高类的可读性
* 降低变更带来的风险
### 接口隔离原则
一个类对另一个类的依赖应该建立在最小接口上；如果被依赖的类实现的接口包括过多不需要的方法，可以对接口进行分割，将其拆分为好几个接口
### 依赖倒转原则
* 高层模块不应该依赖低层模块，二者都应该依赖其抽象
* 抽象不应该依赖细节，细节应该依赖抽象
* 依赖倒转（倒置）原则的中心思想是面向接口编程
* 相对于细节的多变性，抽象的东西要稳定的多；在java中，抽象指的是接口和抽象类，细节就是具体的实现类
* 使用接口和抽象类的目的就是制定好规范，而不涉及具体的操作
### 里式替换原则
这个原则与继承有关系
问题：
* 父类中实现好的方法，实际上是在设定规范和契约，如果子类对父类中已经实现的方法任意修改，会对整个继承体系造成破坏
* 父类修改后，所有涉及到子类的功能都有可能发生故障
原则： 
对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有对象o1都代换为o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象
* 在子类中尽量不要重写父类的方法
* 继承实际上让两个类的耦合性增强了，在适当的情况下，可以通过聚合、组合，依赖来解决问题；或者都继承更加抽象的基类
### 开闭原则
一个软件实体如类、模块和函数应该对扩展开放，对修改关闭，用抽象构建框架，用实现拓展细节。当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
### 迪米特法则
一个对象应该对其他对象保持最少的了解，类与类关系越密切，耦合度越大。迪米特法则又称为最少知道原则，即一个类对自己依赖的类知道的越少越好，
也就是说对于被依赖的类不管多复杂，都尽量将逻辑封装在类的内部；对外除了提供public方法，不对外泄露任何信息。
还有个更简单的定义，只和直接的朋友通信。直接的朋友是指成员变量、方法参数、方法返回值，而出现在局部变量中的类不是直接的朋友；也就是说，
陌生的类最好不要以局部变量的形式出现在类的内部。
### 合成复用原则
原则是尽量使用合成/聚合的方式，而不是使用继承。
## 设计模式类型
### 创建型模式
* 单例模式：采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例。
  - 饿汉式：在类装载的时候就完成了实例化，不推荐使用。
  - 懒汉式：当使用到该方法时，才去创建instance，有些写法线程不安全或效率过低，不推荐使用。
  - 双重检查：也是懒汉模式，线程安全的写法，推荐使用的方式。
  - 静态内部类：在内部放置静态内部类，线程安全，推荐使用。
  - 枚举：enum，线程安全，还能防止反序列化重新创建新的对象，推荐使用。
* 工厂模式：
  - 简单工厂模式：该模式是由一个工厂对象决定创建出哪一种产品类的实例。定义了一个创建对象的类，由这个类来封装实例化对象的行为。
  - 抽象工厂模式：将工厂抽象化，以此能够拓展用于生产不同产品的具体工厂。
* 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象。java中使用clone方法。
* 建造者模式：生成器模式，是一种对象构建模式，可以将复杂对象的建造过程抽取出来，使这个抽象过程的不同实现方式可以构造出不同表现的对象。
  - Product：一个具体的产品对象
  - Builder：创建一个product对象的各个部件指定的接口/抽象类
  - ConcreteBuilder：实现接口，构建和装配各个组件
  - Director：构建一个使用builder接口的对象，负责控制产品对象的生产过程，它隔离了客户和对象的生产过程
### 结构型模式
* 适配器模式(?)：其将某个类的接口转换成客户端期望的另一类接口表示，主要目的是兼容性，让原本因接口不能一起工作的两个类可以协同工作，其别名为包装器（wrapper）。
  - 类适配器模式
  - 对象适配器模式
  - 接口适配器模式
* 装饰模式(?)：动态地将新功能附加到对象上，在对象的功能拓展方面，它比继承更有弹性，装饰者模式也体现了开闭原则。
* 代理模式：为一个对象提供一个替身，以控制对这个对象的访问。即通过代理对象访问目标对象，这样的好处是：可以在目标对象实现的基础上，增强额外的功能操作，即扩展目标对象的功能。
被代理的对象通常是远程对象、创建开销大的对象或需要安全控制的对象。代理模式有不同的形式，主要有静态代理和动态代理（包括jdk代理、cglib代理）。cglib代理可以代理没有实现任何接口的对象。
* 桥接模式：将实现和抽象放在两个不同的类层次中，使两个层次可以独立改变。它的主要特点是把抽象与行为实现分离开来，从而可以保持各部分的独立性以及应对他们的功能拓展。
* 组合模式：又称为部分整体模式，它创建了对象组的树形结构，将对象组合成树状结构以表示"整体-部分"的层次关系。组合模式使得用户对单个对象和组合对象的访问具有一致性。
* 外观模式
* 享元模式
### 行为型模式
* 模版方法模式：在一个抽象类公开定义了执行它的方法的模版。它的子类按需要重写方法实现，但调用将以抽象类中定义的方式进行。简单说，模版方法模式定义一个操作中算法的骨架，而将一些步骤的具体实现定义延迟到子类中。
* 命令模式
* 访问者模式
* 迭代器模式
* 观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为subject，依赖的对象为observer，subject通知observer变化。数据产生方为1的一方，接收数据是多的一方。
* 中介者模式
* 备忘录模式
* 解释器模式
* 状态模式
* 策略模式
* 职责链模式