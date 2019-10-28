package com.cn.designPattern.FactoryMethod;

public class PigFactory extends AmailFactory {
    @Override
    public Amail getAmail() {
        return new Pig();
    }
}
