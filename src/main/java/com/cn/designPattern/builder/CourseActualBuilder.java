package com.cn.designPattern.builder;

/**
 * 实现一个抽象类
 */
public class CourseActualBuilder extends CourseBuilder {
    Course course = new Course();
    @Override
    public void BuildercourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void BuildercoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void BuildercourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void BuildercourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void BUildercourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCource() {
        return course;
    }
}
