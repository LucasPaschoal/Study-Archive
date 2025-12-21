const express = require("express");
const app = express();

app.use(
  express.urlencoded({
    extended: true,
  })
);

app.listen(3000);

app.get("/", (req, res) => {
  res.send(
    `<form action="/" method='POST'>
    Nome: <input type="text" name="nome">
    <button>Enviar form</Button>
    </form>
    `
  );
});

app.post("/", (req, res) => {
  console.log(req.body);
  res.send(`recebi seu nome ${req.body.nome}`);
});

app.get("/params", (req, res) => {
  // No id provided
  res.send("Nenhum id fornecido");
});

app.get("/params/:id", (req, res) => {
  console.log(req.params);
  res.send(req.params.id);
});

//querys sao o que eu digito na url da pagina depois da `?`.
app.get("/query", (req, res) => {
  console.log(req.query);
  res.send(req.query);
});
