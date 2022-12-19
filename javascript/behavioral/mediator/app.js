class ChatroomMediator {
    setupConversation(client, operator) {
        this.client = client;
        this.operator = operator;
    }

    sendMessage(message, sender) {
        if (sender === "client") {
            this.operator.receiveMessage(message, this.client.name);
        }
        else if (sender === "operator") {
            this.client.receiveMessage(message, this.operator.name);
        }
        else {
            throw new Error("Unknown user");
        }
    }
}

class User {
    constructor(name, mediator) {
        if (this.constructor == User) {
            throw new Error("Abstract classes can't be instantiated.");
        }
        this.name = name;
        this.mediator = mediator;
    }

    sendMessage(message) {
        throw new Error("Method 'sendMessage(message)' must be implemented.");
    }

    receiveMessage(message, sender) {
        console.log(`${sender} to ${this.name}: '${message}'`);
    }
}

class Client extends User {
    constructor(name, mediator) {
        super(name, mediator);
    }

    sendMessage(message) {
        console.log(`Sent from client: ${message}`);
        this.mediator.sendMessage(message, "client");
    }

    receiveMessage(message, sender) {
        console.log("To a client: ");
        super.receiveMessage(message, sender);
    }
}

class Operator extends User {
    constructor(name, mediator) {
        super(name, mediator);
    }

    sendMessage(message) {
        console.log(`Sent from operator: ${message}`);
        this.mediator.sendMessage(message, "operator");
    }

    receiveMessage(message, sender) {
        console.log("To an operator: ");
        super.receiveMessage(message, sender);
    }
}
//========================================================================
const mediator = new ChatroomMediator();
const client = new Client("Scarlett", mediator);
const operator = new Operator("John", mediator);

mediator.setupConversation(client, operator);

client.sendMessage("Hello I need help with renewing my subscription");
operator.sendMessage("Hello, what is the problem?");