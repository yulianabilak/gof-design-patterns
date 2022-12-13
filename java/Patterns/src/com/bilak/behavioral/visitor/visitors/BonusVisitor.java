package com.bilak.behavioral.visitor.visitors;

import com.bilak.behavioral.visitor.employees.Administrator;
import com.bilak.behavioral.visitor.employees.Instructor;
import com.bilak.behavioral.visitor.employees.Technician;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class BonusVisitor
 * @since 11/27/2022 - 11.38
 **/
public class BonusVisitor implements Visitor {
    @Override
    public void visitAdministrator(Administrator administrator) {
        administrator.setSalary(administrator.getSalary() * 1.15);
    }

    @Override
    public void visitInstructor(Instructor instructor) {
        instructor.setSalary(instructor.getSalary() * 1.1);
    }

    @Override
    public void visitTechnician(Technician technician) {
        technician.setSalary(technician.getSalary() * 1.09);
    }
}
