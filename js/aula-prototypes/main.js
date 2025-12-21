const obja = {
    keyA: 'luc',
    //__proto__: Object.prototype
};

const objb = {
    keyB: 'fuc'
}

Object.setPrototypeOf(obja, objb);
console.log(obja.keyA);


function Product(name, price) {
    this.name = name;
    this.price = price;
}

Product.prototype.discount = function(percenteage) {
    this.price = this.price - (this.price * (percenteage / 100));
}

Product.prototype.increase = function(percenteage) {
    this.price = this.price + (this.price * (percenteage / 100));
}

const p1 = new Product('short', 35.90);
const p2 = new Product('Jeans', 90,50);

Object.setPrototypeOf(p1, Product.prototype);
console.log(p1);

p1.discount(50)
console.log(p1);

const p3 = Object.create(Product.prototype)
p3.price = 30;
p3.increase(50);
console.log(p3);