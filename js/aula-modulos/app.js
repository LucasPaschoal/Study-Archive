const path = require('path');
const { Pessoa } = require('./mod1')

const p1 = new Pessoa('Lucas', 'Ferreira');
console.log(p1);

console.log(__filename);
console.log(__dirname);

console.log(path.resolve(__dirname, '..', '..', 'arquivos'));