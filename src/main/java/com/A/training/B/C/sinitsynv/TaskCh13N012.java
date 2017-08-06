package com.A.training.B.C.sinitsynv;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TaskCh13N012 {
    public static void main(String[] args) {
        Database base = new Database();
        base.printEmployee(base.findByMatchStrWithName("VLAD"));
        base.printEmployee(base.findByWorkThanShouldMinYears(3));
    }
}

class Employee {
    private String lastName;
    private String firstName;
    private String patronymicName;
    private String address;
    private int monthStartWork;
    private int yearStartWork;

    public Employee(String lastName, String firstName, String patronymicName, String address, int monthStartWork,
                    int yearStartWork) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.address = address;
        this.monthStartWork = monthStartWork;
        this.yearStartWork = yearStartWork;
    }

    public Employee(String lastName, String firstName, String address, int monthStartWork, int yearStartWork) {
        this(lastName, firstName, "", address, monthStartWork, yearStartWork);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public int getMonthStartWork() {
        return monthStartWork;
    }

    public int getYearStartWork() {
        return yearStartWork;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "lastName='" + lastName + '\'' +
            ", firstName='" + firstName + '\'' +
            ", patronymicName='" + patronymicName + '\'' +
            ", address='" + address + '\'' +
            ", monthStartWork=" + monthStartWork +
            ", yearStartWork=" + yearStartWork +
            '}';
    }
}

class Database {
    private List<Employee> employees = new ArrayList<>();
    private int yearToday;
    private int monthToday;

    public Database() {
        createDataBase();
    }

    private void createDataBase() {
        employees.add(new Employee("Ivanov", "Ivan", "Chelyabinsk", 3, 2010));
        employees.add(new Employee("Petrov", "Petr", "Vladimirovich", "Moscow", 6, 2011));
        employees.add(new Employee("Sidorov", "Sergey", "Evgenievich", "Novosibirsk", 12, 2015));
        employees.add(new Employee("Putin", "Vladimir", "Moscow", 7, 2008));
        employees.add(new Employee("Plehanov", "Ivan", "Chelyabinsk", 3, 2010));
        employees.add(new Employee("Chernobaev", "Petr", "Vladimirovich", "Moscow", 6, 2011));
        employees.add(new Employee("Kornyakova", "Sergey", "Evgenievich", "Novosibirsk", 12, 2015));
        employees.add(new Employee("Pugacheva", "Vladimir", "Moscow", 7, 2008));
        employees.add(new Employee("Bilan", "Ivan", "Chelyabinsk", 3, 2010));
        employees.add(new Employee("Kirkorov", "Petr", "Vladimirovich", "Moscow", 6, 2011));
        employees.add(new Employee("Matvienko", "Sergey", "Evgenievich", "Novosibirsk", 12, 2015));
        employees.add(new Employee("Stepashin", "Vladimir", "Moscow", 7, 2008));
        employees.add(new Employee("Sinitsyn", "Ivan", "Chelyabinsk", 3, 2010));
        employees.add(new Employee("Klimov", "Petr", "Vladimirovich", "Moscow", 6, 2011));
        employees.add(new Employee("Burmatova", "Sergey", "Evgenievich", "Novosibirsk", 12, 2015));
        employees.add(new Employee("Juravlev", "Vladimir", "Moscow", 7, 2008));
        employees.add(new Employee("Fedotov", "Ivan", "Chelyabinsk", 3, 2010));
        employees.add(new Employee("Nekrasov", "Petr", "Vladimirovich", "Moscow", 6, 2011));
        employees.add(new Employee("Shmelev", "Petr", "Vladimirovich", "Moscow", 6, 2011));
        employees.add(new Employee("Dartveider", "Enekin", "Skyuoker", "Moscow", 6, 2011));
    }

    public void printEmployee(List<Employee> employees) {
        for (Employee list : employees) {
            System.out.println(list.toString());
        }
        System.out.println();
    }

    private int howMuchYearsWork(Employee employee) {
        if (monthToday >= employee.getMonthStartWork()) {
            return yearToday - employee.getYearStartWork();
        } else {
            return yearToday - employee.getYearStartWork() - 1;
        }
    }

    public List<Employee> findByWorkThanShouldMinYears(int shouldWorkYears) {
        GregorianCalendar today = new GregorianCalendar();
        yearToday = today.get(Calendar.YEAR);
        monthToday = today.get(Calendar.MONTH);
        List<Employee> employeesWhoWorkThanShouldMinYears = new ArrayList<>();
        for (Employee list : employees) {
            int yearWorked = howMuchYearsWork(list);
            if (shouldWorkYears <= yearWorked) {
                employeesWhoWorkThanShouldMinYears.add(list);
            }
        }
        return employeesWhoWorkThanShouldMinYears;
    }

    public List<Employee> findByMatchStrWithName(String str) {
        List<Employee> employeesMatchStrWithName = new ArrayList<>();
        for (Employee list : employees) {
            if (list.getFirstName().toLowerCase().contains(str.toLowerCase())
                || list.getLastName().toLowerCase().contains(str.toLowerCase())
                || list.getPatronymicName().toLowerCase().contains(str.toLowerCase())) {
                employeesMatchStrWithName.add(list);
            }
        }
        return employeesMatchStrWithName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
