package com.workintech.developers;

public class MidDeveloper extends HRManager {

    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);

    }

    @Override
    public void work() {
        System.out.println("Mid Developer starts to working with salary: " + salary);
    }
}
