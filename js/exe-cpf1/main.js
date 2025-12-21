let cpf = "705.484.450-52";
let clearCpf = cpf.replace(/\D+/g, '');
cpfArray = Array.from(clearCpf);
let first =  firstNumber(cpfArray);
let second = secundNumber(cpfArray, first);
console.log(verification(cpfArray, first, second));

function firstNumber(cpfArray) {
    let arrayResult = [];
    let cpfSize = cpfArray.length;
    let cpfCount = cpfArray.length - 1;
    for (let i = 0; i < cpfArray.length; i++ ){
        if (cpfCount > 1) {
            let result = cpfArray[i] * cpfCount;
            arrayResult.push(result);
        }
        cpfCount --;
    }
    let arrayReduce = arrayResult.reduce((ac, val) => ac + Number(val), 0);
    let result = cpfSize - (arrayReduce % cpfSize);
    return result > 9 ? 0 : result;
}

function secundNumber(cpfArray, first) {
    let arrayResult = [];
    cpfArray.push(first);
    let cpfSize = cpfArray.length - 1;
    let cpfCount = cpfArray.length - 1;
    for (let i = 0; i < cpfArray.length; i++ ){
        if (cpfCount > 1) {
            let result = cpfArray[i] * cpfCount;
            arrayResult.push(result);
        }
        cpfCount --;
    }
    let arrayReduce = arrayResult.reduce((ac, val) => ac + Number(val), 0);
    let result = cpfSize - (arrayReduce % cpfSize);
    return result > 9 ? 0 : result;
}

function verification(cpfArray, first, secund) {
    return (Number(cpfArray[cpfArray.length - 1]) === first && Number(cpfArray[cpfArray.length - 2]) === secund)
        ? "CPF validado"
        : "CPF invalido";
}
