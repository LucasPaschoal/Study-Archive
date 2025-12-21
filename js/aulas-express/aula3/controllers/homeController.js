exports.paginaInicial = (req, res) => {
    res.send(
    `<form action="/" method='POST'>
    Nome: <input type="text" name="nome">
    <button>Enviar form</Button>
    </form>
    `
  );
}

exports.trataPost = (req, res) => {
    res.send(`Nome ${req.body.nome} enviado com sucesso!`)
}