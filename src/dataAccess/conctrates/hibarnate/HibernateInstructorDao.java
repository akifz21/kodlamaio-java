package dataAccess.conctrates.hibarnate;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Egitmen Hibernate'e eklendi");
    }
}
