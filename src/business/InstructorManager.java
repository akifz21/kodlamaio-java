package business;

import core.logging.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger loggers[];

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(Logger l:loggers){
            l.log(instructor.getFirstName());
        }
    }
}
