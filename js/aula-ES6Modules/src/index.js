/* 
import { name, lastname as nickname, age, sum, People } from './model1';

const p1 = new People("Lucas", "Ferreira");
console.log(p1);

console.log(name, nickname, age);
console.log(sum(2,2));


import * as MeuModulo from './model1'; //dessa forma tudo eh importado como uma classe

console.log(MeuModulo);
*/

import People,{name, lastname} from "./model1";

const p1 = new People(name, lastname);
console.log(p1); 
