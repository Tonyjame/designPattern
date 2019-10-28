package com.cn.designPattern.FactoryMethod;

/**
 * 去实现Amail这个接口
 */
public class Dog implements Amail{
    @Override
    public void eat() {
        //狗吃骨头
        System.out.println("dog eat bone");
    }
}
