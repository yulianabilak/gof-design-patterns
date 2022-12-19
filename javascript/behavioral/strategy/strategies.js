export class VipStrategy {
    pass(client, queue) {
        for (let i = 0; i < queue.length; i++) {
            if (queue[i].status === "STANDARD") {
                queue.splice(i, 0, client);
                return;
            }
        }
    }
}

export class StandardStrategy {
    pass(client, queue) {
        queue.push(client);
    }
}