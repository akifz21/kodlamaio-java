package dataAccess.conctrates.jdbc;

import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.InstructorDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("Kategori Jdbc'e eklendi");
    }
}
