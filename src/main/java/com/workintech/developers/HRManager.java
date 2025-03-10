package com.workintech.developers;

public class HRManager extends Employee {

    String[] juniorDeveloper;
    String[] midDeveloper;
    String[] seniorDeveloper;



    public HRManager(long id, String name, int salary) {
        super(id, name, salary);

    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working with salary: " + salary);
    }

    public void addEmployee(int index, String[] juniorDeveloper,  String[] midDeveloper ,  String[] seniorDeveloper) {
        this.juniorDeveloper = juniorDeveloper;
        this.midDeveloper = midDeveloper;
        this.seniorDeveloper = seniorDeveloper;



    }


}
