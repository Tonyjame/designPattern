package com.cn.designPattern.builder;

/**
 * 制作一个抽象类
 */
public abstract class CourseBuilder {

    public abstract void BuildercourseName(String courseName);
    public abstract void BuildercoursePPT(String coursePPT);
    public abstract void BuildercourseVideo(String courseVideo0);
    public abstract void BuildercourseArticle(String courseArticle);
    public abstract void BUildercourseQA(String courseQA);

    public abstract Course makeCource();
}
