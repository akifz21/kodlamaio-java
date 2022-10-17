package dataAccess.conctrates.jdbc;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Egitmen Jdbc'e eklendi");
    }
}
