package com.cn.designPattern.sigleLazy;

/**
 * 用doublecheck实现单例模式
 */
public class LazyDoubleCheck {
    /**
     * 这里通过加入volatile来保证后续初始化的时候顺序，保证可见性
     */
    private volatile static LazyDoubleCheck lazyDoubleCheck = null;

    //通过设置私有化，保证不能被new
    private LazyDoubleCheck(){

    }

    /**
     * 所谓的doublecheck，就是进行了两次检查，第二次检查的是加锁的，比直接锁整个方法要好很多
     * @return
     */
    public static LazyDoubleCheck getInstance(){
        if(lazyDoubleCheck == null){
            //只需要锁住第二种检查即可
            synchronized (LazyDoubleCheck.class){
                if(lazyDoubleCheck == null){
                    lazyDoubleCheck = new LazyDoubleCheck();
                }
            }
        }
        return lazyDoubleCheck;
    }
}
