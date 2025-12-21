function wait(msg, time) {
    return new Promise((resolve, reject) => {
        if (typeof(time) !== 'number'){
            reject('ERRO');
        }

        setTimeout(() => {
            resolve(msg);
        }, time);
    })
}


wait('Frase 1', 2000)
    .then(response => {
        console.log(response); 
        return wait('Frase 2', 1000);
    })
    .then(response => {
        console.log(response); 
        return wait('Frase 3', '123');
    })
    .then(response => {
        console.log(response); 
    })
    .catch(e => {
        console.log(e);
    });