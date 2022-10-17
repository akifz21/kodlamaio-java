package business;

import core.logging.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger loggers[];
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }
    public  void add(Course course) throws Exception {
        if (course.getPrice()<10){
            throw  new Exception("Kurs fiyatı 10'dan küçük olamaz");
        }
        for (Course c:courses){
            if (course.getCourseName()==c.getCourseName()){
                throw  new Exception("Kurs zaten ekli");
            }
        }
        courses.add(course);
        courseDao.add(course);
        for(Logger l:loggers){
            l.log(course.getCourseName());
        }
    }
}
