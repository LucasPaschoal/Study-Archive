const express = require('express');
const app = express();


app.get('/', (req, res) => {
    res.send(
    `<form actio="/" method='POST'>
    Nome: <input type="text" name="nome">
    <button>Enviar form</Button>
    </form>
    `
    );
});

app.post('/', (req, res) => {
    res.send('Form enviado!')
});

app.listen(3000);