package com.cn.designPattern.abFactory;

/**
 * 抽象工厂
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCorseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
