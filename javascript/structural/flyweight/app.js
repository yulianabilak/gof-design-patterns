//FLYWEIGHT
class PlayerType {
    constructor(equipmentName, equipmentCategory, equipmentColor) {
        this.equipmentName = equipmentName;
        this.equipmentCategory = equipmentCategory;
        this.equipmentColor = equipmentColor;
    }

    display(x, y) {
        console.log(`New player with ${this.equipmentColor} equipment ${this.equipmentName}` +
        ` of category ${this.equipmentCategory} displayed: x=${x}, y=${y}`);
    }
}

class Player {
    constructor(x, y, playerType) {
        this.x = x;
        this.y = y;
        this.playerType = playerType;
    }

    display() {
        this.playerType.display(this.x, this.y);
    }
}

class PlayerFactory {
    static playerTypes = new Map();

    static getPlayerType(equipmentName, equipmentCategory, equipmentColor) {
        let playerType = this.playerTypes.get(equipmentName);
        if (!playerType) {
            playerType = new PlayerType(equipmentName, equipmentCategory, equipmentColor);
            this.playerTypes.set(equipmentName, playerType);
        }
        return playerType;
    }
}

/*==============================================================================================*/
const playersToDisplay = 20;
const playerTypes = 2;

for (let i = 0; i < playersToDisplay / 2; i++) {
    const playerType1 = PlayerFactory.getPlayerType("ski", "B", "blue");
    const player1 = new Player(parseInt(Math.random() * 101), parseInt(Math.random() * 101), playerType1);
    player1.display();

    const playerType2 = PlayerFactory.getPlayerType("snowboard", "A", "black");
    const player2 = new Player(parseInt(Math.random() * 101), parseInt(Math.random() * 101), playerType2);
    player2.display();
}

console.log("====================================================================================");

console.log("Memory usage: ");
console.log(`Player's size (16 bytes) * ${playersToDisplay} +`);
console.log(`Player type's size (~23 bytes) * ${playerTypes}`);
console.log("====================================================================================");
console.log(`Total: ${playersToDisplay * 16 + playerTypes * 23} bytes`);
console.log(`Instead of: ${playersToDisplay * 39} bytes`);