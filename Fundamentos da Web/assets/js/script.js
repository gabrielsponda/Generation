/*
Maneiras de acessar o DOM:

- Por Tag: document.getElementsByTagName()
- Por Id: document.getElementById()
- Por Nome: document.getElementsByName()
- Por Classe: document.getElementsByClassName()
- Por Seletor: document.querySelector()
*/

let nome = document.getElementById('nome')
let email = document.querySelector('#email')
let mensagem = document.querySelector('#mensagem')
let nomeOk = false
let emailOk = false
let mensagemOk = false
let mapa = document.querySelector('#mapa')

function validaNome() {
    let txtNome = document.querySelector('#txtNome')

    if (nome.value.length < 3) {
        txtNome.innerHTML = 'Nome inválido!'
        txtNome.style.color = 'red'
        txtNome.style.paddingTop = '10px'
    } else {
        txtNome.innerHTML = ''
        nomeOk = true
    }
}

function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail')

    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txtEmail.innerHTML = 'E-mail inválido!'
        txtEmail.style.color = 'red'
        txtEmail.style.paddingTop = '10px'
    } else {
        txtEmail.innerHTML = ''
        emailOk = true
    }
}

function validaMensagem() {
    let txtMensagem = document.querySelector('#txtMensagem')

    if (mensagem.value.length > 100) {
        txtMensagem.innerHTML = 'Digite no máximo 100 caracteres.'
        txtMensagem.style.color = 'red'
        txtMensagem.style.paddingTop = '10px'
        txtMensagem.style.display = 'block'
    } else {
        txtMensagem.style.display = 'none'
        mensagemOk = true
    }
}

function enviar() {

    if (nomeOk == true && emailOk == true && mensagemOk == true) {
        alert('Formulário enviado com sucesso!')
    } else {
        alert('Preencha o formulário corretamente!')
    }
}

function mapaZoom() {
    mapa.style.width = '800px'
    mapa.style.height = '600px'
}

function mapaNormal() {
    mapa.style.width = '300px'
    mapa.style.height = '225px'
}
