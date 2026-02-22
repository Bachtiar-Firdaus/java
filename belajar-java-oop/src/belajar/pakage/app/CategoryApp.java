package belajar.pakage.app;

import belajar.pakage.data.Category;

public class CategoryApp {
    static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.setId(null); // di riject

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
