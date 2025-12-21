function Product(name, price){
    this.name = name;
    this.price = price;
}

Product.prototype.discount = function(percentege) {
    this.price = this.price - (this.price * (percentege / 100));
}

Product.prototype.increase = function(percentege) {
    this.price = this.price + (this.price * (percentege / 100));
}

function Shirt(name, price, color) {
    Product.call(this, name, price);
    this.color = color;
}

Shirt.prototype = Object.create(Product.prototype);
Shirt.prototype.constructor = Shirt;

const shirt = new Shirt('Nike', 50.60, 'black');
const p1 = new Product('Product 1', 10);
shirt.increase(50);
console.log(p1)
console.log(shirt);