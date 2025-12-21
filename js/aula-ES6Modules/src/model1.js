export const name = 'Lucas';
const lastname = 'Ferreira';
const age = '22';


function sum(x , y){
    return x + y;
}

export default class People {
    constructor(name, lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}

// default faz com que o parametro seja passado como padrao, com isso eu declarar esse argumento que quero usar na importacao.

export { lastname, age, sum };