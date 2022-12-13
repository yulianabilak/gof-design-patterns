package com.bilak.behavioral.visitor;

import com.bilak.behavioral.visitor.employees.Administrator;
import com.bilak.behavioral.visitor.employees.Employee;
import com.bilak.behavioral.visitor.employees.Instructor;
import com.bilak.behavioral.visitor.employees.Technician;
import com.bilak.behavioral.visitor.visitors.BonusVisitor;
import com.bilak.behavioral.visitor.visitors.Visitor;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/27/2022 - 11.18
 **/
public class Main {
    public static void main(String[] args) {
        Visitor bonusVisitor = new BonusVisitor();
        List<Employee> employees = Arrays.asList(
                new Administrator("admin", 500),
                new Instructor("instructor", 500),
                new Technician("tech", 500)
        );
        employees.forEach(emp -> emp.accept(bonusVisitor));
        System.out.println(employees);
    }
}
