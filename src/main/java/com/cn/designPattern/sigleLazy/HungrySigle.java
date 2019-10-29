package com.cn.designPattern.sigleLazy;

/**
 * 饿汉式，他和懒汉式的区别是，先初始化
 */
public class HungrySigle {
    /**
     * 这里直接就初始化好了
     */
    private static HungrySigle hungrySigle = new HungrySigle();
    private HungrySigle(){

    }
    public static HungrySigle getInstance(){
        //这里也不需要判断是否为空了
        return hungrySigle;
    }
}
