package business;

import core.logging.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger loggers[];
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers,List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category c:categories) {
            if (category.getCategoryName()==c.getCategoryName()){
                throw new Exception("Kategori zaten ekli");
            }
        }
        categoryDao.add(category);
        categories.add(category);
        for(Logger l:loggers){
            l.log(category.getCategoryName());
        }
    }

}
