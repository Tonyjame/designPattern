package com.cn.designPattern.FactoryMethod;

/**
 *
 * 本来可以在AmailFactory中直接来实现实例化，但是把这个权利交给了子类来实现
 */
public class DogFactory extends AmailFactory {
    @Override
    public Amail getAmail() {
        //这里直接返回类
        return new Dog();
    }
}
