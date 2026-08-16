const inventory = [];

function findProductIndex(productName) {
    return inventory.findIndex(product => product.name.toLowerCase() === productName.toLowerCase());
}

function addProduct(product) {
    const index = findProductIndex(product.name);
    if (index !== -1) {
        inventory[index].quantity += product.quantity;
        console.log(inventory[index].name + " quantity updated");
    } else {
        product.name = product.name.toLowerCase();
        inventory.push(product);
        console.log(product.name + " added to inventory");
    }
}

function removeProduct(productName, quantity) {
    const index = findProductIndex(productName);
    if (index === -1) {
        console.log(productName.toLowerCase() + " not found");
        return;
    }
    
    if (inventory[index].quantity < quantity) {
        console.log("Not enough " + inventory[index].name + " available, remaining pieces: " + inventory[index].quantity);
    } else {
        inventory[index].quantity -= quantity;
        console.log("Remaining " + inventory[index].name + " pieces: " + inventory[index].quantity);
        if (inventory[index].quantity === 0) {
            inventory.splice(index, 1);
        }
    }
}
