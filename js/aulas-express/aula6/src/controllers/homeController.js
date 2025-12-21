exports.paginaInicial = (req, res) => {
    res.render('index');
}

exports.trataPost = (req, res) => {
    res.send(`Nome ${req.body.cliente} enviado com sucesso!`)
}


exports.meuMiddleware = (req, res, next) => {
    console.log('Passei aqui!');
    next();
}