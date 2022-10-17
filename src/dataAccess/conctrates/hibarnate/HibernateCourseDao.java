package dataAccess.conctrates.hibarnate;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate'e eklendi");
    }
}
