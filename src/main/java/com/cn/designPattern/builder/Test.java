package com.cn.designPattern.builder;

/**
 * 建造者模式
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java","ppt","video","article","qa");
        System.out.println(course);
    }
}
