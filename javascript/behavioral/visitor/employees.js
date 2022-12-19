export class Employee {
    constructor(name, salary) {
        if (this.constructor == Employee) {
            throw new Error("Abstract classes can't be instantiated.");
        }
        this.name = name;
        this.salary = salary;
    }

    accept(visitor) {
        throw new Error("Method 'accept(visitor)' must be implemented.");
    }
}

export class Administrator extends Employee {
    constructor(name, salary) {
        super(name, salary);
    }

    accept(visitor) {
        visitor.visitAdministrator(this);
    }
}

export class Instructor extends Employee {
    constructor(name, salary) {
        super(name, salary);
    }

    accept(visitor) {
        visitor.visitInstructor(this);
    }
}

export class Technician extends Employee {
    constructor(name, salary) {
        super(name, salary);
    }

    accept(visitor) {
        visitor.visitTechnician(this);
    }
}