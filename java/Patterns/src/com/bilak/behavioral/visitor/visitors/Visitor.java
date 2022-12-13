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
 * @class Visitor
 * @since 11/27/2022 - 11.29
 **/
public interface Visitor {
    void visitAdministrator(Administrator administrator);
    void visitInstructor(Instructor instructor);
    void visitTechnician(Technician technician);
}
