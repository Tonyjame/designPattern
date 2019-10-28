package com.cn.designPattern.simpleFactory;

import sun.jvm.hotspot.gc_implementation.parallelScavenge.PSYoungGen;

/**
 * 简单工厂
 */
public class Test {

    public static void main(String[] args) {
        /**
         * 现在这种模式，我们要想调用Javavideo就要重新实例化一次，
         * 然后要调用pythonVideo就也要实例化一次
         */
//        JavaVideo javaVideo = new JavaVideo();
//        javaVideo.produce();
//        PythonVideo pythonVideo = new PythonVideo();
//        pythonVideo.produce();

        /**
         * 为了解决上上面的问题，我们用简单工厂，这样子，我们不关心底层是如何实现的，只需要传入参数即可
         *
         */
//        Video video = VideoFactory.createClass("python");
//        video.produce();

        /**
         * 上面这种模式还是可以变种的，因为我们考虑一个问题，当python类的字符串比较多的时候
         * 我们就需要多加入好多的判断，多了好多的if else语句，于是我们用java的反射来解决这个问题
         * 例如下面这种
         */
        Video video1 = VideoFactory.createClass(PythonVideo.class);
        video1.produce();

    }
}
