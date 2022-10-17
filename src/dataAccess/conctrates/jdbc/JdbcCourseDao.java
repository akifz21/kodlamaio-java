package dataAccess.conctrates.jdbc;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Jdbc'e eklendi");
    }
}
