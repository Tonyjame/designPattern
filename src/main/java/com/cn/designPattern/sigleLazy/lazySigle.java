package com.cn.designPattern.sigleLazy;

/**
 * 用Java实现单例模式，懒汉式，所谓懒汉式代表的意思是，只有用到的时候才进行初始化，延迟加载的意思
 */
public class lazySigle {
    private  static lazySigle lazySigles = null;
    //搞一个无参的声明为私有的构造函数，就是为了让外面的不能通过直接new的方式来获取对象实例化
    private lazySigle(){
    }

    /**
     * 这里是第一种写法，观察这种模式，就会发现，在多线程的情况下，他其实是线程不安全的，
     * 所以需要给他加锁，来保证线程安全，第二种就是线程安全的
     * @return
     */
//    public static lazySigle getInstance(){
//        if(lazySigle == null){
//            lazySigle = new lazySigle();
//        }
//        return lazySigle;
//    }

    /**
     * 第二种方式，通过加锁的方式来在多线程的情况下保证线程安全，永远只有一个被实例化
     * @return
     */
    public synchronized static lazySigle getInstance(){
        if(lazySigles == null){
            lazySigles = new lazySigle();
        }
        return lazySigles;
    }
}
