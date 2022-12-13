package com.bilak.structural.composite;

import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Department
 * @since 10/10/2022 - 14.36
 **/
public class Department implements Employee {
    private int id;
    private String name;
    private List<Employee> children;

    public Department(int id, String name, List<Employee> children) {
        this.id = id;
        this.name = name;
        this.children = children;
    }

    @Override
    public double getSalary() {
        return children.stream().mapToDouble(Employee::getSalary).sum();
    }

    public void add(Employee component) {
        children.add(component);
    }

    public void remove(Employee component) {
        children.remove(component);
    }

    public void clear() {
        children.clear();
    }

    public List<Employee> getChildren() {
        return children;
    }
}
