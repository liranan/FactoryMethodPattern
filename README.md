# FactoryMethodPattern
 定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类。

工厂方法

 概述

    定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类。

 适用性

    1.当一个类不知道它所必须创建的对象的类的时候。

    2.当一个类希望由它的子类来指定它所创建的对象的时候。

    3.当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。
		
			 参与者
  
    1.Product
      定义工厂方法所创建的对象的接口。

    2.ConcreteProduct
      实现Product接口。

    3.Creator
      声明工厂方法，该方法返回一个Product类型的对象。
      Creator也可以定义一个工厂方法的缺省实现，它返回一个缺省的ConcreteProduct对象。
      可以调用工厂方法以创建一个Product对象。

    4.ConcreteCreator
      重定义工厂方法以返回一个ConcreteProduct实例。
 类图
 
 例子
Product 
public interface Work {

    void doWork();
}
ConcreteProduct 
public class StudentWork implements Work {

    public void doWork() {
        System.out.println("学生做作业!");
    }

}
public class TeacherWork implements Work {

    public void doWork() {
        System.out.println("老师审批作业!");
    }

}
Creator 
public interface IWorkFactory {

    Work getWork();
}
ConcreteCreator 
public class StudentWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new StudentWork();
    }

}
public class TeacherWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new TeacherWork();
    }

}
Test 
public class Test {

    public static void main(String[] args) {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();
        
        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }

}
result 
学生做作业!
老师审批作业!
