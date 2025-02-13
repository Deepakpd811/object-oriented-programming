package Level1_Question;



// Program to Display Employee Details
// Problem Statement:
//  Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

public class Employee {

    private String name;
    private int id;
    private int salary ;

    Employee(int id, String name, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println(salary);
    }

    void display(){
        System.out.println("Id is " + this.id+ "\nName is "+ this.name + "\nSalary is "+ this.salary);
    }

    @Override
    public String toString() {
        
        return "Name: " + this.name + " id: " + this.id + " Salary: " + this.salary;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(1001, "Deepak", 1000000);
        // Employee e2 = new Employee(1001, "Deepak", 1000000);

        System.out.println(e1.hashCode());
        // Employee e3 = (Employee) e2.clone();
        // System.out.println(e2.hashCode());


        // e1.display();
        // System.out.println(e3);

        // String str1 = new String("hello");
        // String str2 = new String("hello");

        System.out.println();

        // System.out.println(str1.equals(str2));

        // System.out.println(e1.equals(e2));
    }
}
