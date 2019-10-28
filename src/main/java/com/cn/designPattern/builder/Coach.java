package com.cn.designPattern.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }
    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,String courseQA){
        this.courseBuilder.BuildercourseName(courseName);
        this.courseBuilder.BuildercoursePPT(coursePPT);
        this.courseBuilder.BuildercourseVideo(courseVideo);
        this.courseBuilder.BuildercourseArticle(courseArticle);
        this.courseBuilder.BUildercourseQA(courseQA);
        return this.courseBuilder.makeCource();
    }
}
