export class BonusVisitor {
    visitAdministrator(administrator) {
        administrator.salary *= 1.15;
    }

    visitInstructor(instructor) {
        instructor.salary *= 1.1;
    }

    visitTechnician(technician) {
        technician.salary *= 1.09;
    }
}