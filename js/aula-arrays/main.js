//filtrar o array
const nomes = ['Lucas', 'Joao', 'Marcos', 'Luiz', 'Mateus'];
const result = nomes.filter(word => word[0] == 'L');

console.log(result);

//map, mapear e alterar o tamanho do array
const pessoas = [
    { nome: 'Joao', idade: 25},
    { nome: 'Felipe', idade: 23},
    { nome: 'Miguel', idade: 18},
    { nome: 'Maria', idade: 40}
]

const nomePessoa = pessoas.map(p => p.nome);
const idPessoa = pessoas.map( (obj,indice) => { 
    const newObj = {...obj};
    newObj.id = indice;
    return newObj; 
})

console.log(nomePessoa);
console.log(idPessoa);

//reduce, reduzir o array a um elemento apenas
const numeros = [5, 50, 80, 1, 2, 3, 5, 30, 22, 78];
const total = numeros.reduce( (acumulador, valor) => acumulador += valor);
const somaPares = numeros.reduce(function(acumulador, valor) {
    if (valor % 2 === 0){
        acumulador += valor;
    }
    return acumulador;
}, 0 ); //o acumulador, por padrão começa com o primeiro número do array, então para garantir que ele seja 0 é passado desse forma
console.log(total);
console.log(somaPares);

const maisVelho = pessoas.reduce((acumulador, valor) => {
    if (valor.idade > acumulador.idade){
        acumulador = valor;
    }
    return acumulador;
})
console.log(maisVelho);