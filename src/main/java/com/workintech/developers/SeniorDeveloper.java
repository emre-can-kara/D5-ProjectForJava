package com.workintech.developers;

public class SeniorDeveloper extends HRManager{

    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);

    }

    @Override
    public void work() {
        System.out.println("Senior Developer starts to working with salary: " + salary);
    }
}
