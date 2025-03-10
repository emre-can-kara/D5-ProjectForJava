package com.workintech.developers;

public class JuniorDeveloper extends HRManager{
    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer starts to working with salary: " + salary);
    }
}
