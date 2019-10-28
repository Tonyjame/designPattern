package com.cn.designPattern.FactoryMethod;

/**
 * 工厂方法
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 工厂方法，直白的理解就是交由子类来来创建，这个是从简单工厂上演进而来的
         * 我们创建了一个Amail接口，然后让Dog和Pig来实现，然后又创建了一个
         */
        //调用狗类，实际上我们用的是子类工厂方法来创建的，这种模式就是工厂模式
        /**
         * 这里先创建来狗工厂类，然后让狗工厂类调用Amail方法
         */
        AmailFactory amailFactory = new DogFactory();
        Amail dog =  amailFactory.getAmail();
        dog.eat();


    }
}
