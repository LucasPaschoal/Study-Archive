exports.paginaInicial = (req, res) => {
    res.render('index', {
        titulo: 'This is the title of <b>page</b>',
        numeros: [0, 1, 2, 3, 4, 5]
    });
    return
}

exports.trataPost = (req, res) => {
    res.send(req.body)
}


exports.meuMiddleware = (req, res, next) => {
    console.log('Passei aqui!');
    next();
}