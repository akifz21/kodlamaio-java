import business.CategoryManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.conctrates.hibarnate.HibernateCategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1,"Kategori1"));
        categories.add(new Category(2,"Kategori2"));

        Logger loggers[] = {new DatabaseLogger(),new FileLogger()};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categories);
        try {
            categoryManager.add(new Category(3,"Kategori3"));
            categoryManager.add(new Category(3,"Kategori3")); //zaten ekli hatası dönüyor
        }catch (Exception e){
            System.out.println(e);
        }
    }
}