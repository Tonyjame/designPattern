package com.cn.designPattern.sigleLazy;

/**
 * 静态内部类单例模式
 */
public class StaticInnerClass {
    private  static class InnerClass{
        private static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
    public static StaticInnerClass getInstance(){
        return InnerClass.staticInnerClass;
    }
}
