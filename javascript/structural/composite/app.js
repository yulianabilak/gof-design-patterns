class Worker {
    constructor(id, name, position, salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    getSalary() {
        return this.salary;
    }
}

class Department {
    constructor(id, name, children) {
        this.id = id;
        this.name = name;
        this.children = children;
    }

    getSalary() {
        return this.children.reduce((total, next) => total + next.getSalary(), 0);
    }

    add(component) {
        this.children.push(component);
    }

    remove(component) {
        this.children = this.children.filter((item) => item !== component);
    }

    clear() {
        this.children = [];
    }
}

const mainDepartment = new Department(1, "Main", [
    new Worker(1, "Kippie Nelson", "owner", 100000),
    new Worker(2, "Maisie Chilcott", "manager", 50000),
    new Worker(3, "Morly Liger", "administrator", 45000),
    new Department(2, "Instructors", [
        new Department(3, "Ski instructors", [
            new Worker(4, "Hettie Rawson", "ski instructor", 30000),
            new Worker(5, "Benetta Beche", "ski instructor", 29060)
        ]),
        new Department(4, "Snowboard instructors", [
            new Worker(6, "Hewet Klemke", "snowboard instructor", 25000),
            new Worker(7, "Domenic Petrescu", "snowboard instructor", 25000)
        ]),
        new Worker(8, "Asher Magnay", "instructor", 44030)
    ]),
    new Department(5, "Hotel", [
        new Worker(9, "Jacqui Mayberry", "administrator", 12000),
        new Worker(10, "Jenifer Schumacher", "janitor", 8000),
        new Worker(11, "Gray Sturt", "technician", 9500)
    ])
]);

console.log(mainDepartment.getSalary());