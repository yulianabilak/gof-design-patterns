package com.bilak.behavioral.visitor.employees;

import com.bilak.behavioral.visitor.visitors.Visitor;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Technician
 * @since 11/27/2022 - 11.40
 **/
public class Technician extends Employee {
    public Technician(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTechnician(this);
    }
}
