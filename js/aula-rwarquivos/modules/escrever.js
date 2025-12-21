const fs = require('fs');
const path = require('path');
const caminhoArquivo = path.resolve(__dirname, '..', 'teste.txt');

const pessoas = [
    {nome: 'joao'},
    { nome: 'Miguel', sobrenome: 'Soares' },
    { nome: 'Maria', sobrenome: 'Fernandes' },
]

const json = JSON.stringify(pessoas, '', 2);

fs.writeFile(caminhoArquivo, 'Frase1\n', { flag: 'w', encoding: 'utf8'});