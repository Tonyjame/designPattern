package com.cn.designPattern.FactoryMethod;

/**
 * 定义了一个抽象方法
 */
public abstract class AmailFactory {
    /**
     * 本来可以通过这里直接获取Dog和Pig实现类，但是我们这里让子类去继承他，然后交给子类来实现方法
     * @return
     */
   public abstract Amail getAmail();
}
