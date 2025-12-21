exports.paginaInicial = (req, res) => {
    res.render('index');
}

exports.trataPost = (req, res) => {
    res.send(`Nome ${req.body.nome} enviado com sucesso!`)
}