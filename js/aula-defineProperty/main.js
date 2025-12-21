function Product(name, price, stock){
    Object.defineProperty(this, 'stock', {
        enumerable: true, // mostra a chave
        configurable: true, // configurável
        //value: stock, // mostra valor
        get: function() {
            return stock;
        },
        //writable: false, // pode alterar o valor
        set: function(value){
            stock = value;
        },
    });

    Object.defineProperties(this, {
        name: {
            enumerable: true, // mostra a chave
            value: name, // mostra valor
            writable: false, // pode alterar o valor
            configurable: true, //configurável
        },
        price: {
            enumerable: true, // mostra a chave
            value: price, // mostra valor
            writable: false, // pode alterar o valor
            configurable: true, 
        },
    });
}

const p1 = new Product('shirt', 30, 3);
console.log(Object.keys(p1));
console.log(p1);
console.log('Stock inicial:', p1.stock);
p1.stock = 5;
console.log('Stock após alteração:', p1.stock);
console.log(Object.getOwnPropertyDescriptor(p1, 'name'));
