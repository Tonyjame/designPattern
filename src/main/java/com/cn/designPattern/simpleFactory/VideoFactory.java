package com.cn.designPattern.simpleFactory;

public class VideoFactory {
    /**
     * 传入类的名称
     * @param className
     */
    public static Video createClass(String className){
        //equalsIgnoreCase用来比较两个是否相等，且不考虑大小写
        if("java".equalsIgnoreCase(className)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(className)){
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 利用Java的反射实现简单工厂模式
     * 这里用Class 来定义参数，最终传入进来多的应该是 类.class 这种
     */

    public static Video createClass(Class className) {
        /**
         * 先来说一下Class.forName("类名") 这个方法返回的是类名的一个对象，也可以称之为动态加载类
         * 然后就是Class.forName("类名").newInstence() 通过上面一步之后，我们获取了类，但是还没有实例化，所以可以使用newInstence来
         * 实例化，返回的是Object ，其实和new都是一样的，不过，用这种方法返回的只能调用无参的构造方法，你想啊，都没有参数，怎么调用有参数的
         * 构造方法呢？
         */
        Video video = null;
        //这里使用强制类型转换操作
        try {
            video = (Video) Class.forName(className.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return video;
    }
}
