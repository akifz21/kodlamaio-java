package dataAccess.conctrates.hibarnate;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Category Hibernate'e eklendi");
    }
}
